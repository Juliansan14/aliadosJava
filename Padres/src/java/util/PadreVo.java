/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVo;

/**
 *
 * @author JULIANSAN
 */
public class PadreVo {
    
    int id;
    String nombre;
    String apellido;
    double edad;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
     

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getEdad() {
        return edad;
    }
   
    
    public PadreVo(){
    }
      public PadreVo(int id,String nombre,String apellido,double edad){
          this.id=id;
          this.nombre=nombre;
          this.apellido=apellido;
          this.edad=edad;
    }  
}
