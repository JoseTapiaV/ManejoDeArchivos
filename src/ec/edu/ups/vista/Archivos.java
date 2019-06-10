
package ec.edu.ups.vista;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Archivos extends javax.swing.JFrame {
   
    DefaultListModel modelo;
    DefaultListModel modelo1;
    DefaultListModel modelo2;
    
    public Archivos() {
        initComponents();
        modelo=new DefaultListModel();
        modelo1=new DefaultListModel();
        modelo2=new DefaultListModel();
        lstDirectorio.setModel(modelo);
        lstArchivo.setModel(modelo1);
        lstOculto.setModel(modelo2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDirectorio = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstArchivo = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOculto = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        lblRuta = new javax.swing.JLabel();
        lblModificacion = new javax.swing.JLabel();
        lblTamaño = new javax.swing.JLabel();
        txtRutaAbsoluta = new javax.swing.JTextField();
        txtUltimaModificacion = new javax.swing.JTextField();
        txtTamaño = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCrearArchivo = new javax.swing.JMenuItem();
        itemRenombrar = new javax.swing.JMenuItem();
        itemCrearCarpeta = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ruta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 18))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRuta)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtRuta)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 2, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Carpetas");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Archivos");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Ocultos");

        lstDirectorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstDirectorioMouseClicked(evt);
            }
        });
        lstDirectorio.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDirectorioValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDirectorio);

        lstArchivo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArchivoValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstArchivo);

        lstOculto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOcultoValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstOculto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 2, 18))); // NOI18N

        lblRuta.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblRuta.setText("Ruta Absoluta:");

        lblModificacion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblModificacion.setText("Ultima modificacion:");

        lblTamaño.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblTamaño.setText("Tamaño KB:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRuta)
                    .addComponent(lblTamaño)
                    .addComponent(lblModificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUltimaModificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(txtRutaAbsoluta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTamaño))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuta)
                    .addComponent(txtRutaAbsoluta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificacion)
                    .addComponent(txtUltimaModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamaño)
                    .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        itemCrearArchivo.setText("Crear Archivo");
        itemCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCrearArchivo);

        itemRenombrar.setText("Renombrar");
        itemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRenombrarActionPerformed(evt);
            }
        });
        jMenu1.add(itemRenombrar);

        itemCrearCarpeta.setText("Nueva Carpeta");
        itemCrearCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearCarpetaActionPerformed(evt);
            }
        });
        jMenu1.add(itemCrearCarpeta);

        itemEliminar.setText("Eliminar");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(itemEliminar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modelo1.clear();
        modelo.clear();
        modelo2.clear();
        
        String r=txtRuta.getText();
        File ruta= new File(r);
        File[] archivos=ruta.listFiles();
        
        for(File archivo: archivos){
            if(archivo.isDirectory()){
                modelo.addElement(archivo.getName());
            }
            if(archivo.isFile()){
                modelo1.addElement(archivo.getName());
            }
            if(archivo.isHidden()){
                modelo2.addElement(archivo.getName());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lstDirectorioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDirectorioValueChanged
        lstArchivo.clearSelection();
        lstOculto.clearSelection();
        String elementoSeleccionado = lstDirectorio.getSelectedValue();
        String rutaSeleccionada=txtRuta.getText().trim()+"\\"+elementoSeleccionado;
        mostrarInformacionArchivoSeleccionado(rutaSeleccionada);
        txtRutaAbsoluta.setText(rutaSeleccionada);       
    }//GEN-LAST:event_lstDirectorioValueChanged

    private void lstArchivoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArchivoValueChanged
        lstDirectorio.clearSelection();
        lstOculto.clearSelection();
        String elementoSeleccionado = lstArchivo.getSelectedValue();
        String rutaSeleccionada=txtRuta.getText().trim()+"\\"+elementoSeleccionado;
        mostrarInformacionArchivoSeleccionado(rutaSeleccionada);
        txtRutaAbsoluta.setText(rutaSeleccionada);
    }//GEN-LAST:event_lstArchivoValueChanged

    private void lstOcultoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOcultoValueChanged
        lstArchivo.clearSelection();
        lstDirectorio.clearSelection();
        String elementoSeleccionado = lstOculto.getSelectedValue();
        String rutaSeleccionada=txtRuta.getText().trim()+"\\"+elementoSeleccionado;
        mostrarInformacionArchivoSeleccionado(rutaSeleccionada);
        txtRutaAbsoluta.setText(rutaSeleccionada);
    }//GEN-LAST:event_lstOcultoValueChanged

    private void itemCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearArchivoActionPerformed
        String nombreArchivo=JOptionPane.showInputDialog("Ingresar nombre del archivo: ");
        String ruta=txtRuta.getText().trim()+"\\"+nombreArchivo;
        File archivoNombre=new File(ruta);
        if(!archivoNombre.exists()){
            try{
                archivoNombre.createNewFile();
            }
            catch(IOException ex){
                JOptionPane.showInputDialog("El archivo no pudo ser creado");
            }
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemCrearArchivoActionPerformed

    private void itemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRenombrarActionPerformed
        boolean isValid=false;
        String archivo=null;
        if(!lstArchivo.isSelectionEmpty()){
            archivo=lstArchivo.getSelectedValue();
        }else if(!lstDirectorio.isSelectionEmpty()){
            archivo=lstDirectorio.getSelectedValue();
        }else if(!lstOculto.isSelectionEmpty()){
                archivo=lstOculto.getSelectedValue();
        }else{
            isValid=true;
            JOptionPane.showMessageDialog(this, "seleccione un archivo o directorio");
        }
        
        if(isValid==false){
            String rutaSeleccionada=txtRuta.getText().trim()+"\\"+archivo;
            File renombrar=new File(rutaSeleccionada);
            
            String nombreNuevoArchivo=JOptionPane.showInputDialog("Ingrese el nuevo nombre del archivo");
            String rutaNuevoArchivo=txtRuta.getText().trim()+"\\"+nombreNuevoArchivo;
            File archivoNuevo=new File(rutaNuevoArchivo);
            
            if(archivoNuevo.exists()){
                JOptionPane.showMessageDialog(this, "archivo ya existe");
            }else{
                renombrar.renameTo(archivoNuevo);
            }
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemRenombrarActionPerformed

    private void itemCrearCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearCarpetaActionPerformed
        String nuevoNombreCarpeta=JOptionPane.showInputDialog("Ingrese el nuevo nombre a la carpeta");
        String ruta=txtRuta.getText().trim()+"\\"+nuevoNombreCarpeta;
        File nuevaCarpeta=new File(ruta);
        if(!nuevaCarpeta.exists()){
            nuevaCarpeta.mkdir();
        }else{
            JOptionPane.showMessageDialog(this, "Se produjo un error al crear la carpeta");
        }
        btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_itemCrearCarpetaActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        boolean isValid = false;
        String archivo=null;
        if(!lstArchivo.isSelectionEmpty()){
            archivo=lstArchivo.getSelectedValue();
        }else if(!lstDirectorio.isSelectionEmpty()){
            archivo=lstDirectorio.getSelectedValue();
        }else if(!lstOculto.isSelectionEmpty()){
            archivo=lstOculto.getSelectedValue();
        }else{
            isValid=true;
            JOptionPane.showMessageDialog(this, "No a seleccionado ningun archivo");
        }
        
        String rutaArchivo=txtRuta.getText().trim()+"\\"+archivo;
        if(isValid==false){
            int r=JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar "+archivo);
            if(r==0){
                eliminar(rutaArchivo);
            }
        }
        btnBuscarActionPerformed(evt);  
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void lstDirectorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstDirectorioMouseClicked
        if(evt.getClickCount()==2){
            String ruta=txtRuta.getText().trim()+"\\"+lstDirectorio.getSelectedValue();
            txtRuta.setText(ruta);
            java.awt.event.ActionEvent av1;
            av1 = null;
            btnBuscarActionPerformed(av1);
        }
    }//GEN-LAST:event_lstDirectorioMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        String ruta=txtRuta.getText().trim();
        String rutaNueva=null;
         
        for(int i=ruta.length()-1;i>2;i--){
             if((int)ruta.charAt(i)==92){               
                rutaNueva=ruta.substring(0, i);
                txtRuta.setText(rutaNueva);
                btnBuscarActionPerformed(evt);
                break;
            }
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void mostrarInformacionArchivoSeleccionado(String rutaSeleccionada){
        File archivoSeleccionado = new File(rutaSeleccionada);
        long ml=archivoSeleccionado.lastModified();
        Date result=new Date(ml);
        SimpleDateFormat simple= new SimpleDateFormat("dd/MM/yyyy");
        String fecha=simple.format(result);        
        
        long tamaño=archivoSeleccionado.length();
        tamaño=tamaño/1024;
        
        txtUltimaModificacion.setText(fecha);
        txtTamaño.setText(String.valueOf(tamaño)+" KB");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos().setVisible(true);
            }
        });
    }
    
    public String eliminar(String ruta) {
        if (ruta != null) {
            eliminar(hayCarpetas(ruta));
            File folder = new File(ruta);
            for (File file : folder.listFiles()){
                if (file.isFile())
                    file.delete();
            }
            while (hayCarpetas(ruta) != null) 
                eliminar(hayCarpetas(ruta));
            folder.delete();
            return ruta;
        }
        return ruta;
    }

    public String hayCarpetas(String ruta){
        File folder = new File(ruta);
        for (File file : folder.listFiles()){
            if (file.isDirectory()) 
                return file.getPath();
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenuItem itemCrearArchivo;
    private javax.swing.JMenuItem itemCrearCarpeta;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemRenombrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblModificacion;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JList<String> lstArchivo;
    private javax.swing.JList<String> lstDirectorio;
    private javax.swing.JList<String> lstOculto;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtRutaAbsoluta;
    private javax.swing.JTextField txtTamaño;
    private javax.swing.JTextField txtUltimaModificacion;
    // End of variables declaration//GEN-END:variables
}
