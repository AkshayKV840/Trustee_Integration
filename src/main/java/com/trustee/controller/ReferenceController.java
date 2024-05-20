package com.trustee.controller;

import com.trustee.exception.ApiException;
import com.trustee.model.dto.TrusteeDto;
import com.trustee.security.Token;
import com.trustee.security.TokenService;
import com.trustee.service.TrusteeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/reference")
@RequiredArgsConstructor
public class ReferenceController {

    private final TrusteeService trusteeService;
    private final TokenService tokenService;


    @GetMapping("/trustee")
    public List<TrusteeDto> getTrustees(HttpServletRequest request) {
        try {
            Token token = tokenService.verifyJwt(request);
            return trusteeService.getAllTrustees();
        }catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }
    }

