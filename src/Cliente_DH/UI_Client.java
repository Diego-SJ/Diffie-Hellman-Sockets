package Cliente_DH;

import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author juandiegosalasjimenez
 */
public class UI_Client extends javax.swing.JFrame implements Observer{

    public UI_Client() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(this.btnSend_B);
        Servidor s = new Servidor(6000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        this.jLabel6.setVisible(false);
        this.claveJ.setVisible(false);
        this.btnSend_J.setVisible(false);
        this.btnCalculate_K2.setVisible(false);
        this.txtLog.append("Log:\n====================================\n");
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
        claveJ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        claveA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSend_B = new javax.swing.JButton();
        btnSend_J = new javax.swing.JButton();
        btnCalculate_K2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        resFinal1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cliente");

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
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Usuario 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(0, 153, 255))); // NOI18N

        claveB.setPreferredSize(new java.awt.Dimension(90, 30));
        claveB.setSize(new java.awt.Dimension(90, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("b:");
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("j:");
        jLabel6.setPreferredSize(new java.awt.Dimension(30, 20));

        claveJ.setPreferredSize(new java.awt.Dimension(90, 30));
        claveJ.setSize(new java.awt.Dimension(90, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("a:");
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 20));

        claveA.setEditable(false);
        claveA.setPreferredSize(new java.awt.Dimension(90, 30));
        claveA.setSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
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
                .addComponent(claveJ, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSend_B.setBackground(new java.awt.Color(0, 153, 255));
        btnSend_B.setForeground(new java.awt.Color(255, 255, 255));
        btnSend_B.setText("Enviar b");
        btnSend_B.setVerifyInputWhenFocusTarget(false);
        btnSend_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend_BActionPerformed(evt);
            }
        });

        btnSend_J.setBackground(new java.awt.Color(0, 153, 255));
        btnSend_J.setForeground(new java.awt.Color(0, 153, 255));
        btnSend_J.setText("Enviar J");
        btnSend_J.setVerifyInputWhenFocusTarget(false);
        btnSend_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend_JActionPerformed(evt);
            }
        });

        btnCalculate_K2.setBackground(new java.awt.Color(0, 153, 255));
        btnCalculate_K2.setForeground(new java.awt.Color(0, 153, 255));
        btnCalculate_K2.setText("Calcular K2");
        btnCalculate_K2.setVerifyInputWhenFocusTarget(false);
        btnCalculate_K2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate_K2ActionPerformed(evt);
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
                .addComponent(btnSend_B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend_J)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate_K2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend_B)
                    .addComponent(btnSend_J)
                    .addComponent(btnCalculate_K2)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        resFinal1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        resFinal1.setForeground(new java.awt.Color(153, 0, 51));
        resFinal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setBorder(null);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnSend_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend_BActionPerformed
        if(!this.claveB.getText().isEmpty()){
            if(!this.claveA.getText().isEmpty()){
                int a = Integer.parseInt(this.claveA.getText());
                int b = Integer.parseInt(this.claveB.getText());
                if(b > a){
                    String cB = this.claveB.getText();
                    Cliente c = new Cliente(5000, cB);
                    Thread t = new Thread(c);
                    t.start();
                    this.jLabel6.setVisible(true);
                    this.claveJ.setVisible(true);
                    this.btnSend_J.setVisible(true);
                    this.btnSend_B.setVisible(false);
                    this.txtLog.append("Usuario 2 ha enviado b ("+cB+")\n---------------------------------------\n");
                } else {
                    JOptionPane.showMessageDialog(null, "b debe ser mayor que a.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Esperando respuesta del Usuario 1...");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el valor de b.");
        }
    }//GEN-LAST:event_btnSend_BActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.claveA.setText("");
        this.claveB.setText("");
        this.claveB.setEditable(true);
        this.claveJ.setText("");
        this.claveJ.setEditable(true);
        this.jLabel6.setVisible(false);
        this.claveJ.setVisible(false);
        this.btnSend_B.setVisible(true);
        this.btnSend_J.setVisible(false);
        this.btnCalculate_K2.setVisible(false);
        this.txtLog.setText("");
        this.resFinal1.setText("");
        globalI = 0;
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

    private void btnSend_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend_JActionPerformed
        if(this.claveJ.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa el valor de j.");
        } else {
            int a = Integer.parseInt(this.claveA.getText());
            int b = Integer.parseInt(this.claveB.getText());
            int j = Integer.parseInt(this.claveJ.getText());
            
            this.txtLog.append("Usuario 2 ha ingresado i ("+j+")\n---------------------------------------\n");
            int J = calculate_J(a, b, j);
            this.txtLog.append("Calculando J...\n");
            this.txtLog.append("J = a^j mod b   =>   "+a+"^"+j+" mod "+b+"\n");
            this.txtLog.append("Usuario 2 ha enviado J ("+J+")\n---------------------------------------\n");
            
            Cliente c = new Cliente(5000, String.valueOf(J));
            Thread t = new Thread(c);
            t.start();
            this.btnSend_J.setVisible(false);
            this.btnCalculate_K2.setVisible(true);
            this.claveB.setEditable(false);
            this.claveJ.setEditable(false);
        }
    }//GEN-LAST:event_btnSend_JActionPerformed

    private void btnCalculate_K2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate_K2ActionPerformed
        if(globalI != 0){
            int b = Integer.parseInt(this.claveB.getText());
            int j = Integer.parseInt(this.claveJ.getText());
            int K2 = calculate_K2(globalI,j,b);
            this.txtLog.append("Calculando K2...\n");
            this.txtLog.append("K2 = I^i mod b   =>   "+globalI+"^"+j+" mod "+b+"\n");
            this.txtLog.append("====================================\n");
            this.txtLog.append("FIN ALGORITMO\n");
            this.resFinal1.setText("K2 = "+K2);
            this.btnCalculate_K2.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Esperando I del usuario 1...");
        }
    }//GEN-LAST:event_btnCalculate_K2ActionPerformed

    private int calculate_J(int a, int b, int j){
        return (int) ((Math.pow(a, j)) % b);
    }
    private int calculate_K2(double I, int j, int b){
        return (int) ((Math.pow(I, j)) % b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate_K2;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSend_B;
    private javax.swing.JButton btnSend_J;
    private javax.swing.JTextField claveA;
    private javax.swing.JTextField claveB;
    private javax.swing.JTextField claveJ;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resFinal1;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable o, Object arg) {
        
        if(c == 0){
            String claveA = (String) arg;
            int a = Integer.parseInt(claveA);
            this.txtLog.append("Usuario 1 ha enviado a ("+a+")\n---------------------------------------\n");
            this.claveA.setText(String.valueOf(a));
            c++;
        }else if(c > 0){
            String claveI = (String) arg;
            this.txtLog.append("Usuario 1 ha enviado I ("+claveI+")\n---------------------------------------\n");
            globalI = Integer.parseInt(claveI);
            
            c = 0;
        }
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Client().setVisible(true);
            }
        });
    }
    
    int globalI = 0;
    int c = 0;
}
