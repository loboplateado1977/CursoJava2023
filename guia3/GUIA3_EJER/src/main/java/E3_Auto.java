public class E3_Auto {

    private String color;
    private String patente;
    private float combustible;
    private E3_Rueda rueda1;
    private E3_Rueda rueda2;
    private E3_Rueda rueda3;
    private E3_Rueda rueda4;

    public E3_Auto() {
    }

    public E3_Auto(String color, String patente, float combustible, E3_Rueda rueda1, E3_Rueda rueda2, E3_Rueda rueda3, E3_Rueda rueda4) {
        this.color = color;
        this.patente = patente;
        this.combustible = combustible;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }

    public String getColor() {
        return color;
    }

    public String getPatente() {
        return patente;
    }

    public float getCombustible() {
        return combustible;
    }

    public E3_Rueda getRueda1() {
        return rueda1;
    }

    public E3_Rueda getRueda2() {
        return rueda2;
    }

    public E3_Rueda getRueda3() {
        return rueda3;
    }

    public E3_Rueda getRueda4() {
        return rueda4;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public void setRueda1(E3_Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public void setRueda2(E3_Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public void setRueda3(E3_Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public void setRueda4(E3_Rueda rueda4) {
        this.rueda4 = rueda4;
    }
    

    public void avanzar() {
    }

    public void retrocedar() {
    }

    public void llenarTanque() {
    }
}
