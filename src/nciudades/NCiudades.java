/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nciudades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class NCiudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double comp=999999999;
        int c;
        System.out.println("HOLA MUNDO");
        Random rnd = new Random(111);
        List<Ciudad> lista = new ArrayList<Ciudad>();
        
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Ingrese la cantidad de ciudades: ");
        c = entrada.nextInt();
        for (int i=0; i < c; i++)
            lista.add(new Ciudad(i,rnd.nextInt(100),rnd.nextInt(100)));
        
        PermutacionesIterator iter = new PermutacionesIterator(lista);
        int id = 0;
        while (iter.hasNext()){
            TspSol sol = new TspSol(id, iter.next());
            System.out.println(sol);
            /*if(comp>sol.getFitness()){
                comp = sol.getFitness();
            }*/
            id++;
        }
        //System.out.println("solucion optima: "+comp);
    }
    
}
