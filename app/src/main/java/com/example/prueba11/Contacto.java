package com.example.prueba11;

public class Contacto {

private String nombre;
private int foto;



    private int TextNumeroP;

    public Contacto(int textNumeroP) {
        TextNumeroP = textNumeroP;
    }

    public Contacto(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


    public int getTextNumeroP() {
        return TextNumeroP;
    }

    public void setTextNumeroP(int textNumeroP) {
        TextNumeroP = textNumeroP;
    }
}
