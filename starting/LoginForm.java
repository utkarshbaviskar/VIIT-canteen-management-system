/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starting;

import customerPackage.Customer;
import javax.swing.JOptionPane;
import managerPackage.Manager;
import kitchenPackage.Kitchen;

/**
 *
 * @author Utkarsh
 */
public class LoginForm extends javax.swing.JFrame
{

    String type;

    /**
     * Creates new form Login
     */
    public LoginForm()
    {
        initComponents();
        this.setLocationRelativeTo(null); //center form in screen
    }

    public LoginForm(String s)
    {
        initComponents();
        txtPasswordLogin.setEchoChar('*');
        type = s;
        this.setLocationRelativeTo(null); //center form in screen
    }

    public static void setTextFields()
    {
        txtUsernameLogin.setText("");
        txtPasswordLogin.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbUsernameLogin = new javax.swing.JLabel();
        txtUsernameLogin = new javax.swing.JTextField();
        lblPasswordLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPasswordLogin = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        lbLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 213, 0));
        setName("Login"); // NOI18N
        setUndecorated(true);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 55)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("Login");
        lbLogo.setToolTipText("");

        lbUsernameLogin.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lbUsernameLogin.setText("Username");

        txtUsernameLogin.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        txtUsernameLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtUsernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameLoginActionPerformed(evt);
            }
        });

        lblPasswordLogin.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lblPasswordLogin.setText("Password");

        btnLogin.setBackground(new java.awt.Color(255, 213, 0));
        btnLogin.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(127, 72, 101));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPasswordLogin.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtPasswordLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtPasswordLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPasswordLogin.setName(""); // NOI18N
        txtPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordLoginActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 213, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(144, 70));

        lbLogo1.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo1.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        lbLogo1.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo1.setText("VIT Canteen");
        lbLogo1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(lbLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbLogo1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsernameLogin)
                            .addComponent(lblPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsernameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtPasswordLogin)
                            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lbLogo)
                .addGap(28, 28, 28)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameLoginActionPerformed

    private void txtPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try
        {
            String username = txtUsernameLogin.getText();
            String password = String.valueOf(txtPasswordLogin.getPassword());
            if (!username.isEmpty() && !password.isEmpty())
            {
                if ("Manager".equals(type))
                {
                    //logging in as manager
                    Manager m = new Manager();
                    boolean success = m.login(username, password); //search in Managers DB

                    if (success)
                    {
                        this.dispose();
                    }
                }
                
                else if ("Kitchen".equals(type)){
                    Kitchen kit = new Kitchen();
                    boolean success = kit.login(username, password);
                       if (success)
                    {
                        this.dispose();
                    }
                }
                else
                {
                    //logging in as customer
                    Customer c = new Customer();
                    boolean success = c.login(username, password); //search in customers DB
                    if (success)
                    {
                        this.dispose();
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please fill both TextFields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new LoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogo1;
    private javax.swing.JLabel lbUsernameLogin;
    private javax.swing.JLabel lblPasswordLogin;
    private javax.swing.JPanel pnlLogin;
    private static javax.swing.JPasswordField txtPasswordLogin;
    private static javax.swing.JTextField txtUsernameLogin;
    // End of variables declaration//GEN-END:variables
}
