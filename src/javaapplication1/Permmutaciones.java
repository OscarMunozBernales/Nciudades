package javaapplication1;

import java.util.LinkedList;


public class Permmutaciones {
    
        public static void main(String[] args) {
        LinkedList<Character> conjunto =new LinkedList<Character>();
        conjunto.add('1');
        conjunto.add('2');
        conjunto.add('3');

        
        escribe ("", conjunto);
    }

    public static void escribe(String a, LinkedList<Character> conjunto) {
        System.out.println(conjunto + "- '" + a + "'");
        if (conjunto.size()==1)
        {
            System.out.println(a+conjunto.get(0));
        }
        for (int i=0;i<conjunto.size();i++)
        {
            Character b = conjunto.remove(i);
            escribe (a+b, conjunto);
            conjunto.add(i,b);
        }
    }
    
}
