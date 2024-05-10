package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient {

    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        // In this case we are returning null because if Loans microservice is not responding atleast
        // account and cards information is sent without any information of loans rather than Spring sending a complete
        // exception with no information of any microservice.
        return null;
    }
}
