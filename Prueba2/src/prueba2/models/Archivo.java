/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2.models;

/**
 *
 * @author Romero
 */
public class Archivo {
    String source_path;
    String target_path;

    public Archivo(String source_path) {
        this.source_path = source_path;
    }

    public Archivo() {
    }
    
    public String getSource_path() {
        return source_path;
    }

    public void setSource_path(String source_path) {
        this.source_path = source_path;
    }

    public String getTarget_path() {
        return target_path;
    }

    public void setTarget_path(String target_path) {
        this.target_path = target_path;
    }
    
    public void ordenar_archivo(){
        String ordered_path = "";
        // TODO: leer archivo, ordenar en lista, wscribir arhivo
        
        this.target_path = ordered_path;
    }
    
    private void insertar_en_lista(){
        
    }
    
}
