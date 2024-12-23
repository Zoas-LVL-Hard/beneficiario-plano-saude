package com.test.ekan.beneficiario_ekan.documento.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.test.ekan.beneficiario_ekan.beneficiario.application.service.BeneficiarioService;
import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoRequest;
import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoResponse;
import com.test.ekan.beneficiario_ekan.documento.application.repository.DocumentoRepository;
import com.test.ekan.beneficiario_ekan.documento.domain.Documento;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService{
    private final DocumentoRepository documentoRepository;
    private final BeneficiarioService beneficiarioService;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[Inicia] DocumentoApplicationService - criaDocumento");
        beneficiarioService.buscaBeneficiarioId(idBeneficiario);
        Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
        log.info("[Finaliza] DocumentoApplicationService - criaDocumento");
        return new DocumentoResponse(documento.getIdDocumento());
    }

}
