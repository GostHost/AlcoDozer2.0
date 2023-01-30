package com.example.AlcoDozer20.entity;

import jakarta.persistence.*;

@Entity

public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double strength;

    public Drink() {
    }

    public Drink(Long id, String name, double strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public Drink(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
