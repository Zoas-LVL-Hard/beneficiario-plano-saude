package com.test.ekan.beneficiario_ekan.beneficiario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BeneficiarioResponse {
    private UUID idBeneficiario;
}
