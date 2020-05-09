package com.example.heroku.Entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="tbl_address")
public class HomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String village;
    private String commune;
    private String districts;
    private String city;
}
