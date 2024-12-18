package com.test.ekan.beneficiario_ekan.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.ekan.beneficiario_ekan.domain.Beneficiario;

public interface BeneficiarioSpringDataRepository extends JpaRepository <Beneficiario, UUID> {

}
