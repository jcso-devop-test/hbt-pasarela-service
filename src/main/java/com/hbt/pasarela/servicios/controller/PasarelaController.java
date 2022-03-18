package com.hbt.pasarela.servicios.controller;

import com.hbt.pasarela.servicios.client.CallRestClient;
import com.hbt.pasarela.servicios.model.PersonaData;
import com.hbt.pasarela.servicios.model.ResponseDataAPI;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class PasarelaController {

    @Autowired
    CallRestClient restClient;

    @PostMapping("/persona")
    public ResponseEntity<?> getPersona(@RequestBody PersonaData personaData,
                                        @RequestHeader(HttpHeaders.AUTHORIZATION) String token){
        try {
            log.info("Datos " + token);
            ResponseDataAPI responseDataAPI = restClient.getPersona(personaData, token);
            return ResponseEntity.ok(responseDataAPI);
        }catch (FeignException.FeignClientException fc){
            log.error("Error: " +  fc.getLocalizedMessage());
            return ResponseEntity.badRequest().build();
        }
    }

}
