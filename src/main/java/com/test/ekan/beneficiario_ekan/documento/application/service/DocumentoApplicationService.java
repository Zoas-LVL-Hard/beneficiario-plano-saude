package com.test.ekan.beneficiario_ekan.documento.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoRequest;
import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService{

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[Inicia] DocumentoApplicationService - criaDocumento");
        log.info("[Finaliza] DocumentoApplicationService - criaDocumento");
        return null;
    }

}
