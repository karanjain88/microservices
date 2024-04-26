package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

// Logical name of the microservice used to register with the Eureka server
//@FeignClient("cards")
@FeignClient(name = "cards", fallback = CardsFallback.class)
public interface CardsFeignClient {

    // This method signature should be similar to that in CardsController(
    // you can use any method name here, but rest should be same). Ultimately this will call that CardsController method only.
    @GetMapping(value = "/api/fetch", consumes = "application/json")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("eazybank-correlation-id") String correlationId,
                                                     @RequestParam String mobileNumber);
}
