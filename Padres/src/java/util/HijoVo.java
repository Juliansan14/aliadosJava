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
public class HijoVo {
    
    int id;
    double padre_id;
    String nombre_H;
    String apellido_H;
    double edad;
    
    public int getId() {
        return id;
    }

    public double getPadre_id() {
        return padre_id;
    }

    public String getNombre_H() {
        return nombre_H;
    }

    public String getApellido_H() {
        return apellido_H;
    }

    public double getEdad() {
        return edad;
    }
  
  
    public void setId(int id) {
        this.id = id;
    }

    public void setPadre_id(double padre_id) {
        this.padre_id = padre_id;
    }

    public void setNombre_H(String nombre_H) {
        this.nombre_H = nombre_H;
    }

    public void setApellido_H(String apellido_H) {
        this.apellido_H = apellido_H;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
    

    
    public HijoVo(){
    }
      public HijoVo(int id,double padre_id,String nombre_H,String apellido_H,double edad){
          this.id=id;
          this.padre_id=padre_id;
          this.nombre_H=nombre_H;
          this.apellido_H=apellido_H;
          this.edad=edad;
    }  
    
}
