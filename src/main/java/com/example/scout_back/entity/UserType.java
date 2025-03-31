package com.example.scout_back.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;
}
