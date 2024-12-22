package com.test.ekan.beneficiario_ekan.application.service;

import java.util.List;
import java.util.UUID;

import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioAlteracaoRequest;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioDetalhadoResponse;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioListResponse;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioRequest;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioResponse;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    BeneficiarioDetalhadoResponse buscaBeneficiarioId(UUID idBeneficiario);

    List<BeneficiarioListResponse> buscaTodosBeneficiarios();

    void deletaBeneficiarioAtravezId(UUID idBeneficiario);

    void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);


}
