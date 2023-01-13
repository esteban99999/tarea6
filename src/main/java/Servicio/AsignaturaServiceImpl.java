/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class AsignaturaServiceImpl implements  AsignaturaService{
public static List<Asignatura> asiganturaList;

public AsignaturaServiceImpl (){
this.asiganturaList=new ArrayList<>();
}

    @Override
    public void crear(Asignatura asignatura) {
        this.asiganturaList.add(asignatura);
    }

    @Override
    public List<Asignatura> listar() {
        return this.asiganturaList;
    }
     @Override
    public void modificar(Asignatura asignatura, int codigo) {
        int indice = -1;
        for (Asignatura asignaturas : this.asiganturaList) {
            indice++;
            if (codigo == asignaturas.getCodigo()) {
                this.asiganturaList.set(indice, asignatura);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        int indice = -1;
        for (Asignatura asignatura : this.asiganturaList) {
            indice++;
            if (codigo == asignatura.getCodigo()) {
                this.asiganturaList.remove(indice);

            }

        }
    }
}
