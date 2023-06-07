package com.softtek.examen.modelo;

public class Factura implements Producto {

    private double precio;
    private String nombre;

    public Factura(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularFactura() {
        double total = (precio * 100) / 21;
        return total;
    }
    public double ivareducido(){
        double totalreducido = (precio * 100) / 4;
        return totalreducido;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
