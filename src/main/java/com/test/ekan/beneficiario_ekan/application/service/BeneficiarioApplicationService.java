package com.test.ekan.beneficiario_ekan.application.service;

import org.springframework.stereotype.Service;

import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioRequest;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[Inicia] BeneficiarioApplicationService - criaBeneficiario");
        log.info("[Finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return null;
    }

}
