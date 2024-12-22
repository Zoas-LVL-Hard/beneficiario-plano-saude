package com.test.ekan.beneficiario_ekan.beneficiario.application.api;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class BeneficiarioRequest {
    @NotBlank
    private String nomeBeneficiario;
    @NotBlank
    private String telefone;
    private LocalDate dataDeNascimento;
}
