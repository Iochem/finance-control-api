package com.bre.financecontrolapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@Getter -Gera automaticamente os métodos get para todos os atributos.
@Setter - Gera automaticamente os métodos set para todos os atributos.
@NoArgsConstructor — gera um construtor sem argumentos. obrigatório no JPA
@AllArgsConstructor — gera um construtor com todos os campos como parâmetros.
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario_lancamento")
public class UsuarioEntity {

    @Id
    //Indica que o id será gerado automaticamente pelo banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Informa que esse campo não pode ser nulo
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)//unique = true - não ter usuário repetido
    private String login;

    //Informa que esse campo não pode ser nulo
    @Column(nullable = false)
    private String senha;

}
