package com.bre.financecontrolapi.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClientEntity {
    //@Id
    private Long id;
    private String name;
    private string login;
    private String email;
    private String password;

}

