package com.bre.financecontrolapi.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

public enum Categoria {
    ALIMENTACAO("Alimentação"),
    SAUDE("Saúde"),
    MORADIA("Moradia"),
    TRANSPORTE("Transporte"),
    EDUCACAO("Educação"),
    LAZER("Lazer"),
    IMPREVISTOS("Imprevistos"),
    OUTRAS("Outras");

    private final String descricaoCategoria;
}
