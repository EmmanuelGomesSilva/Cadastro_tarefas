package com.emmanuel.model;

// Define os possíveis status de uma tarefa
public enum Status {
    ABERTA,
    CONCLUIDA;

    // Converte string para Status, ignorando acentos e maiúsculas
    public static Status fromString(String str) {
        str = str.toUpperCase().replace("Á", "A");
        return Status.valueOf(str);
    }
}
