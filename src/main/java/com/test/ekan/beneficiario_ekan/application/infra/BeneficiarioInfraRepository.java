package com.test.ekan.beneficiario_ekan.application.infra;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.test.ekan.beneficiario_ekan.application.repository.BeneficiarioRepository;
import com.test.ekan.beneficiario_ekan.domain.Beneficiario;
import com.test.ekan.beneficiario_ekan.handler.APIException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository{
    private final BeneficiarioSpringDataRepository beneficiarioSpringDataRepository;
    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[Inicia] BeneficiarioInfraRepository - salva");
        try{
            beneficiarioSpringDataRepository.save(beneficiario);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Cliente já existe!", e);
        }
        log.info("[Finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

}
