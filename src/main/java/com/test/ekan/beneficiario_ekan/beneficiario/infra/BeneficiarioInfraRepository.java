package com.test.ekan.beneficiario_ekan.beneficiario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.test.ekan.beneficiario_ekan.beneficiario.application.repository.BeneficiarioRepository;
import com.test.ekan.beneficiario_ekan.beneficiario.domain.Beneficiario;
import com.test.ekan.beneficiario_ekan.handler.APIException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataRepository beneficiarioSpringDataRepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[Inicia] BeneficiarioInfraRepository - salva");
        try {
            beneficiarioSpringDataRepository.save(beneficiario);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Cliente já existe!");
        }
        log.info("[Finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public Beneficiario buscaBeneficiarioId(UUID idBeneficiario) {
        log.info("[Inicia] BeneficiarioInfraRepository - buscaBeneficiarioId");
        Beneficiario beneficiario = beneficiarioSpringDataRepository
                .findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiário não encontrado!"));
        log.info("[Finaliza] BeneficiarioInfraRepository - buscaBeneficiarioId");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTodos() {
        log.info("[Inicia] BeneficiarioInfraRepository - buscaTodos");
        if (beneficiarioSpringDataRepository.count() == 0) {
            throw APIException.build(HttpStatus.NOT_FOUND, "Nenhum beneficiário encontrado!");
        } 
        List<Beneficiario> beneficiarios = beneficiarioSpringDataRepository.findAll();
        log.info("[Finaliza] BeneficiarioInfraRepository - buscaTodos");
        return beneficiarios;
        
    }

    @Override
    public void deletaBeneficiarioAtravezId(Beneficiario beneficiario) {
        log.info("[Inicia] BeneficiarioInfraRepository - deletaBeneficiarioAtravezId");
        beneficiarioSpringDataRepository.delete(beneficiario);
        log.info("[Finaliza] BeneficiarioInfraRepository - deletaBeneficiarioAtravezId");

    }

}
