package com.test.ekan.beneficiario_ekan.documento.infra;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.test.ekan.beneficiario_ekan.documento.application.repository.DocumentoRepository;
import com.test.ekan.beneficiario_ekan.documento.domain.Documento;
import com.test.ekan.beneficiario_ekan.handler.APIException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository{
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[Inicia] DocumentoInfraRepository - salvaDocumento");
        try {
            documentoSpringDataJPARepository.save(documento);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Documento já cadastrado!");
        }
        log.info("[Finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }

}
