/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg6;

/**
 *
 * @author 
 */
public class Profesores {
    
    String nombre;
    
    
    public Profesores() {
        
    }
    public Profesores(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String getTexto(){
  
      return this.nombre;
    }
    
}
