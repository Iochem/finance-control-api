package com.bre.financecontrolapi.entity;

import com.bre.financecontrolapi.enums.*;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lancamentos_user")
public class LancamentoEntity {
    //Vai conter a chave estrangeira
    @Id
    private long id;

    //Salva no banco de dados esse enum como texto e não com número(que é padrão)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private LocalDate data; // data do lançamento (usar para agrupar por mês)
    private BigDecimal valor;//o BigDecimal oferece maior precisão

    //Ainda vai ter a ligação entre as entidades
    //o banco de dados de lançamentos vai ter como parâmetro o id do financeiro

}
