/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Carrera;
import Modelo.Universidad;
import Servicio.CarreraServiceImpl;
import Servicio.UniversidadServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author esteb
 */
public class CarreraControl {
    
    private CarreraServiceImpl carreraServiceImpl=new CarreraServiceImpl();
    private UniversidadServiceImpl universidadServiceImpl=new UniversidadServiceImpl();
    
    public String crear(String[] data) {
        String retorno="No se puede crear Universidad:";
        String nombreCarrera = data[0];
        String nombreDirector = data[1];
        int numCiclos = Integer.valueOf(data[2]).intValue();
        String facultad = data[3];
        Universidad universidad = this.universidadServiceImpl.UniversidadCodigo(Integer.valueOf(data[4]));
        int codigo=Integer.valueOf(data[5]).intValue();
        
        if (numCiclos < 8 || numCiclos >10) {
            retorno += " El numero de ciclos no es valido ";
        } else {
            Carrera carrera = new Carrera(codigo, nombreCarrera, nombreDirector, numCiclos, facultad,universidad);
            this.carreraServiceImpl.crear(carrera);
            retorno = "Creado Satisfactoriamente ";       
            }
        return retorno;
        }
    
    public String modificar(String[] data) {
        String retorno="No se puede crear Universidad:";
        String nombreCarrera = data[0];
        String nombreDirector = data[1];
        int numCiclos = Integer.valueOf(data[2]).intValue();
        String facultad = data[3];
        Universidad universidad = this.universidadServiceImpl.UniversidadCodigo(Integer.valueOf(data[4]));
        int codigo=Integer.valueOf(data[5]).intValue();
        
        if (numCiclos < 8 || numCiclos >10) {
            retorno += " El numero de ciclos no es valido ";
        } else {
            Carrera carrera = new Carrera(codigo, nombreCarrera, nombreDirector, numCiclos, facultad,universidad);
            this.carreraServiceImpl.crear(carrera);
            retorno = "Creado Satisfactoriamente ";       
            }
        return retorno;
        }
    
        public List<Carrera> listar(){
        return this.carreraServiceImpl.listar();
    }
        
        public void eliminar(String codigos) {
        int codigo = Integer.valueOf(codigos).intValue();
        this.carreraServiceImpl.eliminar(codigo);

    }
    
}
