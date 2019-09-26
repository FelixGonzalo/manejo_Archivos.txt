/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.ArchivoTxt;

/**
 *
 * @author Fekilo
 */
public class Main {
    public static void main (String [] args) {
        ArchivoTxt archivo = new ArchivoTxt();
        String direccion = "misArchivos\\miArchivo.txt";
        System.out.println(archivo.leerTxt(direccion));
        archivo.crearArchivoTxt(direccion);
        archivo.escribirTxt(direccion, "Escribiendo en el archivo creado");
        
    }
}
