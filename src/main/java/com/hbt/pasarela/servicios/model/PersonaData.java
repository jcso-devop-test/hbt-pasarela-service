package com.hbt.pasarela.servicios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaData {

    private String tipoProceso;
    private String matricula;
    private String tipoDocumento;
    private String nroDocumento;
    private String complemento;
    private String fechaNacimiento;
    private String primerApellido;
    private String segundoApellido;
    private String nombres;

}
