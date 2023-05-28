package VIEW;

import CONTROL.GerenciadorVIEW;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private GerenciadorVIEW gerenciadorVIEW;
    
    public Login(GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pswSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        senha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblCarro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });

        lblSenha.setText("Senha");

        lblUsuario.setText("Usuário");

        btnLogin.setBackground(new java.awt.Color(255, 153, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mostrar_senha.png"))); // NOI18N
        senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaMouseClicked(evt);
            }
        });

        lblCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carroLogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblUsuario)
                            .addGap(10, 10, 10)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSenha)
                            .addGap(18, 18, 18)
                            .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSenha)
                        .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(senha))
                .addGap(50, 50, 50)
                .addComponent(btnLogin)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void pressionarEnter(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginActionPerformed(null);
        }
    }

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        pressionarEnter(evt);
    }//GEN-LAST:event_pswSenhaKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = txtUsuario.getText();
        String senha = String.valueOf(pswSenha.getPassword());

        if(usuario.equals("admin") && senha.equals("123")){
            gerenciadorVIEW.janelaPrincipal();
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(this, "O usuário ou senha informado estão incorretos.", "Erro ao realizar login", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        pressionarEnter(evt);
    }//GEN-LAST:event_btnLoginKeyPressed

    private void senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaMouseClicked
        if(pswSenha.getEchoChar() == '•'){
            pswSenha.setEchoChar('\u0000');
            senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder_senha.png")));
        } else{
            pswSenha.setEchoChar('•');
            senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mostrar_senha.png")));
        }
    }//GEN-LAST:event_senhaMouseClicked

    // <editor-fold defaultstate="collapsed" desc="Declaração de variáveis - Java Swing"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>  
}
