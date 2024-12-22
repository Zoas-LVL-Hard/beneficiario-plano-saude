package com.test.ekan.beneficiario_ekan.beneficiario.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioListResponse;
import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioRequest;
import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioResponse;
import com.test.ekan.beneficiario_ekan.beneficiario.application.repository.BeneficiarioRepository;
import com.test.ekan.beneficiario_ekan.beneficiario.domain.Beneficiario;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[Inicia] BeneficiarioApplicationService - criaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
        log.info("[Finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();

    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioId(UUID idBeneficiario) {
        log.info("[Inicia] BeneficiarioApplicationService - buscaBeneficiarioId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioId(idBeneficiario);
        log.info("[Finaliza] BeneficiarioApplicationService - buscaBeneficiarioId");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
        log.info("[Inicia] BeneficiarioApplicationService - buscaTodosBeneficiarios");
        List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodos();
        log.info("[Finaliza] BeneficiarioApplicationService - buscaTodosBeneficiarios");
        return BeneficiarioListResponse.converte(beneficiarios);
    }

    @Override
    public void deletaBeneficiarioAtravezId(UUID idBeneficiario) {
        log.info("[Inicia] BeneficiarioApplicationService - deletaBeneficiarioAtravezId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioId(idBeneficiario);
        beneficiarioRepository.deletaBeneficiarioAtravezId(beneficiario);
        log.info("[Finaliza] BeneficiarioApplicationService - deletaBeneficiarioAtravezId");

    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[Inicia] BeneficiarioApplicationService - patchAlteraBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioId(idBeneficiario);
        beneficiario.altera(beneficiarioAlteracaoRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[Finaliza] BeneficiarioApplicationService - patchAlteraBeneficiario");

    }
}
