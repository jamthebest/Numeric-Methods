package metodosnumericos;

import javax.swing.JOptionPane;
import org.nfunk.jep.ParseException;

/**
 *
 * @author jam2
 */
public class Biseccion extends javax.swing.JFrame {

    private double c;
    private double a;
    private double b;
    private double Ear;
    private int max;
    private int dec;
    private Funcion F;
    
    
    public Biseccion() {
        initComponents();
        setLocationRelativeTo(null);
        fun.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Res = new javax.swing.JTextArea();
        Borrar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Bisección");
        setName("Biseccion");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel1.setText("a");

        jLabel2.setText("b");

        txta.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txta.setName("txta");
        txta.setNextFocusableComponent(txtb);

        txtb.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txtb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtb.setNextFocusableComponent(Aceptar);

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

        salir.setBackground(new java.awt.Color(242, 241, 240));
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
        fun.setNextFocusableComponent(txta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(salir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtb)
                                            .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3))))
                            .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Aceptar)
                        .addGap(16, 16, 16)
                        .addComponent(Borrar)
                        .addGap(27, 27, 27)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Res.setText(null);
        txtb.setText(null);
        txta.setText(null);
        fun.setText(null);
        fun.requestFocus();
    }//GEN-LAST:event_BorrarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        F = new Funcion(fun.getText());
        Res.setText(null);
        c = 0; int i = 0;
        String r = "";
        boolean si=true;
        double tol = 0; max = 0;
        double fa = 0;
        double fb = 0;
        double fc = 0;
        do{
            try {
                if(i==0){
                    a = Double.parseDouble(txta.getText());
                    b = Double.parseDouble(txtb.getText());
                    dec = F.decimales();
                    if(F.menu() == 1)
                        max = F.iteraciones();
                    else
                        tol = F.tolerancia();
                }
                fa = F.Redondear(F.Evaluar(a), dec);
                fb = F.Redondear(F.Evaluar(b), dec);
                double xAnt = c;
                
                c = F.Redondear(a + ((b-a)/2), dec);
                fc = F.Redondear(F.Evaluar(c), dec);
                Ear = F.Redondear(Math.abs((c - xAnt) / c), dec > 10 ? dec : 8);
                if(max > 1 || Ear >= tol){
                    if (fc * fb < 0) {
                        a = c;
                    } else if (fc * fa < 0) {
                        b = c;
                    } else if(fc * fa == 0 || fc * fb == 0){
                        max = 0;
                        tol = 0;
                    }
                    else{
                        max = 0;
                        tol = 0;
                        r = "Valores Limites \nIncorrectos\nLa Función Diverge";
                        si = false;
                        Res.setText(r);
                    }
                }
            }catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
                max = 0;
                tol = 0;
                fun.requestFocus();
                si = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valores limites Incorrectos", "ERROR", 0);
                max = 0;
                tol = 0;
                txta.setText(null);
                txtb.setText(null);
                txta.requestFocus();
                si = false;
            }
            i++;
            if(tol == 0)
                max--;
            else
                if(Ear < tol && i != 1)
                    tol = 0;
        }while(max > 0 || tol > 0 && i < 500);
        r += ("Iteración: " + i + "\na        : " + a + "\nF(a)    : " + fa + "\n"
            + "b        : " + b + "\nF(b)    : " + fb + "\nC" + i + "      : " + c + "\n"
            + "F(c)     : " + fc + "\nEr       : " + Ear + "\n\n");
        if (si){
            JOptionPane.showMessageDialog(null, "Iteraciones Realizadas!", "Resultados", JOptionPane.INFORMATION_MESSAGE);
            Res.setText(r + "\nRespuesta Aproximada\nX ≈  " + c);
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
            java.util.logging.Logger.getLogger(Biseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Biseccion().setVisible(true);
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
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables
}
