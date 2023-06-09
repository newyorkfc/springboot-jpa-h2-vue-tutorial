package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Members")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

}
