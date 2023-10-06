/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg6;

/**
 *
 * @author 
 */
public class Estudiantes {
    String codigo;
    String nombre;
    
    public Estudiantes() {
        
    }
    public Estudiantes(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    String getTexto(){
  
        return this.nombre + "   |   Codigo: " +this.codigo;
    }
        
}  
