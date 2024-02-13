package com.gbw.kbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BurgersIngredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int burgerID;
    private int ingredientID;
}
