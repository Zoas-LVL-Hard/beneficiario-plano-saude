package com.test.ekan.beneficiario_ekan.documento.infra;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Documento> buscaDocumentos(UUID idBeneficiario) {
        log.info("[Inicia] DocumentoInfraRepository - buscaDocumentos");
        var documento = documentoSpringDataJPARepository.findByIdProprietario(idBeneficiario);
        log.info("[Finaliza] DocumentoInfraRepository - buscaDocumentos");
        return documento;
    }

}
