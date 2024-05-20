package com.trustee.security;

import com.trustee.exception.ApiException;
import com.trustee.exception.UnauthorizedException;
import com.trustee.model.dto.TokenLogDto;
import com.trustee.service.MasterService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TokenService {

    @Autowired
    private MasterService masterService;

    @Value("${security.jwt.authUrl}")
    private String authUrl;

    @Value("${security.jwt.header}")
    private String header;

    @Value("${security.jwt.prefix}")
    private String prefix;

    @Value("${security.jwt.secret}")
    private String secret;

    @Value("${security.jwt.expiration}")
    private Long expiration;

    @Value("${master.tokenLog}")
    private String tokenLogUrl;

    public TokenService() {
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public String getHeader() {
        return header;
    }

    public String getPrefix() {
        return prefix;
    }

    public Token verifyJwt(String token) {
        try {

            Claims claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            Token tokenBody = new Token();
            tokenBody.setSub(claims.getSubject());
            tokenBody.setUserId((String) claims.get("userId"));
            tokenBody.setUserName((String) claims.get("userName"));
            tokenBody.setEmail((String) claims.get("email"));
            tokenBody.setUserType(claims.get("userType").toString());

            tokenBody.setTokenLogId((int) claims.get("tokenLogId"));
            TokenLogDto ol = masterService.getTokenLogFromMaster(tokenBody.getTokenLogId(), tokenLogUrl);
            if (ol.getIsValid() != 1) {
                throw new UnauthorizedException("unauthorized");
            }
            return tokenBody;
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }

    }

    public String getToken(HttpServletRequest request) {
        // 1. get the authentication header. Tokens are supposed to be passed in the
        // authentication header
        String header = request.getHeader((getHeader()));
        // 2. validate the header and check the prefix
        if (header == null || !header.startsWith(getPrefix())) {
            throw new ApiException("Invalid header");
        }

        // 3. Get the token
        String token = header.replace(getPrefix(), "");
        return token;
    }

    public Token verifyJwt(HttpServletRequest request) {
        String token = getToken(request);
        return verifyJwt(token);
    }


}
