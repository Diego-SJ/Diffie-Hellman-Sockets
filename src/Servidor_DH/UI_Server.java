package Servidor_DH;

import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author juandiegosalasjimenez
 */
public class UI_Server extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form Main
     */
    public UI_Server() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(this.btnSend_A);
        Servidor s = new Servidor(5000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        this.jLabel6.setVisible(false);
        this.claveI.setVisible(false);
        this.btnSend_I.setVisible(false);
        this.btnCalculate_k1.setVisible(false);
        this.txtLog4.append("Log:\n====================================\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        claveB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        claveI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        claveA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSend_A = new javax.swing.JButton();
        btnSend_I = new javax.swing.JButton();
        btnCalculate_k1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        resFinal1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLog4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Servidor");

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("x");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("PingFang SC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Algoritmo de Diffie Hellman");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(238, 246, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Usuario 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(0, 153, 255))); // NOI18N

        claveB.setEditable(false);
        claveB.setPreferredSize(new java.awt.Dimension(90, 30));
        claveB.setSize(new java.awt.Dimension(90, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("b:");
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("i:");
        jLabel6.setPreferredSize(new java.awt.Dimension(30, 20));

        claveI.setPreferredSize(new java.awt.Dimension(90, 30));
        claveI.setSize(new java.awt.Dimension(90, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("a:");
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 20));

        claveA.setPreferredSize(new java.awt.Dimension(90, 30));
        claveA.setSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(claveI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(claveA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(claveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSend_A.setBackground(new java.awt.Color(0, 153, 255));
        btnSend_A.setForeground(new java.awt.Color(255, 255, 255));
        btnSend_A.setText("Enviar a");
        btnSend_A.setVerifyInputWhenFocusTarget(false);
        btnSend_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend_AActionPerformed(evt);
            }
        });

        btnSend_I.setBackground(new java.awt.Color(0, 153, 255));
        btnSend_I.setForeground(new java.awt.Color(0, 153, 255));
        btnSend_I.setText("Enviar I");
        btnSend_I.setVerifyInputWhenFocusTarget(false);
        btnSend_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend_IActionPerformed(evt);
            }
        });

        btnCalculate_k1.setBackground(new java.awt.Color(0, 153, 255));
        btnCalculate_k1.setForeground(new java.awt.Color(0, 153, 255));
        btnCalculate_k1.setText("Calcular K1");
        btnCalculate_k1.setVerifyInputWhenFocusTarget(false);
        btnCalculate_k1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate_k1ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setForeground(new java.awt.Color(102, 102, 102));
        btnClear.setText("Limpiar");
        btnClear.setVerifyInputWhenFocusTarget(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSend_A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend_I)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate_k1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend_A)
                    .addComponent(btnSend_I)
                    .addComponent(btnCalculate_k1)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resFinal1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        resFinal1.setForeground(new java.awt.Color(153, 0, 51));
        resFinal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtLog4.setEditable(false);
        txtLog4.setColumns(20);
        txtLog4.setRows(5);
        txtLog4.setBorder(null);
        jScrollPane5.setViewportView(txtLog4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSend_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend_AActionPerformed
        if(!this.claveA.getText().isEmpty()){
            if(Integer.parseInt(this.claveA.getText()) > 0){
                String cA = this.claveA.getText();
                Cliente c = new Cliente(6000, cA);
                Thread t = new Thread(c);
                t.start();
                this.jLabel6.setVisible(true);
                this.claveI.setVisible(true);
                this.btnSend_I.setVisible(true);
                this.btnSend_A.setVisible(false);
                this.txtLog4.append("Usuario 1 ha enviado a ("+cA+")\n---------------------------------------\n");
            } else {
                JOptionPane.showMessageDialog(null, " tiene que ser mayor que 0");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el valor de a.");
        }
    }//GEN-LAST:event_btnSend_AActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.claveA.setText("");
        this.claveA.setEditable(true);
        this.claveB.setText("");
        this.claveI.setText("");
        this.btnSend_A.setVisible(true);
        this.btnSend_I.setVisible(false);
        this.btnCalculate_k1.setVisible(false);
        this.jLabel6.setVisible(false);
        this.claveI.setVisible(false);
        this.claveI.setEditable(true);
        this.txtLog4.setText("");
        this.resFinal1.setText("");
        globalJ = 0;
        c = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int opc = JOptionPane.showConfirmDialog(null, 
                "¿Deseas salir?",
                "Salir",
                JOptionPane.YES_NO_OPTION);
        
        if(opc == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnSend_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend_IActionPerformed
        if(!this.claveB.getText().isEmpty()){
            if(this.claveI.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingresa el valor de i.");
            } else {
                int a = Integer.parseInt(this.claveA.getText());
                int b = Integer.parseInt(this.claveB.getText());
                int i = Integer.parseInt(this.claveI.getText());
                this.txtLog4.append("Usuario 1 ha ingresado i ("+i+")\n---------------------------------------\n");
                
                int I = calculate_I(a, b, i);
                this.txtLog4.append("Calculando I...\n");
                this.txtLog4.append("I = a^i mod b   =>   "+a+"^"+i+" mod "+b+"\n");
                this.txtLog4.append("Usuario 1 ha enviado I ("+I+")\n---------------------------------------\n");

                Cliente c = new Cliente(6000, String.valueOf(I));
                Thread t = new Thread(c);
                t.start();
                
                this.btnSend_I.setVisible(false);
                this.btnCalculate_k1.setVisible(true);
                this.claveA.setEditable(false);
                this.claveI.setEditable(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esperando respuesta del usuario 2...");
        }
    }//GEN-LAST:event_btnSend_IActionPerformed

    private void btnCalculate_k1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate_k1ActionPerformed
        if(globalJ != 0){
            int b = Integer.parseInt(this.claveB.getText());
            int i = Integer.parseInt(this.claveI.getText());
            int K1 = calculate_K1(globalJ,i,b);
            this.txtLog4.append("Calculando K1...\n");
            this.txtLog4.append("K1 = J^i mod b   =>   "+globalJ+"^"+i+" mod "+b+"\n====================================\n");
            this.txtLog4.append("FIN ALGORITMO\n");
            this.resFinal1.setText("K1 = "+K1);
            this.btnCalculate_k1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Esperando J del usuario 2...");
        }
    }//GEN-LAST:event_btnCalculate_k1ActionPerformed

    private int calculate_I(int a, int b, int i){
        return (int) ((Math.pow(a, i)) % b);
    }
    private int calculate_K1(double J, int i, int b){
        return (int) ((Math.pow(J, i)) % b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate_k1;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSend_A;
    private javax.swing.JButton btnSend_I;
    private javax.swing.JTextField claveA;
    private javax.swing.JTextField claveB;
    private javax.swing.JTextField claveI;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel resFinal1;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtLog1;
    private javax.swing.JTextArea txtLog2;
    private javax.swing.JTextArea txtLog3;
    private javax.swing.JTextArea txtLog4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable o, Object arg) {
        
        if(c == 0){
            String claveB = (String) arg;
            int b = Integer.parseInt(claveB);
            this.claveB.setText(String.valueOf(b));
            this.txtLog4.append("Usuario 2 ha enviado b ("+b+")\n---------------------------------------\n");
            c++;
        } else if(c > 0){
            String claveJ = (String) arg;
            this.txtLog4.append("Usuario 2 ha enviado J ("+claveJ+")\n---------------------------------------\n");
            
            globalJ = Integer.parseInt(claveJ);
            
            c = 0;
        }
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Server().setVisible(true);
            }
        });
    }
    
    int globalJ = 0;
    int c = 0;
}
