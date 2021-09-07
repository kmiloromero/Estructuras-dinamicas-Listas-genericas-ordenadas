/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Romero
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
            String path = "C:\\Users\\secar\\Downloads";
            ArrayList lista;
            ArrayList Archivo = lista;
            escribirArchivo = new FileWriter(path, true);
            escritorFichero = new PrintWriter(escribirArchivo);
            System.out.println("Escribiendo en Fichero...");
            
            for (int i=0; i< Archivo.size();i++)
            {
                escritorFichero.println("-" + Archivo.get(i));
                escritorFichero.flush();   
            }
            escritorFichero.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
   
    }
}

