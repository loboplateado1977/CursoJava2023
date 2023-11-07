public class E4_Robot {

    private int pasosA;
    private int pasosR;
    private int energia;
    private boolean estado;
    
    
    public E4_Robot() {
    }
    
    public E4_Robot(int pasosA, int pasosR, int energia, boolean estado) {
        this.pasosA = pasosA;
        this.pasosR = pasosR;
        this.energia = energia;
        this.estado = estado;
    }

    public int getPasosA() {
        return pasosA;
    }

    public int getPasosR() {
        return pasosR;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setPasosA(int pasosA) {
        this.pasosA = pasosA;
    }

    public void setPasosR(int pasosR) {
        this.pasosR = pasosR;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    public void dormir() {
    }

    public void despertar() {
    }

    public void recargar() {
    }

    public boolean bateriaLlena() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean bateriaVacia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void energiaActual() {
    }
}
