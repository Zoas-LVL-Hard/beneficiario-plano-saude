package com.test.ekan.beneficiario_ekan.application.api;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping("/{idBeneficiario}")
    @ResponseStatus(HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioId(@PathVariable UUID idBeneficiario);

        
}
