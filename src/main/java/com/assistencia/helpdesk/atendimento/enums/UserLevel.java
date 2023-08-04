package com.assistencia.helpdesk.atendimento.enums;

public enum UserLevel {
   ADMIN (0),
    GERENTE (1),
    VENDEDOR (2),
    TECNICO (3);


    private Integer codigo;



    UserLevel(Integer codigo) {
        this.codigo = codigo;
    }
}
