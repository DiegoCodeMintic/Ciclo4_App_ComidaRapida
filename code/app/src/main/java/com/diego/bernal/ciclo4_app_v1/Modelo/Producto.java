package com.diego.bernal.ciclo4_app_v1.Modelo;

import android.media.Image;

public class Producto {
    private final String imagen;
    private final String precio;

    public Producto(String imagen, String precio) {
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public String getPrecio() {
        return precio;
    }
}
