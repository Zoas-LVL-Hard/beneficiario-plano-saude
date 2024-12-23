package com.test.ekan.beneficiario_ekan.documento.domain;

import java.time.LocalDateTime;

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
@Table(name = "documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocumento", updatable = false, unique = true, nullable = false)
    private Long idDocumento;
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String descricao;
    private LocalDateTime dataDeInclusao;
    private LocalDateTime dataDeAtualizacao;
}
