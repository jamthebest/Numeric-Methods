/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;

import javax.swing.JOptionPane;
import org.nfunk.jep.ParseException;

/**
 *
 * @author jam
 */
public class Trapecio extends javax.swing.JFrame {

    private double[] f;
    private Funcion fun;
    public Trapecio() {
        initComponents();
        setLocationRelativeTo(null);

        metodo.removeAllItems();
        metodo.addItem("Regla del Trapecio");
        metodo.addItem("Regla del Simpson");
        fx.requestFocus();
    }
    
    public double sumatoria(){
        double ret = 0;
        for(int i = 1; i < f.length-1; i++)
            ret += f[i]*2;
        ret += f[0]+f[f.length-1];
        return ret;
    }
    
    public double sumatoriaSimpson(){
        double ret = 0;
        for(int i = 1; i <= (f.length-1)/2; i++){
            ret += f[(2*i)-1]*4;
            //System.out.println(String.format("i = %d\nf(%d) = %f", i, 2*i -1, f[(2*i)-1]));
        }
        for(int i = 1; i <= (f.length-3)/2; i++){
            ret += f[2*i]*2;
            //System.out.println(String.format("i = %d\nf(%d) = %f", i, 2*i, f[(2*i)]));
        }
        ret += f[0]+f[f.length-1];
        return ret;
    }
    
    public void dividir(double h) throws ParseException{
      int x = Integer.parseInt(n.getValue().toString());
      double a = Integer.parseInt(A.getValue().toString());
      for(int i = 0; i <= x; i++){
        f[i] = fun.Evaluar(a);
        //System.out.println(String.format("n = %d\nXn = %f\nF(Xn) = %f\n", i, a, f[i]));
        a += h;
      }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fx = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A = new javax.swing.JSpinner();
        B = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        metodo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Función a Integrar");

        fx.setNextFocusableComponent(n);

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Integracion/aceptar.jpg"))); // NOI18N
        aceptar.setToolTipText("Aceptar");
        aceptar.setNextFocusableComponent(salir);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Integracion/salir.png"))); // NOI18N
        salir.setToolTipText("Salir");
        salir.setBorderPainted(false);
        salir.setNextFocusableComponent(fx);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);

        res.setColumns(20);
        res.setEditable(false);
        res.setFont(new java.awt.Font("Ubuntu", 0, 26)); // NOI18N
        res.setRows(5);
        res.setFocusable(false);
        res.setNextFocusableComponent(fx);
        jScrollPane1.setViewportView(res);

        jLabel2.setText("Numero de Subintervalos");

        n.setNextFocusableComponent(A);

        jLabel3.setText("A");

        jLabel4.setText("B");

        A.setNextFocusableComponent(B);

        B.setNextFocusableComponent(aceptar);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Integracion/limpiar.png"))); // NOI18N
        jButton1.setToolTipText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        metodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(metodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addComponent(fx, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(4, 4, 4)
                                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)))
                                        .addGap(4, 4, 4)
                                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
      f = new double[Integer.parseInt(n.getValue().toString())+1];
      double h = (Double.parseDouble(B.getValue().toString())-Double.parseDouble(A.getValue().toString()))/Double.parseDouble(n.getValue().toString());
      fun = new Funcion(fx.getText());
      int num = metodo.getSelectedIndex()+2;
      boolean correcto = true; String msg = "";
      double sum = 0;
      try {
        dividir(fun.Redondear(h));
      } catch (ParseException ex) {
        msg = "Función Incorrecta";
        correcto = false;
      }
      if(metodo.getSelectedIndex()==0){
        sum = sumatoria();
      }
      else{
        if (Integer.parseInt(n.getValue().toString())%2 != 0){
          msg = "Número de subintervalos Erróneo\nDebe ingresar un número Par.";
          correcto = false;
        }
        sum = sumatoriaSimpson();
      }
      if (correcto){
        String re = String.format("∫(%s)dx ≈\n(%s/%d)[%s] ≈\n%s", fx.getText(), Double.toString(fun.Redondear(h)), num, Double.toString(fun.Redondear(sum)), Double.toString(fun.Redondear((h/num)*(sum))));
        res.setText(re);
      }
      else{
        JOptionPane.showMessageDialog(null, msg, "ERROR", 0);
      }
    }//GEN-LAST:event_aceptarActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    n.setValue(0);
    A.setValue(0);
    B.setValue(0);
    res.setText(null);
    fx.setText(null);
    fx.requestFocus();
  }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Trapecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trapecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trapecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trapecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Trapecio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner A;
    private javax.swing.JSpinner B;
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField fx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox metodo;
    private javax.swing.JSpinner n;
    private javax.swing.JTextArea res;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
