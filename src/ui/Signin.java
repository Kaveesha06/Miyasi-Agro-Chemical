package ui;

import hibernate.Admin;
import hibernate.HibernateUtil;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.SwingWorker;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.jdesktop.swingx.prompt.PromptSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Alert;
import util.Message;

public class Signin extends javax.swing.JFrame {
    
    private static Signin signin;
    
    public static synchronized Signin getInstance() {
        if (signin == null) {
            signin = new Signin();
        }
        return signin;
    }
    
    private Session session;
    private static final Logger logger = LoggerFactory.getLogger(Admin.class);
    
    private Signin() {
        initComponents();
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    private void addPlaceholders() {
        
        PromptSupport.setPrompt("User name here", userName);
        PromptSupport.setForeground(Color.decode("#006600"), userName);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, userName);
        
        PromptSupport.setPrompt("Password here", password);
        PromptSupport.setForeground(Color.decode("#006600"), password);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, password);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        pwico = new javax.swing.JLabel();
        userico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        userName.setBackground(new java.awt.Color(204, 255, 204));
        userName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 51, 0));
        userName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameKeyReleased(evt);
            }
        });

        password.setBackground(new java.awt.Color(204, 255, 204));
        password.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        password.setForeground(new java.awt.Color(0, 51, 0));
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jButton1.setText("Sign In");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pwico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(password)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(userico, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String base64Image
                    = "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";
            byte[] imageBytes = java.util.Base64.getDecoder().decode(base64Image);
            java.io.InputStream is = new java.io.ByteArrayInputStream(imageBytes);
            java.awt.image.BufferedImage bufferedImage = javax.imageio.ImageIO.read(is);
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(bufferedImage);
            
            logoLabel.setIcon(icon);
            
            String base64Image2
                    = "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";
            byte[] imageBytes2 = java.util.Base64.getDecoder().decode(base64Image2);
            java.io.InputStream is2 = new java.io.ByteArrayInputStream(imageBytes2);
            java.awt.image.BufferedImage bufferedImage2 = javax.imageio.ImageIO.read(is2);
            javax.swing.ImageIcon icon2 = new javax.swing.ImageIcon(bufferedImage2);
            
            userico.setIcon(icon2);
            
            String base64Image3
                    = "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";
            byte[] imageBytes3 = java.util.Base64.getDecoder().decode(base64Image3);
            java.io.InputStream is3 = new java.io.ByteArrayInputStream(imageBytes3);
            java.awt.image.BufferedImage bufferedImage3 = javax.imageio.ImageIO.read(is3);
            javax.swing.ImageIcon icon3 = new javax.swing.ImageIcon(bufferedImage3);
            
            pwico.setIcon(icon3);
            
            addPlaceholders();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adminValidation();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            password.grabFocus();
        }
    }//GEN-LAST:event_userNameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.grabFocus();
        }
    }//GEN-LAST:event_passwordKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pwico;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userico;
    // End of variables declaration//GEN-END:variables

    private void adminValidation() {
        String userName = this.userName.getText();
        String password = String.valueOf(this.password.getPassword());
        
        if (userName.isEmpty()) {
            Message.warning("User name Can't be Empty", "Empty");
        } else if (password.isEmpty()) {
            Message.warning("Password can't be Empy", "Empty");
        } else {
            try {
                
                Criteria adminCriteria = session.createCriteria(Admin.class);
                adminCriteria.add(Restrictions.eq("userName", userName));
                adminCriteria.add(Restrictions.eq("password", password));
                
                if (adminCriteria.list().isEmpty()) {
                    Message.error("Admin Not Found", "Invalid Data");
                } else {

                    //-------------------Loading Animation----------------------\\
                    LoadingScreen loading = new LoadingScreen();
                    loading.setVisible(true);
                    this.dispose();

                    // Run loading in a background thread (so GUI doesn’t freeze)
                    SwingWorker<Void, Void> worker = new SwingWorker<>() {
                        @Override
                        protected Void doInBackground() throws Exception {
                            // Simulate loading (replace with actual dashboard setup)
                            Thread.sleep(1500);
                            return null;
                        }
                        
                        @Override
                        protected void done() {
                            Dashboard.getInstance().setAdmin((Admin) adminCriteria.list().get(0));
                            Dashboard.getInstance().setVisible(true);
                            
                            loading.dispose();
                            
                        }
                    };
                    worker.execute();
                    //-------------------Loading Animation----------------------\\

//                    Dashboard.getInstance().setVisible(true);
//                    this.dispose();
                }
                
            } catch (Exception e) {
                logger.error("Can't find admin", e);
            }
        }
        
    }
}
