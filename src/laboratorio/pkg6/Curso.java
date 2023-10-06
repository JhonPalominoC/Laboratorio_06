/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg6;

/**
 *
 * @author 
 */
public class Curso {
    String codigo;
    String creditos;
    String nombre;

    public Curso() {
        
      }
    
    public Curso(String codigo, String creditos, String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String getTexto(){
  
    return this.nombre + "   | Codigo: " +this.codigo + "   | Creditos: "+this.creditos;
    }
}
