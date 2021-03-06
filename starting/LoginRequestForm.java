/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starting;

/**
 *
 * @author Utkarsh
 */
public class LoginRequestForm extends javax.swing.JFrame
{

    String type;

    /**
     * Creates new form LoginRequest
     */
    public LoginRequestForm()
    {
        initComponents();
        lblManagerLogin.setText("<html><body>Find everything you need<br> to manage your restaurant.</body></html>");
        lblCustomerLogin.setText("<html><body>Find out the latest offers,<br> most selling food, review order<br> history,and more.</body></html>");
        this.setLocationRelativeTo(null); //center form in screen
    }

    public void openLoginForm()
    {
        LoginForm login = new LoginForm(type);
        login.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnManagerLoginReq = new javax.swing.JButton();
        lblManagerLogin = new javax.swing.JLabel();
        btnKitchenLoginReq = new javax.swing.JButton();
        lblCustomerLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnCustomerLoginReq1 = new javax.swing.JButton();
        lblCustomerLogin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Request");
        setBackground(new java.awt.Color(255, 213, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnManagerLoginReq.setFont(new java.awt.Font("Rockwell Condensed", 1, 28)); // NOI18N
        btnManagerLoginReq.setBorderPainted(false);
        btnManagerLoginReq.setContentAreaFilled(false);
        btnManagerLoginReq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManagerLoginReq.setLabel("Manager Login");
        btnManagerLoginReq.setName(""); // NOI18N
        btnManagerLoginReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerLoginReqActionPerformed(evt);
            }
        });

        lblManagerLogin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblManagerLogin.setText("Find everything you need");

        btnKitchenLoginReq.setBackground(new java.awt.Color(255, 213, 0));
        btnKitchenLoginReq.setFont(new java.awt.Font("Rockwell Condensed", 1, 28)); // NOI18N
        btnKitchenLoginReq.setText("Kitchen Login");
        btnKitchenLoginReq.setBorderPainted(false);
        btnKitchenLoginReq.setContentAreaFilled(false);
        btnKitchenLoginReq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKitchenLoginReq.setName(""); // NOI18N
        btnKitchenLoginReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitchenLoginReqActionPerformed(evt);
            }
        });

        lblCustomerLogin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCustomerLogin.setText("Find everything you need");

        jPanel2.setBackground(new java.awt.Color(255, 213, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(396, 70));

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("Vishwakarma Institute of Technology College Canteen");
        lbLogo.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCustomerLoginReq1.setBackground(new java.awt.Color(255, 213, 0));
        btnCustomerLoginReq1.setFont(new java.awt.Font("Rockwell Condensed", 1, 28)); // NOI18N
        btnCustomerLoginReq1.setText("Customer Login");
        btnCustomerLoginReq1.setBorderPainted(false);
        btnCustomerLoginReq1.setContentAreaFilled(false);
        btnCustomerLoginReq1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomerLoginReq1.setName(""); // NOI18N
        btnCustomerLoginReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerLoginReq1ActionPerformed(evt);
            }
        });

        lblCustomerLogin1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCustomerLogin1.setText("Find everything you need  related to kitchen staff");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnManagerLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblManagerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(48, 48, 48)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerLoginReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKitchenLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCustomerLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(306, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(349, 349, 349)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerLoginReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKitchenLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManagerLoginReq, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManagerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );

        btnManagerLoginReq.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKitchenLoginReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitchenLoginReqActionPerformed

        type = "Kitchen";
        openLoginForm();
    }//GEN-LAST:event_btnKitchenLoginReqActionPerformed

    private void btnManagerLoginReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerLoginReqActionPerformed
        // TODO add your handling code here:
        type = "Manager";
        openLoginForm();
    }//GEN-LAST:event_btnManagerLoginReqActionPerformed

    private void btnCustomerLoginReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerLoginReq1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        type = "Customer";
        openLoginForm();
    }//GEN-LAST:event_btnCustomerLoginReq1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginRequestForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerLoginReq1;
    private javax.swing.JButton btnKitchenLoginReq;
    private javax.swing.JButton btnManagerLoginReq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lblCustomerLogin;
    private javax.swing.JLabel lblCustomerLogin1;
    private javax.swing.JLabel lblManagerLogin;
    // End of variables declaration//GEN-END:variables
}
