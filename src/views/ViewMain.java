/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


/**
 *
 * @author MarGaryIto
 */
public class ViewMain extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public ViewMain() {
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

        jPanel_Menu = new javax.swing.JPanel();
        jLabel_Sesiones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Sesiones_IniciarSesion = new javax.swing.JLabel();
        jLabel_Sesiones_Usuarios = new javax.swing.JLabel();
        jLabel_Operaciones = new javax.swing.JLabel();
        jLabel_Catalogos_Clientes = new javax.swing.JLabel();
        jLabel_Catalogos_Productos = new javax.swing.JLabel();
        jLabel_Catalogos_Proveedores = new javax.swing.JLabel();
        jLabel_Catalogos = new javax.swing.JLabel();
        jLabel_Operaciones_Ventas = new javax.swing.JLabel();
        jLabel_Operaciones_Compras = new javax.swing.JLabel();
        jLabel_Reportes = new javax.swing.JLabel();
        jLabel_Reportes_Proveedores = new javax.swing.JLabel();
        jLabel_Reportes_Productos = new javax.swing.JLabel();
        jLabel_Reportes_Clientes = new javax.swing.JLabel();
        jLabel_Reportes_Ventas = new javax.swing.JLabel();
        jLabel_Ayuda = new javax.swing.JLabel();
        jLabel_Ayuda_AcercaDe = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_icon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Aceptar = new javax.swing.JLabel();
        jPanel_Loggin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_Contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        jPanel_Menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Sesiones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Sesiones.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sesiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/usuario.png"))); // NOI18N
        jLabel_Sesiones.setText("Sesiones");
        jLabel_Sesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SesionesMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_Sesiones_IniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Sesiones_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sesiones_IniciarSesion.setText("Iniciar Sesion");

        jLabel_Sesiones_Usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Sesiones_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sesiones_Usuarios.setText("Usuarios");

        jLabel_Operaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Operaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Operaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/operaciones.png"))); // NOI18N
        jLabel_Operaciones.setText("Operaciones");

        jLabel_Catalogos_Clientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Catalogos_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Catalogos_Clientes.setText("Clientes");

        jLabel_Catalogos_Productos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Catalogos_Productos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Catalogos_Productos.setText("Productos");

        jLabel_Catalogos_Proveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Catalogos_Proveedores.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Catalogos_Proveedores.setText("Proveedores");

        jLabel_Catalogos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Catalogos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Catalogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/catalogo.png"))); // NOI18N
        jLabel_Catalogos.setText("Catalogos");

        jLabel_Operaciones_Ventas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Operaciones_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Operaciones_Ventas.setText("Ventas");

        jLabel_Operaciones_Compras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Operaciones_Compras.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Operaciones_Compras.setText("Compras");

        jLabel_Reportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Reportes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/reportes.png"))); // NOI18N
        jLabel_Reportes.setText("Reportes");

        jLabel_Reportes_Proveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Reportes_Proveedores.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reportes_Proveedores.setText("Proveedores");

        jLabel_Reportes_Productos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Reportes_Productos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reportes_Productos.setText("Productos");

        jLabel_Reportes_Clientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Reportes_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reportes_Clientes.setText("Clientes");

        jLabel_Reportes_Ventas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Reportes_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Reportes_Ventas.setText("Ventas");

        jLabel_Ayuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Ayuda.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ayuda.png"))); // NOI18N
        jLabel_Ayuda.setText("Ayuda");
        jLabel_Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AyudaMouseExited(evt);
            }
        });

        jLabel_Ayuda_AcercaDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Ayuda_AcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ayuda_AcercaDe.setText("Acerda de...");

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel_Sesiones))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Operaciones_Compras)
                                    .addComponent(jLabel_Operaciones_Ventas)))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel_Ayuda_AcercaDe))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Operaciones)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_Catalogos_Clientes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Catalogos_Productos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Catalogos_Proveedores, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel_Catalogos)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Sesiones_Usuarios)
                                .addComponent(jLabel_Sesiones_IniciarSesion)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addComponent(jLabel_Reportes)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_Reportes_Clientes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Reportes_Productos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Reportes_Proveedores, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Reportes_Ventas, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addComponent(jLabel_Ayuda)
                                .addGap(36, 36, 36)))
                        .addGap(35, 35, 35))))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel_Sesiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sesiones_IniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sesiones_Usuarios)
                .addGap(16, 16, 16)
                .addComponent(jLabel_Catalogos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Catalogos_Clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Catalogos_Productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Catalogos_Proveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Operaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Operaciones_Compras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Operaciones_Ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Reportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Reportes_Clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Reportes_Productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Reportes_Proveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Reportes_Ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Ayuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Ayuda_AcercaDe)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/user_white.gif"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel_Aceptar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Aceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel_Aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Usuario:");

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Contraseña:");

        javax.swing.GroupLayout jPanel_LogginLayout = new javax.swing.GroupLayout(jPanel_Loggin);
        jPanel_Loggin.setLayout(jPanel_LogginLayout);
        jPanel_LogginLayout.setHorizontalGroup(
            jPanel_LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LogginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordField_Contrasena, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_LogginLayout.setVerticalGroup(
            jPanel_LogginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LogginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)))
                .addGap(406, 406, 406))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jPanel_Loggin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(375, 375, 375))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Loggin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_SesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SesionesMouseClicked
        
    }//GEN-LAST:event_jLabel_SesionesMouseClicked

    private void jLabel_AyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AyudaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_AyudaMouseEntered

    private void jLabel_AyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AyudaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_AyudaMouseExited

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel_Aceptar;
    public javax.swing.JLabel jLabel_Ayuda;
    public javax.swing.JLabel jLabel_Ayuda_AcercaDe;
    public javax.swing.JLabel jLabel_Catalogos;
    public javax.swing.JLabel jLabel_Catalogos_Clientes;
    public javax.swing.JLabel jLabel_Catalogos_Productos;
    public javax.swing.JLabel jLabel_Catalogos_Proveedores;
    public javax.swing.JLabel jLabel_Operaciones;
    public javax.swing.JLabel jLabel_Operaciones_Compras;
    public javax.swing.JLabel jLabel_Operaciones_Ventas;
    public javax.swing.JLabel jLabel_Reportes;
    public javax.swing.JLabel jLabel_Reportes_Clientes;
    public javax.swing.JLabel jLabel_Reportes_Productos;
    public javax.swing.JLabel jLabel_Reportes_Proveedores;
    public javax.swing.JLabel jLabel_Reportes_Ventas;
    public javax.swing.JLabel jLabel_Sesiones;
    public javax.swing.JLabel jLabel_Sesiones_IniciarSesion;
    public javax.swing.JLabel jLabel_Sesiones_Usuarios;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel_Loggin;
    private javax.swing.JPanel jPanel_Menu;
    public javax.swing.JPasswordField jPasswordField_Contrasena;
    public javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
