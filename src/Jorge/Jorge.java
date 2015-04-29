/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jorge;

/**
 * Clase que da un nombre.
 * @author Jorge Sáenz
 */
public class Jorge {
    
    private String nombre;
    
    public Jorge (String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre.
     * @return String nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
}
