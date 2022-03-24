/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanguloApp;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author Silvina Paola
 */
public class RectanguloApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio res= new RectanguloServicio();
        Rectangulo re = res.crearRectangulo();
        
        res.superficie(re);
        res.perimetro(re);
        res.ImpresionRec(re);
        
    }
    
}
