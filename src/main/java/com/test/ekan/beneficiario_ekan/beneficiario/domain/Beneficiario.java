package com.test.ekan.beneficiario_ekan.beneficiario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import com.test.ekan.beneficiario_ekan.beneficiario.application.api.BeneficiarioRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@Entity
@Table(name = "beneficiario")
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idBeneficiario", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    private String nomeBeneficiario;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    private LocalDate dataDeNascimento;
    private LocalDateTime dataDeInclusao;
    private LocalDateTime dataDeAtualizacao;

    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
        this.nomeBeneficiario = beneficiarioRequest.getNomeBeneficiario();
        this.telefone = beneficiarioRequest.getTelefone();
        this.dataDeNascimento = beneficiarioRequest.getDataDeNascimento();
        this.dataDeInclusao = LocalDateTime.now();
        this.dataDeAtualizacao = LocalDateTime.now();
    }

    public void altera(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        this.nomeBeneficiario = beneficiarioAlteracaoRequest.getNomeBeneficiario();
        this.telefone = beneficiarioAlteracaoRequest.getTelefone();
        this.dataDeNascimento = beneficiarioAlteracaoRequest.getDataDeNascimento();
    }
}
