package com.test.ekan.beneficiario_ekan.documento.application.service;

import java.util.List;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoListResponse;
import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoRequest;
import com.test.ekan.beneficiario_ekan.documento.application.api.DocumentoResponse;

public interface DocumentoService {

    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    List<DocumentoListResponse> buscaTodosDocumentos(UUID idBeneficiario);

}
