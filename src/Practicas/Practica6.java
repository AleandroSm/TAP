package Practicas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Practica6 extends javax.swing.JFrame {

    Connection conn = null;

    public Practica6() {
        initComponents();
        this.setTitle("Mini Encuesta");
        this.lbHoras.setText(Integer.toString(this.JSlider1.getValue()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        JSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        lbHoras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elige un sistema operativo");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Windows");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Linux");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Mac");

        jLabel2.setText("Elige tu especialidad");

        jCheckBox1.setText("Programación");

        jCheckBox2.setText("Diseño Gráfico");

        jCheckBox3.setText("Administración");

        jLabel3.setText("Horas que dedicas al ordenador");

        JSlider1.setMaximum(24);
        JSlider1.setMinimum(1);
        JSlider1.setValue(4);
        JSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSlider1StateChanged(evt);
            }
        });

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbHoras.setText("4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbHoras)
                        .addGap(29, 29, 29)
                        .addComponent(JSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoras))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        JSlider1.getAccessibleContext().setAccessibleName("lbHoras");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.mostrarDatos();
        this.guardarArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSlider1StateChanged
          this.lbHoras.setText(Integer.toString(this.JSlider1.getValue()));
    }//GEN-LAST:event_JSlider1StateChanged

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
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica6().setVisible(true);
            }
        });
    }
    
    private void mostrarDatos(){
        String sisPreferido = "",especialidades = "";
        ArrayList<JCheckBox> checkboxes = new ArrayList<>();
        ArrayList<JRadioButton> radiobtns = new ArrayList<>();
        radiobtns.add(jRadioButton1);
        radiobtns.add(jRadioButton2);
        radiobtns.add(jRadioButton3);
        checkboxes.add(jCheckBox1);
        checkboxes.add(jCheckBox2);
        checkboxes.add(jCheckBox3);
        for(JRadioButton btn : radiobtns){
            if(btn.isSelected()){
                sisPreferido += btn.getText() + " ";
            }
        }
        for(JCheckBox check : checkboxes){
            if(check.isSelected()) especialidades += check.getText() + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu sistema preferido es " + sisPreferido + "\ntus especialidades son " + especialidades + "\ny el numero de horas dedicadas al ordenador son " + lbHoras.getText());
    }
    
    
     private void guardarArchivo() {
        String sSisOper = "Windows";
        String sProg = "N";
        String sDiseno = "N";
        String sAdmon = "N";
        String sHoras = "0";
        
        if (this.jRadioButton2.isSelected()) sSisOper = "Linux";
        if (this.jRadioButton3.isSelected()) sSisOper = "Mac";
        
        if (this.jCheckBox1.isSelected()) sProg = "S";
        if (this.jCheckBox2.isSelected()) sDiseno = "S";
        if (this.jCheckBox3.isSelected()) sAdmon = "S";
        
        sHoras = Integer.toString(this.JSlider1.getValue());
        
        String sRespuesta = String.format("%s, %s, %s, %s, %s\n", sSisOper, sProg, sDiseno, sAdmon, sHoras);
        
        System.out.println(sRespuesta);
        
        FileWriter fw = null;
        
        try {
            fw = new FileWriter("respuestas.txt", true);
            fw.write(sRespuesta);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        this.guardarBD(sSisOper, sProg, sDiseno, sAdmon, this.JSlider1.getValue());
    }
    

    private void guardarBD(String sSisOper, String sProg, String sDiseno, String sAdmon, int iHoras) {
        Statement stmt;
        String sInsert;

        sInsert = String.format("INSERT INTO respuestas (sSisOper,cProgra,cDiseno,cAdmon,iHoras) VALUES ('%s','%s','%s','%s',%d);", sSisOper, sProg, sDiseno, sAdmon, iHoras);

        try {
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta?"
                        + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=encuesta_user&password=encuesta_pass");
                stmt = conn.createStatement();
                stmt.execute(sInsert);

                conn.close();
                conn = null;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider JSlider1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbHoras;
    // End of variables declaration//GEN-END:variables
}
