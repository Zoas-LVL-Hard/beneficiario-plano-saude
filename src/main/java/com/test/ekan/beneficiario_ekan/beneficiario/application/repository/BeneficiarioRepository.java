package com.test.ekan.beneficiario_ekan.beneficiario.application.repository;

import java.util.List;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {

    Beneficiario salva(Beneficiario beneficiario);

    Beneficiario buscaBeneficiarioId(UUID idBeneficiario);

    List<Beneficiario> buscaTodos();

    void deletaBeneficiarioAtravezId(Beneficiario beneficiario);

}
