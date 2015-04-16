package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class init {
    
    public static void main(String[] args){
        System.out.println("HOLA MUNDO");
        Random rnd = new Random(111);
        List<ciudad> lista = new ArrayList<ciudad>();
        
        for (int i=0; i < 10; i++)
            lista.add(new ciudad(i,rnd.nextInt(100),rnd.nextInt(100)));
        
        PermutacionesIterator iter = new PermutacionesIterator(lista);
        int id = 0;
        while (iter.hasNext()){
            TspSol sol = new TspSol(id, iter.next());
            System.out.println(sol);
            id++;
        }
        
      
        
        
    }
}
