package com.trustee.service;

import com.trustee.common.utils.ClassUtil;
import com.trustee.model.Trustee;
import com.trustee.model.dto.TrusteeDto;
import com.trustee.repository.TrusteeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrusteeService {

    private final TrusteeRepository trusteeRepository;


    public List<TrusteeDto> getAllTrustees() {
        List<Trustee> trustee = trusteeRepository.findAllByOrderByTrusteeNameAsc();

        return trustee.stream().map(t -> {
            return ClassUtil.convert(t, TrusteeDto.class);
        }).collect(Collectors.toList());
    }
    }
