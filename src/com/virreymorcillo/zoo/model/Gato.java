package com.virreymorcillo.zoo.model;

public class Gato extends Animal implements Pet {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println(nombre + " hace: ¡Miau, miau!");
    }

    @Override
    public void play() {
        System.out.println(nombre + " juega persiguiendo un láser por toda la habitación.");
    }
}