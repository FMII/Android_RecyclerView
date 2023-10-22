package com.example.practica_recyclerview.Models;

public class JujutsuKaisen extends Anime {
    private String nombre;
    private String edad;
    private Habilidades habilidades;
    private Especie especie;


    public JujutsuKaisen(String nombre, String edad, Habilidades habilidades, Especie especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidades = habilidades;
        this.especie = especie;
    }
    public String getPersonaje() {
        return nombre;
    }

    public void setPersonaje(String personaje) {
        this.nombre = personaje;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
