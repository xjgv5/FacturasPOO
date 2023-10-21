package com.xjgv.appfacturas;

import com.xjgv.appfacturas.modelo.Cliente;
import com.xjgv.appfacturas.modelo.Factura;
import com.xjgv.appfacturas.modelo.ItemFactura;
import com.xjgv.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("55555-5");
        cliente.setNombre("Andres");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto n° " + producto.getCodigo() + " : ");
            nombre = sc.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio : ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad : ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}