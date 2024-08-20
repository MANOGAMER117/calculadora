/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicio;

import Aplicacion.CalculadoraAplicacion;
import java.util.ArrayList;

/**
 *
 * @author zohan
 */
public class InicioCalculadora {
    
     public static ArrayList<CalculadoraAplicacion> listaEmpleados = new ArrayList<CalculadoraAplicacion>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         new CalculadoraAplicacion().setVisible(true);
    }
    
}
