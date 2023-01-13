/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class CarreraServiceImpl implements CarreraService{

       public static List<Carrera> carreraList=new ArrayList<>();

public CarreraServiceImpl(){


}
    @Override
    public void crear(Carrera carrera) {
        this.carreraList.add(carrera);
    }
    

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }


       @Override
    public Carrera buscaCodigo(int codigo) {
        Carrera retorno = null;
        for (Carrera carrera : this.carreraList) {
            if (codigo == carrera.getCodigo()) {
                retorno = carrera;
                break;

            }
        }
        return retorno;
    }
    @Override
    public void modificar(Carrera carrera, int codigo) {
        int indice = -1;
        for (Carrera universidades : this.carreraList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.carreraList.set(indice, carrera);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        int indice = -1;
        for (Carrera carreras : this.carreraList) {
            indice++;
            if (codigo == carreras.getCodigo()) {
                this.carreraList.remove(indice);

            }

        }

    }
    
}
