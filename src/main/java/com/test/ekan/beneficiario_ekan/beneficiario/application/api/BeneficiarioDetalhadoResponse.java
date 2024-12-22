package com.test.ekan.beneficiario_ekan.beneficiario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.beneficiario.domain.Beneficiario;

import lombok.Value;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nomeBeneficiario;
    private String telefone;
    private LocalDate dataDeNascimento;
    private LocalDateTime dataDeInclusao;
    private LocalDateTime dataDeAtualizacao;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeBeneficiario = beneficiario.getNomeBeneficiario();
        this.telefone = beneficiario.getTelefone();
        this.dataDeNascimento = beneficiario.getDataDeNascimento();
        this.dataDeInclusao = beneficiario.getDataDeInclusao();
        this.dataDeAtualizacao = beneficiario.getDataDeAtualizacao();
    }
}
