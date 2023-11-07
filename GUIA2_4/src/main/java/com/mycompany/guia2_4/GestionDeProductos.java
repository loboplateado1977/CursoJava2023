/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.guia2_4;


import com.mycompany.guia2_4.Categoria;
import javax.swing.JOptionPane;

/**
 *
 * @author Loboplateado77
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionDeProductos
     */
    public GestionDeProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTstock = new javax.swing.JTextField();
        jCBRubro = new javax.swing.JComboBox<>();
        jBmodificarProducto = new javax.swing.JButton();
        jBagregarProducto = new javax.swing.JButton();
        jBeliminarProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Gestion de Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Rubro");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Stock");

        jCBRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRubroActionPerformed(evt);
            }
        });

        jBmodificarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBmodificarProducto.setForeground(new java.awt.Color(0, 153, 204));
        jBmodificarProducto.setText("Modificar");

        jBagregarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBagregarProducto.setForeground(new java.awt.Color(0, 153, 204));
        jBagregarProducto.setText("Agregar");
        jBagregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarProductoActionPerformed(evt);
            }
        });

        jBeliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBeliminarProducto.setForeground(new java.awt.Color(204, 0, 204));
        jBeliminarProducto.setText("Eliminar");
        jBeliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarProductoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jBmodificarProducto))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBagregarProducto)
                                .addGap(35, 35, 35)
                                .addComponent(jBeliminarProducto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminarProducto)
                    .addComponent(jBagregarProducto)
                    .addComponent(jBmodificarProducto))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarProductoActionPerformed
        // TODO add your handling code here:
        
        try{
            int codigo = Integer.parseInt(jTcodigo.getText());
            int stock  = Integer.parseInt(jTstock.getText());
        
                if(jTdescripcion.getText().isEmpty()|| jCBRubro.toString().isEmpty()){
                    JOptionPane.showMessageDialog(this,"El campo no puede estar vacio");
                    return;
                }
            String descripcion = jTdescripcion.getText();
            Double precio = Double.parseDouble(jTprecio.getText());
            Categoria.class.getEnumConstants();
           // Categoria.valueOf(Categoria<COMESTIBLE,LIMPIEZA,PERFUMERIA>, Categoria);
            String rubro = jCBRubro.getActionCommand();
            // jCBRubro.getActionCommand(Categoria.class.getEnumConstants());
           //  jCBRubro.getActionCommand(Categoria[]{});
            
         // jCBRubro.addItem(new Categoria(Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA));
            //jCBRubro.addItem( Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA);
          // jCBRubro.addItem( Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA);
          // Categoria cateSeleccionada= (Categoria) jCBRubro.getSelectedItem( );
           
           Producto.class.getEnumConstants();
           
            
           
            Producto catr=new Producto();
            catr.getRubro().toString();
            
            //  carga productoa la tabla
            
           // Menu.listaProductos.add(new Producto(codigo,descripcion,precio,stock,rubro));
              

            // limpiar luego de la carga
                jTcodigo.setText("");
                jTdescripcion.setText("");
                jTprecio.setText("");
                jTstock.setText("");
                jCBRubro.getActionCommand();
           
            }catch(NumberFormatException nf){
                 JOptionPane.showMessageDialog(this," Ingrese un valor numerico");
        }
        
        
    }//GEN-LAST:event_jBagregarProductoActionPerformed

    private void jBeliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarProductoActionPerformed
        // TODO add your handling code here:
        
        int filaS=Integer.parseInt ((String) jCBRubro.getSelectedItem());
        
    }//GEN-LAST:event_jBeliminarProductoActionPerformed

    private void jCBRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarProducto;
    private javax.swing.JButton jBeliminarProducto;
    private javax.swing.JButton jBmodificarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables
    
    
}