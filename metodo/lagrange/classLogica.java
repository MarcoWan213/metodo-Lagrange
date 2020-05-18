/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodolagrange;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class classLogica {
    ArrayList<Punto> datos;

    public classLogica(ArrayList<Punto> datos) {
        this.datos = datos;
    }        
    
    public String getLagrange(){
        String lag ="";
        String polinomio ="";
        for (int i = 0; i < this.datos.size(); i++) {
            lag="";
            for (int j = 0; j < this.datos.size(); j++) {
                if (j!=i) {
                    lag = "(x- "+ this.datos.get(j).getX() +") / ";
                    lag+= "("+String.valueOf(this.datos.get(i).getX())+ " - " +String.valueOf(this.datos.get(j).getY());
                    
                }
            }
            polinomio+= lag + "*" +String.valueOf(this.datos.get(i).getY());
        }
        return polinomio;
    }
    
    public String getLagrangiano(){
        
        return "";
    }
    
}
