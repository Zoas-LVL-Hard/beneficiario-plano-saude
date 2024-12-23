package com.test.ekan.beneficiario_ekan.documento.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable Long idDocumento, @Valid @RequestBody DocumentoRequest documentoRequest);
    
    
}
