package metodosnumericos;

import javax.swing.JOptionPane;
import org.nfunk.jep.ParseException;

/**
 *
 * @author jam2
 */
public class FalsaPos extends javax.swing.JFrame {

    private Funcion F;
    
    public FalsaPos() {
        initComponents();
        setLocationRelativeTo(null);
        fun.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txl = new javax.swing.JTextField();
        txu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Res = new javax.swing.JTextArea();
        Borrar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Falsa Posición");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Falsa");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel1.setText("Xl");

        jLabel2.setText("Xu");

        txl.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txl.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txl.setName("txl");
        txl.setNextFocusableComponent(txu);

        txu.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txu.setNextFocusableComponent(Aceptar);

        Res.setColumns(20);
        Res.setEditable(false);
        Res.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        Res.setRows(5);
        Res.setNextFocusableComponent(salir);
        jScrollPane1.setViewportView(Res);

        Borrar.setText("Borrar");
        Borrar.setNextFocusableComponent(salir);
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.setNextFocusableComponent(Borrar);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setNextFocusableComponent(fun);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setText("Función");

        fun.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        fun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fun.setNextFocusableComponent(txl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(salir)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txu)
                                    .addComponent(txl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Aceptar)
                        .addGap(16, 16, 16)
                        .addComponent(Borrar)
                        .addGap(36, 36, 36)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Res.setText(null);
        txu.setText(null);
        txl.setText(null);
        fun.setText(null);
        fun.requestFocus();
    }//GEN-LAST:event_BorrarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        double x = 0, xl = 0, xu = 0, Ear = 0;
        int max = 0, dec = 0;
        Res.setText(null);
        F = new Funcion(fun.getText());
        int i = 0;
        String r = "";
        boolean si=true;
        double tol = 0; max = 0;
        double fxl=0, fxu=0, fx=0;
        
        do{
            try {
                if(i==0){
                    xl = Double.parseDouble(txl.getText());
                    xu = Double.parseDouble(txu.getText());
                    dec = F.decimales();
                    if(F.menu() == 1)
                        max = F.iteraciones();
                    else
                        tol = F.tolerancia();
                }
                fxl = F.Redondear(F.Evaluar(xl), dec);
                fxu = F.Redondear(F.Evaluar(xu), dec);
                double xAnt = x;
                x = F.Redondear(xu - ((fxu * (xl - xu)) / (fxl - fxu)), dec);
                fx = F.Redondear(F.Evaluar(x), dec);
                Ear = F.Redondear(Math.abs((x - xAnt) / x), dec > 10 ? dec : 8);
                if(max > 1 || Ear >= tol){
                    if (fx * fxu < 0) {
                        xl = x;
                    } else if (fx * fxl < 0) {
                        xu = x;
                    } else if(fx * fxu == 0 || fx * fxl == 0){
                            max = 0;
                            tol = 0;
                    }else{
                        max = 0;
                        tol = 0;
                        r = "Valores Limites \nIncorrectos\nLa Función Diverge";
                        si = false;
                        Res.setText(r);
                    }
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valores limites Incorrectos", "ERROR", 0);
                max = 0;
                tol = 0;
                txl.setText(null);
                txu.setText(null);
                txl.requestFocus();
                si = false;
            }catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
                max = 0;
                tol = 0;
                fun.requestFocus();
                si = false;
            }
            i++;
            if(tol == 0)
                max--;
            else
                if(Ear < tol && i != 1)
                    tol = 0;
        }while(max > 0 || tol > 0 && i < 500);
        r += ("Iteración: " + i + "\nXl          : " + xl + "\nF(Xl)     : " + fxl + "\n"
            + "Xu        : " + xu + "\nF(Xu)    : " + fxu + "\nX" + i + "        : " + x + "\n"
            + "F(X)     : " + fx + "\nEr         : " + Ear + "\n\n");
        if (si){
            JOptionPane.showMessageDialog(null, "Iteraciones Realizadas!", "Resultados", JOptionPane.INFORMATION_MESSAGE);
            Res.setText(r + "\nRespuesta Aproximada\nX ≈  " + x);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FalsaPos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FalsaPos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextArea Res;
    private javax.swing.JTextField fun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txl;
    private javax.swing.JTextField txu;
    // End of variables declaration//GEN-END:variables
}
