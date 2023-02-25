
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class HomeFrame extends javax.swing.JFrame {
    final String dir = System.getProperty("user.dir");
    public HomeFrame() {
         initComponents();
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TitleHome = new javax.swing.JLabel();
        CodeSaleButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        DrinkButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jcafe88");

        TitleHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleHome.setForeground(new java.awt.Color(102, 0, 102));
        TitleHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleHome.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\icons8-coffee-beans-50.png")); // NOI18N
        TitleHome.setText("WELCOME TO JCAFE88!!!");

        CodeSaleButton.setIcon(new javax.swing.ImageIcon(dir +"\\src\\main\\java\\image\\sale resize.png")); // NOI18N
        CodeSaleButton.setText("Code Sale");
        CodeSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeSaleButtonActionPerformed(evt);
            }
        });

        CustomerButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\customer resize.png")); // NOI18N
        CustomerButton.setText("Customer");
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        OrderButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\order resize.png")); // NOI18N
        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        AdminButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\admin resize.png")); // NOI18N
        AdminButton.setText("Admin");
        AdminButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        //AdminButton.setBorder(new javax.swing.border.AbstractBorder(javax.swing.border.BevelBorder.RAISED));
        AdminButton.setDefaultCapable(false);
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        BillButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\bill resize.png")); // NOI18N
        BillButton.setText("Bill");
        BillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillButtonActionPerformed(evt);
            }
        });

        DrinkButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\drink resize.png")); // NOI18N
        DrinkButton.setText("    Drink");
        DrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(255, 51, 51));
        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setIcon(new javax.swing.ImageIcon(dir + "\\src\\main\\java\\image\\logout 30x30.png")); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LogoutButton)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TitleHome, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DrinkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodeSaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(168, 168, 168))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleHome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DrinkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeSaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(LogoutButton)
                        .addGap(79, 79, 79))))
        );

        getAccessibleContext().setAccessibleName("Welcome to Jcafe88\n");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void ShowHomeFrame() {
        final String dir = System.getProperty("user.dir");
            HomeFrame lf = new HomeFrame();
            try {
                lf.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(dir + "\\src\\main\\java\\image\\background-home.jpg")))));
            } catch (IOException e) {
            }
            lf.pack();
            lf.setLocationRelativeTo(null);
//                lf.add(lf.jPanel1);
            lf.add(lf.TitleHome);
            lf.add(lf.AdminButton);
            lf.add(lf.BillButton);
            lf.add(lf.CodeSaleButton);
            lf.add(lf.CustomerButton);
            lf.add(lf.DrinkButton);
            lf.add(lf.OrderButton);
            lf.add(lf.LogoutButton);
            lf.setVisible(true);
    }
    private void BillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillButtonActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        // TODO add your handling code here:
        AdminIndexForm jframe = new AdminIndexForm();
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        setVisible(false);
        jframe.setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        LoginJFrame jframe = new LoginJFrame();
        jframe.setDefaultCloseOperation(LoginJFrame.EXIT_ON_CLOSE);
        
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        setVisible(false);
        jframe.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        // TODO add your handling code here:
        CustomerCreateForm jframe = new CustomerCreateForm();
        jframe.setDefaultCloseOperation(CustomerCreateForm.EXIT_ON_CLOSE);
        
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        setVisible(false);
        jframe.setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void CodeSaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeSaleButtonActionPerformed
        // TODO add your handling code here:
        CodeSaleFrame.ShowCodeSaleFram();
    }//GEN-LAST:event_CodeSaleButtonActionPerformed

    private void DrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkButtonActionPerformed
        // TODO add your handling code here:
        DrinkIndexForm jframe = new DrinkIndexForm();
        jframe.setDefaultCloseOperation(DrinkIndexForm.EXIT_ON_CLOSE);
        
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        setVisible(false);
        jframe.setVisible(true);
    }//GEN-LAST:event_DrinkButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException{
        /* Create and display the form */
            ShowHomeFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton BillButton;
    private javax.swing.JButton CodeSaleButton;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton DrinkButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrderButton;
    private javax.swing.JLabel TitleHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
