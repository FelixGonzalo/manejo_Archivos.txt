package clases;

import java.io.*;

/**
 *
 * @author Fekilo
 */
public class ArchivoTxt {

    public String leerTxt(String direccion) {
        String texto = "";
        File archivo = new File(direccion);
        try {
            FileReader lectorArchivo = new FileReader(archivo);
            BufferedReader almacenamiento = new BufferedReader(lectorArchivo);
            String linea;
            while ((linea = almacenamiento.readLine()) != null) {
                texto = texto + linea;
            }
            almacenamiento.close();
            lectorArchivo.close();
        } catch (Exception e) {
            System.out.println("Error al leer: " + e);
        }
        return texto;
    }

    public void rescribirTxt(String direccion, String texto) {
        File archivo = new File(direccion);
        try {
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(texto);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al rescribir : " + e);
        }
    }//se cambia el texto del archivo 

    public void escribirTxt(String direccion, String texto) {
        File archivo = new File(direccion);
        try {
            FileWriter escritorArchivo = new FileWriter(archivo, true);//si tiene true, escribe al final del texto
            PrintWriter escribir = new PrintWriter(escritorArchivo);
            escribir.println(texto);
            escribir.close();
            escritorArchivo.close();
        } catch (Exception e) {
            System.out.println("Error al escribir: " + e);
        }
    }//añadimos texto al final del archivo

    public void crearArchivoTxt(String direccion) {
        File archivo = new File(direccion);
        if (archivo.exists()) {
            System.out.println("El archivo ya existe!!");
        } else {
            try {
                archivo.createNewFile();
                System.out.println("Archivo creado en la dirección: " + direccion);
            } catch (Exception e) {
                System.out.println("Error al crear archivo: " + e);
            }
        }
        archivo = null;
    } //direccion debe contener: el nombre del archivo y su extensión.
    
    public void eliminarArchivoTxt(String direccion) {
        File archivo = new File(direccion);
        if (archivo.exists()) {
            try {
                archivo.delete();
                System.out.println("Archivo eliminado en la dirección: " + direccion);
            } catch (Exception e) {
                System.out.println("Error al eliminar archivo: " + e);
            }
        } else {
            System.out.println("El archivo no existe!!");
        }
        archivo = null;
    } //direccion debe contener: el nombre del archivo y su extensión.
    

}
