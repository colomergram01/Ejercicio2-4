package com.example.ejercicio2_4.config;


public class PersonasFirm {
    private String descripcion;
    private byte[]  image;

    public PersonasFirm() {
    }

    public PersonasFirm(String descripcion, byte[] image) {
        this.descripcion = descripcion;
        this.image = image;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}