package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient {

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        // In this case we are returning null because if Cards microservice is not responding atleast
        // account and loans information is sent without any information of cards rather than Spring sending a complete
        // exception with no information of any microservice.
        return null;
    }
}
