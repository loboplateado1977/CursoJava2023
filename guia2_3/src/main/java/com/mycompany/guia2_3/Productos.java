/*
 *  1. Un ComboBox (JComboBox) que permita al usuario seleccionar una categoría de producto
        de una lista predefinida (por ejemplo, electrónica, ropa, alimentos, etc.).

    2. Un botón "Agregar producto" (JButton) que permita al usuario agregar un nuevo producto
        a la lista.

    3. Una tabla (JTable) que muestre los Productos agregados, con columnas para el nombre del
        producto, la categoría y el precio.
 */
package com.mycompany.guia2_3;

/**
 *
 * @author Loboplateado77
 */
public class Productos {//public class Productos extends Categoria
    
    private String prod;
    private String categoria;
    private Double precio;

    public Productos(String prod, String categoria, Double precio) {//public Productos(String prod, String nombCate, Double precio)
        this.prod = prod;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

  
  


    
}
