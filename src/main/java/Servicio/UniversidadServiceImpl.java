/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Universidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class UniversidadServiceImpl implements UniversidadService {

    private static List<Universidad> universidadList = new ArrayList<>();

    @Override
    public void crear(Universidad universidad) {

        this.universidadList.add(universidad);
    }

    @Override
    public List<Universidad> listar() {
        return this.universidadList;
    }

    @Override
    public Universidad UniversidadCodigo(int codigo) {
        Universidad retorno = null;
        for (Universidad universidad : this.universidadList) {
            if (codigo == universidad.getCodigo()) {
                retorno = universidad;
                break;

            }
        }
        return retorno;
    }

    @Override
    public void modificar(Universidad universidad, int codigo) {

        int indice = -1;
        for (Universidad universidades : this.universidadList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.universidadList.set(indice, universidad);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        int indice = -1;
        for (Universidad universidades : this.universidadList) {
            indice++;
            if (codigo == universidades.getCodigo()) {
                this.universidadList.remove(indice);

            }

        }
    }

}
