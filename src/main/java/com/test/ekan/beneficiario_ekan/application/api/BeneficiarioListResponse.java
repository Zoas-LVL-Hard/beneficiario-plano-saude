package com.test.ekan.beneficiario_ekan.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.test.ekan.beneficiario_ekan.domain.Beneficiario;

import lombok.Value;

@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeBeneficiario;
    private String telefone;
    private LocalDate dataDeNascimento;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return beneficiarios.stream()
                .map(BeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public BeneficiarioListResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeBeneficiario = beneficiario.getNomeBeneficiario();
        this.telefone = beneficiario.getTelefone();
        this.dataDeNascimento = beneficiario.getDataDeNascimento();
    }
}
