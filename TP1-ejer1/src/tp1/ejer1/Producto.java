/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejer1;

/**
 *
 * @author loren
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    
    public Producto(int codigo,String descripcion,Double precio,int stock){
         this.codigo = codigo;
         this.descripcion = descripcion;
         this.precio =precio;
         this.stock =stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void tipoProducto(){
        System.out.println(" codigo : "+codigo+" descripcion : "+descripcion+" precio : "+precio+" stock : "+stock);
    }
}
