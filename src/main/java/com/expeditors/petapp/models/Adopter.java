package com.expeditors.petapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Adopter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @OneToMany(mappedBy="adopter")
    private Set<Pet> pets;

    public record AdoptionBasicData(String adopterName, String petName) { }
}
