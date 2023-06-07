package com.softtek.examen.presentacion;

import com.softtek.examen.modelo.Factura;

public class MainFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("Producto 1", 100.0);
        double totalFactura = factura.calcularFactura();
        System.out.println("Total de la factura: " + totalFactura);
        Factura factura1 = new Factura("Producto 1",100);
        double totalFactura1 =factura1.ivareducido();
        System.out.println("Total de la factura reducida: " +totalFactura1);

    }
}
