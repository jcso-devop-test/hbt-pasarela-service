package com.hbt.pasarela.servicios.client;

import com.hbt.pasarela.servicios.model.PersonaData;
import com.hbt.pasarela.servicios.model.ResponseDataAPI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "rest-client", url = "https://pruebas.gestora.bo/servicios/persona/api/v1")
public interface CallRestClient {

    @PostMapping(value = "/consulta",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseDataAPI getPersona(@RequestBody PersonaData personaData,
                               @RequestHeader(HttpHeaders.AUTHORIZATION) String token);

}
