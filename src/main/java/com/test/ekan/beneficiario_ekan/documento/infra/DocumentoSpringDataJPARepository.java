package com.test.ekan.beneficiario_ekan.documento.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.ekan.beneficiario_ekan.documento.domain.Documento;

public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento, Long> {

}
