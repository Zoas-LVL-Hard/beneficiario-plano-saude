package com.test.ekan.beneficiario_ekan.application.api;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class BeneficiarioAlteracaoRequest {
    private UUID idBeneficiario;
    @NotBlank
    private String nomeBeneficiario;
    @NotBlank
    private String telefone;
    private LocalDate dataDeNascimento;
}
