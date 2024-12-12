package com.test.ekan.beneficiario_ekan.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    //private final BeneficiarioService beneficiarioCriado;

    @Override
    public BeneficiarioResponse postBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest) {
        log.info("[Inicia] BeneficiarioController - postBeneficiario");
        log.info("[Finaliza] BeneficiarioController - postBeneficiario");
        return null;
    }

}
