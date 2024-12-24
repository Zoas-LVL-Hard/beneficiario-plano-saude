package com.test.ekan.beneficiario_ekan.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoRequest {
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String descricao;
}
