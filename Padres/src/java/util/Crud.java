/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;

/**
 *
 * @author JULIANSAN
 */
public interface Crud {
    public List Listar();
        
    public PadreVo listarID(int id);
    
     public HijoVo listarID(int id);
     
     public PadreVo delete(int id);
    
     public HijoVo delete(int id);
    
    public String add (String nombre,String apellido,double edad);

    public String edit (int id,String nombre,String apellido,double edad);

}
