package com.trustee.service;

import com.trustee.exception.UnauthorizedException;
import com.trustee.model.dto.TokenLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MasterService {
    private final RestTemplate restTemplate;

    public TokenLogDto getTokenLogFromMaster(Integer tokenLogId, String tokenLogUrl) {
        HttpHeaders headers = new HttpHeaders();
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(tokenLogUrl)
                .queryParamIfPresent("tokenLogId", Optional.ofNullable(tokenLogId));

        URI uri = uriBuilder.build().toUri();

        try {
            HttpEntity<String> requestEntity = new HttpEntity<>(headers);
            ResponseEntity<TokenLogDto> response = restTemplate.exchange(uri, HttpMethod.GET, requestEntity,
                    TokenLogDto.class);

            return response.getBody();
        } catch (Exception e) {
            throw new UnauthorizedException("Unauthorized");
        }
    }
}
