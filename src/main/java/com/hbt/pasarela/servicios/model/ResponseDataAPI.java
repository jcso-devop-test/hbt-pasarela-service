package com.hbt.pasarela.servicios.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDataAPI {

    private String payload;
    private DataSignature signature;
}
