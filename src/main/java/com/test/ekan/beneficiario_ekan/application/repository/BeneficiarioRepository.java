package com.test.ekan.beneficiario_ekan.application.repository;

import java.util.UUID;

import com.test.ekan.beneficiario_ekan.domain.Beneficiario;

public interface BeneficiarioRepository {

    Beneficiario salva(Beneficiario beneficiario);

    Beneficiario buscaBeneficiarioId(UUID idBeneficiario);

}
