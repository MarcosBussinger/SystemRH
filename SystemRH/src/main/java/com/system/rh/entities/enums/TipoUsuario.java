package com.system.rh.entities.enums;

public enum TipoUsuario {
    
    EMPRESA(1, "Empresa"),
    CANDIDATO(2, "Candidato"),
    ADMINISTRADOR(3, "Administrador");

    private final int code;
    private final String description;

    TipoUsuario(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
