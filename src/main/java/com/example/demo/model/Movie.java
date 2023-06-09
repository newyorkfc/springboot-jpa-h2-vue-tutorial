package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Movies")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String producer;

}
