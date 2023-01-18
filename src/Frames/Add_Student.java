/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ifti-baloch
 */
public class Add_Student extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Add_Student() {
        initComponents();
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
        semesterComBox = new javax.swing.JComboBox<>();
        sessionTxt = new javax.swing.JTextField();
        deptComBox = new javax.swing.JComboBox<>();
        contactTxt = new javax.swing.JTextField();
        fatherNameTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        cnicTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add a Student");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        semesterComBox.setBackground(new java.awt.Color(0, 204, 204));
        semesterComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        semesterComBox.setBorder(javax.swing.BorderFactory.createTitledBorder("semester"));

        sessionTxt.setBackground(new java.awt.Color(0, 204, 204));
        sessionTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("session"));

        deptComBox.setBackground(new java.awt.Color(0, 204, 204));
        deptComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        deptComBox.setBorder(javax.swing.BorderFactory.createTitledBorder("department"));

        contactTxt.setBackground(new java.awt.Color(0, 204, 204));
        contactTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("contact"));

        fatherNameTxt.setBackground(new java.awt.Color(0, 204, 204));
        fatherNameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("father name"));

        nameTxt.setBackground(new java.awt.Color(0, 204, 204));
        nameTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("name"));

        cnicTxt.setBackground(new java.awt.Color(0, 204, 204));
        cnicTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("cnic"));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Add Student");

        saveBtn.setBackground(new java.awt.Color(153, 255, 153));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/save.png"))); // NOI18N
        saveBtn.setText("save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(250, 148, 148));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/cross.png"))); // NOI18N
        closeBtn.setText("close");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTxt)
                            .addComponent(cnicTxt)
                            .addComponent(fatherNameTxt)
                            .addComponent(contactTxt)
                            .addComponent(deptComBox, 0, 432, Short.MAX_VALUE)
                            .addComponent(sessionTxt)
                            .addComponent(semesterComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(cnicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fatherNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deptComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semesterComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(closeBtn))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String cnic = cnicTxt.getText();
        String name = nameTxt.getText();
        String fatherName = fatherNameTxt.getText();
        String contact = contactTxt.getText();
        String department = (String) deptComBox.getSelectedItem();
        String session = sessionTxt.getText();
        String semester = (String) semesterComBox.getSelectedItem();
        try {
            String user = "iftidev";
            String password = "balochistan";
            String url = "jdbc:mysql://localhost:3306/LMS";
            Class.forName("com.mysql.cj.jdbc.Driver");

            java.sql.Connection con = DriverManager.getConnection(url, user, password);

//            Connection con = (Connection) ConnectionProvider.getCon();
            Statement statement = (Statement) con.createStatement();
            String insert = "INSERT INTO `LMS`.`STUDENT` "
                    + " VALUES ('" + cnic + "', '" + name + "', '" + fatherName + "', '" + contact + "',"
                    + " '" + session + "', '" + semester + "', '" + department + "')";

            statement.execute(insert);
            JOptionPane.showMessageDialog(null,"Student added successfully!");

            setVisible(false);
            new Add_Student().setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e);
            e.printStackTrace();

        }


    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField cnicTxt;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JComboBox<String> deptComBox;
    private javax.swing.JTextField fatherNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> semesterComBox;
    private javax.swing.JTextField sessionTxt;
    // End of variables declaration//GEN-END:variables
}
