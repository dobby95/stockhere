package com.stock.stockhere.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String money;

}
