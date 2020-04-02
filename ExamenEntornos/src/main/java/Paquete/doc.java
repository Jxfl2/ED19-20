/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 * Interfaz preparada para escribir una linea en un archivo.
 * @author aaron
 */
public interface doc {

    /**
     * Escribe la linea pasada por parametro, en un documento tambien establecido
     * por parametro en la linea "x".
     * @param x Numero de linea en la que se añade la linea.
     * @param line Linea que se copia en la posicion "x".
     * @param file La ruta del archivo donde se copia la linea.
     * @return Devuelve un String que es el contenido del archivo con la linea añadida.
     */
    public abstract String escribirLinea(int x, String line, String file);
    /**
     * Calcula el area de una ciudad. Se le tiene que pasar los Km de los lados
     * de la ciudad.
     * @param ciudad La ciudad de la que se quiere calcular el area.
     * @return Devuelve el calculo del area de la ciudad introducida.
     */
    public abstract double areaCiudad(String ciudad);
}
