package Views;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

public class View extends javax.swing.JFrame {

    private ViewAndHalf ViewAndHalf;

    public View() {
        initComponents();
        setTitle("Calculadora");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        addSubBtn = new javax.swing.JButton();
        sqrBtn = new javax.swing.JButton();
        expBtn = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        percBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        tanBtn = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        res = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 70)); // NOI18N
        jLabel1.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 55, 86));
        setResizable(false);

        panel.setInheritsPopupMenu(true);
        panel.setLayout(new java.awt.GridLayout(6, 4));

        addSubBtn.setBackground(new java.awt.Color(140, 134, 129));
        addSubBtn.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        addSubBtn.setForeground(new java.awt.Color(64, 55, 48));
        addSubBtn.setText("+/-");
        addSubBtn.setBorder(null);
        addSubBtn.setBorderPainted(false);
        addSubBtn.setFocusable(false);
        panel.add(addSubBtn);
        addSubBtn.getAccessibleContext().setAccessibleName("");

        sqrBtn.setBackground(new java.awt.Color(140, 134, 129));
        sqrBtn.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        sqrBtn.setForeground(new java.awt.Color(64, 55, 48));
        sqrBtn.setText("√x");
        sqrBtn.setBorder(null);
        sqrBtn.setBorderPainted(false);
        sqrBtn.setFocusable(false);
        panel.add(sqrBtn);
        sqrBtn.getAccessibleContext().setAccessibleName("");

        expBtn.setBackground(new java.awt.Color(140, 134, 129));
        expBtn.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        expBtn.setForeground(new java.awt.Color(64, 55, 48));
        expBtn.setText("x²");
        expBtn.setBorder(null);
        expBtn.setBorderPainted(false);
        panel.add(expBtn);

        btnCE.setBackground(new java.awt.Color(255, 122, 97));
        btnCE.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btnCE.setForeground(new java.awt.Color(64, 55, 48));
        btnCE.setText("«");
        btnCE.setBorder(null);
        btnCE.setBorderPainted(false);
        btnCE.setFocusable(false);
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        panel.add(btnCE);
        btnCE.getAccessibleContext().setAccessibleName("");

        btn7.setBackground(new java.awt.Color(217, 216, 215));
        btn7.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn7.setForeground(new java.awt.Color(64, 55, 48));
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setFocusable(false);
        panel.add(btn7);
        btn7.getAccessibleContext().setAccessibleName("");

        btn8.setBackground(new java.awt.Color(217, 216, 215));
        btn8.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn8.setForeground(new java.awt.Color(64, 55, 48));
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setFocusable(false);
        panel.add(btn8);
        btn8.getAccessibleContext().setAccessibleName("");

        btn9.setBackground(new java.awt.Color(217, 216, 215));
        btn9.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn9.setForeground(new java.awt.Color(64, 55, 48));
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setFocusable(false);
        panel.add(btn9);
        btn9.getAccessibleContext().setAccessibleName("");

        divBtn.setBackground(new java.awt.Color(140, 134, 129));
        divBtn.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        divBtn.setForeground(new java.awt.Color(64, 55, 48));
        divBtn.setText("/");
        divBtn.setBorder(null);
        divBtn.setBorderPainted(false);
        divBtn.setFocusable(false);
        panel.add(divBtn);
        divBtn.getAccessibleContext().setAccessibleName("");

        btn4.setBackground(new java.awt.Color(217, 216, 215));
        btn4.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn4.setForeground(new java.awt.Color(64, 55, 48));
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setFocusable(false);
        panel.add(btn4);
        btn4.getAccessibleContext().setAccessibleName("");

        btn5.setBackground(new java.awt.Color(217, 216, 215));
        btn5.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn5.setForeground(new java.awt.Color(64, 55, 48));
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setFocusable(false);
        panel.add(btn5);
        btn5.getAccessibleContext().setAccessibleName("");

        btn6.setBackground(new java.awt.Color(217, 216, 215));
        btn6.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn6.setForeground(new java.awt.Color(64, 55, 48));
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setFocusable(false);
        panel.add(btn6);
        btn6.getAccessibleContext().setAccessibleName("");

        btnMult.setBackground(new java.awt.Color(140, 134, 129));
        btnMult.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        btnMult.setForeground(new java.awt.Color(64, 55, 48));
        btnMult.setText("X");
        btnMult.setBorder(null);
        btnMult.setBorderPainted(false);
        btnMult.setFocusable(false);
        panel.add(btnMult);
        btnMult.getAccessibleContext().setAccessibleName("");

        btn1.setBackground(new java.awt.Color(217, 216, 215));
        btn1.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(64, 55, 48));
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setFocusable(false);
        panel.add(btn1);
        btn1.getAccessibleContext().setAccessibleName("");

        btn2.setBackground(new java.awt.Color(217, 216, 215));
        btn2.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn2.setForeground(new java.awt.Color(64, 55, 48));
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setFocusable(false);
        panel.add(btn2);
        btn2.getAccessibleContext().setAccessibleName("");

        btn3.setBackground(new java.awt.Color(217, 216, 215));
        btn3.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn3.setForeground(new java.awt.Color(64, 55, 48));
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setFocusable(false);
        panel.add(btn3);
        btn3.getAccessibleContext().setAccessibleName("");

        btnSub.setBackground(new java.awt.Color(140, 134, 129));
        btnSub.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        btnSub.setForeground(new java.awt.Color(64, 55, 48));
        btnSub.setText("-");
        btnSub.setBorder(null);
        btnSub.setBorderPainted(false);
        btnSub.setFocusable(false);
        panel.add(btnSub);
        btnSub.getAccessibleContext().setAccessibleName("");

        btnPoint.setBackground(new java.awt.Color(217, 216, 215));
        btnPoint.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btnPoint.setForeground(new java.awt.Color(64, 55, 48));
        btnPoint.setText(".");
        btnPoint.setBorder(null);
        btnPoint.setBorderPainted(false);
        btnPoint.setFocusable(false);
        panel.add(btnPoint);
        btnPoint.getAccessibleContext().setAccessibleName("");

        btn0.setBackground(new java.awt.Color(217, 216, 215));
        btn0.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btn0.setForeground(new java.awt.Color(64, 55, 48));
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setFocusable(false);
        panel.add(btn0);
        btn0.getAccessibleContext().setAccessibleName("");

        btnC.setBackground(new java.awt.Color(217, 216, 215));
        btnC.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btnC.setForeground(new java.awt.Color(64, 55, 48));
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setFocusable(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        panel.add(btnC);
        btnC.getAccessibleContext().setAccessibleName("");

        btnAdd.setBackground(new java.awt.Color(140, 134, 129));
        btnAdd.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(64, 55, 48));
        btnAdd.setText("+");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusable(false);
        panel.add(btnAdd);
        btnAdd.getAccessibleContext().setAccessibleName("");

        percBtn.setBackground(new java.awt.Color(217, 216, 215));
        percBtn.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        percBtn.setForeground(new java.awt.Color(64, 55, 48));
        percBtn.setText("%");
        percBtn.setBorder(null);
        percBtn.setBorderPainted(false);
        percBtn.setFocusable(false);
        panel.add(percBtn);

        cosBtn.setBackground(new java.awt.Color(217, 216, 215));
        cosBtn.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        cosBtn.setForeground(new java.awt.Color(64, 55, 48));
        cosBtn.setText(" ");
        cosBtn.setBorder(null);
        cosBtn.setBorderPainted(false);
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });
        panel.add(cosBtn);

        tanBtn.setBackground(new java.awt.Color(217, 216, 215));
        tanBtn.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        tanBtn.setForeground(new java.awt.Color(64, 55, 48));
        tanBtn.setText(" ");
        tanBtn.setBorder(null);
        tanBtn.setBorderPainted(false);
        tanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanBtnActionPerformed(evt);
            }
        });
        panel.add(tanBtn);

        btnEquals.setBackground(new java.awt.Color(242, 242, 242));
        btnEquals.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(89, 80, 71));
        btnEquals.setText("=");
        btnEquals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEquals.setFocusable(false);
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        panel.add(btnEquals);
        btnEquals.getAccessibleContext().setAccessibleName("");

        res.setFont(new java.awt.Font("Leelawadee", 0, 48)); // NOI18N
        res.setForeground(new java.awt.Color(64, 55, 48));
        res.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        res.setText("0");
        res.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        res.setMaximumSize(new java.awt.Dimension(347, 200));
        res.setMinimumSize(new java.awt.Dimension(347, 200));
        res.setPreferredSize(new java.awt.Dimension(347, 200));

        jButton1.setBackground(new java.awt.Color(140, 134, 129));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        ViewAndHalf = new ViewAndHalf();
        ViewAndHalf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ViewAndHalf.show();
    }//GEN-LAST:event_cosBtnActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCEActionPerformed

    private void tanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanBtnActionPerformed
        String caminhoArquivo = "C:\\Temp\\log.csv";

        File arquivo = new File(caminhoArquivo);

        if (arquivo.exists()) {
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedOperationException e) {
                System.out.println("Operação não suportada. Verifique se o ambiente suporta operações de desktop.");
            }
        } else {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
    }//GEN-LAST:event_tanBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String caminhoArquivo = "C:\\Temp\\log.csv";

        File arquivo = new File(caminhoArquivo);

        if (arquivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addSubBtn;
    public javax.swing.JButton btn0;
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JButton btn3;
    public javax.swing.JButton btn4;
    public javax.swing.JButton btn5;
    public javax.swing.JButton btn6;
    public javax.swing.JButton btn7;
    public javax.swing.JButton btn8;
    public javax.swing.JButton btn9;
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnC;
    public javax.swing.JButton btnCE;
    public javax.swing.JButton btnEquals;
    public javax.swing.JButton btnMult;
    public javax.swing.JButton btnPoint;
    public javax.swing.JButton btnSub;
    public javax.swing.JButton cosBtn;
    public javax.swing.JButton divBtn;
    public javax.swing.JButton expBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    public javax.swing.JButton percBtn;
    public javax.swing.JLabel res;
    public javax.swing.JButton sqrBtn;
    public javax.swing.JButton tanBtn;
    // End of variables declaration//GEN-END:variables
}
