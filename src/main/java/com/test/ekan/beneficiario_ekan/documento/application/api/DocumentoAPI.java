package com.test.ekan.beneficiario_ekan.documento.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario, @Valid @RequestBody DocumentoRequest documentoRequest);
    
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    List<DocumentoListResponse> getTodosDocumentos(@PathVariable UUID idBeneficiario);
    
}
