package com.test.ekan.beneficiario_ekan.documento.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.test.ekan.beneficiario_ekan.documento.domain.Documento;

import lombok.Value;

@JsonInclude(JsonInclude.Include.NON_NULL)
//Essa anotação serve para evitar que valores nullos apareçam no json, ou seja, que apareçam lá no postman.
@Value
public class DocumentoListResponse {
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataDeInclusao;
    private LocalDateTime dataDeAtualizacao;

    public DocumentoListResponse(Documento documento) {
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataDeInclusao = documento.getDataDeInclusao();
        this.dataDeAtualizacao = documento.getDataDeAtualizacao();
    }

    public static List<DocumentoListResponse> converte(List<Documento> documentos) {
        return documentos.stream()
                .map(DocumentoListResponse::new)
                .collect(Collectors.toList());
    }

}
