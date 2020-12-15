package com.stock.stockhere.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String pwd;

    private String name;

    private int authority;

    @CreationTimestamp
    private LocalDateTime signDate;

    @UpdateTimestamp
    private LocalDateTime modiDate;

    private String email;

    private String verifyNo;

}
