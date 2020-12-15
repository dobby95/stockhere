package com.stock.stockhere.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sTableNo;

    private String companyId;

    private String memberId;

    private String totalPrice;

    private String cnt;
}
