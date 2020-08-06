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
public class padre {

    int id;
    String nombre_P;
    String genero_p;
    Double edad_P;
    
    public padre(int id, String nombre_P, String genero_p, Double edad_P) {
        this.id = id;
        this.nombre_P = nombre_P;
        this.genero_p = genero_p;
        this.edad_P = edad_P;
    }

    public int getId() {
        return id;
    }

    public String getNombre_P() {
        return nombre_P;
    }

    public String getGenero_p() {
        return genero_p;
    }

    public Double getEdad_P() {
        return edad_P;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_P(String nombre_P) {
        this.nombre_P = nombre_P;
    }

    public void setGenero_p(String genero_p) {
        this.genero_p = genero_p;
    }

    public void setEdad_P(Double edad_P) {
        this.edad_P = edad_P;
    }
    
}
