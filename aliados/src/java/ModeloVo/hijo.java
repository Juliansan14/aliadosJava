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
public class hijo {

    int id;
    Double padre_id;
    String nombre_H;
    String genero_H;
    Double edad_H;
    
    public hijo(int id, Double padre_id, String nombre_H, String genero_H, Double edad_H) {
        this.id = id;
        this.padre_id = padre_id;
        this.nombre_H = nombre_H;
        this.genero_H = genero_H;
        this.edad_H = edad_H;
    }

    public int getId() {
        return id;
    }

    public Double getPadre_id() {
        return padre_id;
    }

    public String getNombre_H() {
        return nombre_H;
    }

    public String getGenero_H() {
        return genero_H;
    }

    public Double getEdad_H() {
        return edad_H;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPadre_id(Double padre_id) {
        this.padre_id = padre_id;
    }

    public void setNombre_H(String nombre_H) {
        this.nombre_H = nombre_H;
    }

    public void setGenero_H(String genero_H) {
        this.genero_H = genero_H;
    }

    public void setEdad_H(Double edad_H) {
        this.edad_H = edad_H;
    }
    
    
}
