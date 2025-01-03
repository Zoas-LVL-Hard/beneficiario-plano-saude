package com.test.ekan.beneficiario_ekan.beneficiario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.test.ekan.beneficiario_ekan.beneficiario.application.service.BeneficiarioService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(@Valid BeneficiarioRequest beneficiarioRequest) {
        log.info("[Inicia] BeneficiarioController - postBeneficiario");
        BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[Finaliza] BeneficiarioController - postBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiarioId(UUID idBeneficiario) {
        log.info("[Inicia] BeneficiarioController - getBeneficiarioId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiarioId(idBeneficiario);
        log.info("[Finaliza] BeneficiarioController - getBeneficiarioId");
        return beneficiarioDetalhado;
    }

    @Override
    public List<BeneficiarioListResponse> getTodosBeneficiarios() {
        log.info("[Inicia] BeneficiarioController - getTodosBeneficiarios");
        List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
        log.info("[Finaliza] BeneficiarioController - getTodosBeneficiarios");
        return beneficiarios;

    }

    @Override
    public void deletaBeneficiario(UUID idBeneficiario) {
        log.info("[Inicia] BeneficiarioController - deletaBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.deletaBeneficiarioAtravezId(idBeneficiario);
        log.info("[Finaliza] BeneficiarioController - deletaBeneficiario");

    }

    @Override
    public void pathcAtualizaBeneficiario(UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[Inicia] BeneficiarioController - pathcAtualizaBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.patchAlteraBeneficiario(idBeneficiario, beneficiarioAlteracaoRequest);
        log.info("[Finaliza] BeneficiarioController - pathcAtualizaBeneficiario");

    }

}
