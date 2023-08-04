package com.example.vengaamipueblo3.moldes;

public class MoldeSitios {

    private String precio;

    private int foto;

    private String nombre;

    public MoldeSitios(String precio, int foto, String nombre) {
        this.precio = precio;
        this.foto = foto;
        this.nombre = nombre;
    }

    public MoldeSitios() {
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}