package com.test.ekan.beneficiario_ekan.application.service;

import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioRequest;
import com.test.ekan.beneficiario_ekan.application.api.BeneficiarioResponse;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

}
