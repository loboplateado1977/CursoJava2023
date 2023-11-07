
package tp1.ejer2;

public class Computadora {
    private String marca;
    private String modelo;
    private int pulgadas;
    private Double precio;
    private String color;
                
    public Computadora(String marca,String modelo,int pulgadas,Double precio,String color){
     
            this.marca=marca;
            this.modelo=modelo;
            this.pulgadas=pulgadas;
            this.precio=precio;
            this.color=color;
                    
    }
    public Computadora(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Pc(){
        
        System.out.println(" marca : "+marca+" modelo : "+modelo+" pulgadas : "+pulgadas+" precio :"+precio+" color : "+color);
    }
    
}
