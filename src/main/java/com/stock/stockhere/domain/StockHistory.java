package com.stock.stockhere.domain;

import lombok.Data;
import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "StockHistory")
public class StockHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockNo;

    private String companyId;

    private String gubun;

    private String buyPrice;

    private String sellPrice;

    private String cnt;

    @CreationTimestamp
    private LocalDateTime time;
}
