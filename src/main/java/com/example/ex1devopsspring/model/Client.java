package com.example.ex1devopsspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {

        @Id
        @GeneratedValue
        @Column(name = "id")
        private Integer id;

        @Column(name = "nom")
        private String nom;

        @Column(name = "prenom")
        private String prenom;

        @Embedded
        private Adresse adresse;

        @Column(name = "mail")
        private String mail;

        @Column(name = "numTel")
        private String numTel;


}
