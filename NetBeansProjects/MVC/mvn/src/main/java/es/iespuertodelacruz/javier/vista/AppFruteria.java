package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.api.Fruta;
import es.iespuertodelacruz.javier.controlador.FrutaController;
import es.iespuertodelacruz.javier.exception.FicheroException;
import es.iespuertodelacruz.javier.exception.FrutaException;

public class AppFruteria {
    FrutaController frutaController;

    public AppFruteria(){
        frutaController = new FrutaController();
    }
    public static void main(String[] args){
        //asdf
    }
    
    public void insertar(Fruta fruta) throws FrutaException, FicheroException{
        frutaController.insertar(fruta);
    }

    public void eliminar(Fruta fruta) throws FrutaException, FicheroException{
        frutaController.insertar(fruta);
    }
}
