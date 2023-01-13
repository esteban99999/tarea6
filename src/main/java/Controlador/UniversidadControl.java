/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Universidad;
import Servicio.UniversidadServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author esteb
 */
public class UniversidadControl {

   private UniversidadServiceImpl universidadServiceImpl =new UniversidadServiceImpl();
    public String crear(String[] data) {
        String retorno="No se puede crear Universidad";
        String nombre = data[0];
        int periodo = Integer.valueOf(data[1]).intValue();
        int yearFundacion = Integer.valueOf(data[2]).intValue();
        int numFacultades = Integer.valueOf(data[3]).intValue();
        int codigo=Integer.valueOf(data[4]).intValue();

    if (periodo > 61 || periodo < 61) {
            retorno += " El año no es valido ";
                        } else {
                            Universidad universidad = new Universidad(codigo, nombre, periodo, yearFundacion, numFacultades);
                            this.universidadServiceImpl.crear(universidad);
                            retorno="Universidad creado satisfactoriamente ";
                        }
        return retorno;
    }
    
    public List<Universidad> listar(){
        return this.universidadServiceImpl.listar();
    }
    public String modificar(String[] data) {
        String retorno="No se puede crear Universidad";
        String nombre = data[0];
        int periodo = Integer.valueOf(data[1]).intValue();
        int yearFundacion = Integer.valueOf(data[2]).intValue();
        int numFacultades = Integer.valueOf(data[3]).intValue();
        int codigo=Integer.valueOf(data[4]).intValue();

    if (periodo > 61 || periodo < 61) {
            retorno += " El año no es valido ";
                        } else {
                            Universidad universidad = new Universidad(codigo, nombre, periodo, yearFundacion, numFacultades);
                            this.universidadServiceImpl.crear(universidad);
                            retorno="Universidad modificado satisfactoriamente ";
                        }
        return retorno;
    }
      public void eliminar(String codigos) {
        int codigo = Integer.valueOf(codigos).intValue();
        this.universidadServiceImpl.eliminar(codigo);

    }
  
}
