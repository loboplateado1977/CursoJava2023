/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejer5;

/**
 *
 * @author loren
 */
public class PiezaTorre {
    private String color;
    private String movimiento;
    private int cantDespla;
    private boolean come;
    
    public PiezaTorre(String color,String movimiento, int cantDespla,boolean come){
    
        this.color=color;
        this.movimiento=movimiento;
        this.cantDespla= cantDespla;
        this.come=come;
                
    }
    public PiezaTorre(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public int getCantDespla() {
        return cantDespla;
    }

    public void setCantDespla(int cantDespla) {
        this.cantDespla = cantDespla;
    }

    public boolean isCome() {
        return come;
    }

    public void setCome(boolean come) {
        this.come = come;
    }
    public void DirTorre(){
    
        System.out.println( "color : "+color+" movimiento : "+movimiento+" cuanto se desplaza : "+cantDespla+" come ficha : "+come);
    }
}
