package com.test.ekan.beneficiario_ekan.documento.application.repository;

import java.util.List;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.documento.domain.Documento;

public interface DocumentoRepository {

    Documento salvaDocumento(Documento documento);

    List<Documento> buscaDocumentos(UUID idBeneficiario);

}
