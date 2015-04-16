/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nciudades;

/**
 *
 * @author oscar
 */
public class Ciudad {
    private int ide; // identidad
    private int x;
    private int y;
    
    
    public Ciudad(int ide, int x,int y){
        this.ide = ide;
        this.x = x;
        this.y = y;
        
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "C " + this.ide + "(" + this.x +","+ this.y +")";
    }
    
    public double distancia(Ciudad a){
        return Math.sqrt(Math.pow(this.x-a.getX(),2)+Math.pow(this.y - a.getY(),2));
    }
}
