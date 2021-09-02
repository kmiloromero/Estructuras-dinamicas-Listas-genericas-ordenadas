/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapackage;

/**
 *
 * @author Romero
 */
public class ListaClass {
    
/* se crea el metodo nodo que será la estructura de la lista con los atributos
 * long dato que almacenara el valor numerico y apuntador que direcciona al   
 * siguiente nodo.
 */   
    class Nodo{
    int dato;
    Nodo siguiente;
    }
/*se crea un apuntador externo, el cual tendra la direcion del primer nodo*/
    private Nodo raiz = null;
    
/* se crea el metodo insertar,que trae por parametro un Long numeroel cual 
 * siempre que se inserta un nodo, buscara la posicion en la lista donde 
 * debe quedar para asi buscar su ordenamiento en el momento de la insercion
 */
    public void Insertar(double numero){
        Nodo nuevonodo = new Nodo();
    //guardamos la informacion entrante
        nuevonodo.dato = (int)numero;
    
        if(raiz == null){
            raiz = nuevonodo;
        } else{
            if(numero < raiz.dato){
                nuevonodo.siguiente = raiz;
                raiz = nuevonodo;
            } else{
                Nodo reco = raiz;
                Nodo atras=raiz;
                while(numero >= reco.dato && reco.siguiente != null ){
                    atras = reco;
                    reco = reco.siguiente;                
                } 
                if(numero >= reco.dato){
                    reco.siguiente = nuevonodo;                
                } else{
                    nuevonodo.siguiente = reco;
                    atras.siguiente = nuevonodo;
                }
            }
        }      
    }
    
    public void imprimir(){
        Nodo reco = raiz;
        while(reco != null){
            System.out.print(reco.dato + " - ");
            reco = reco.siguiente;            
        }
        System.out.println();
    }  
}


