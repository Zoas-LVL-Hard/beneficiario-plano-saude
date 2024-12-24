package com.test.ekan.beneficiario_ekan.documento.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.test.ekan.beneficiario_ekan.documento.application.service.DocumentoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
        log.info("[Inicia] DocumentoController - postDocumento");
        log.info("[idCliente] {}", idBeneficiario);
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[Finaliza] DocumentoController - postDocumento");
        return documento;
    }

    @Override
    public List<DocumentoListResponse> getTodosDocumentos(UUID idBeneficiario) {
        log.info("[Inicia] DocumentoController - getTodosDocumentos");
        List<DocumentoListResponse> documentosBeneficiario = documentoService.buscaTodosDocumentos(idBeneficiario);
        log.info("[Finaliza] DocumentoController - getTodosDocumentos");
        return documentosBeneficiario;
    }

}
