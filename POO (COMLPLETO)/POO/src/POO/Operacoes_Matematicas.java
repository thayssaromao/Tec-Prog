/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package POO;

/**
 *
 * @author thays
 */
public class Operacoes_Matematicas extends javax.swing.JFrame {

    /**
     * Creates new form Operacoes_Matematicas
     */
    public Operacoes_Matematicas() {
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

        label_Um = new javax.swing.JLabel();
        inserir = new javax.swing.JTextField();
        Botaocalcular = new javax.swing.JButton();
        result = new javax.swing.JScrollPane();
        resultadoInterface = new javax.swing.JTextArea();
        botaoLimpar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));

        label_Um.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Um.setForeground(new java.awt.Color(255, 255, 255));
        label_Um.setText("Calculo");

        inserir.setBackground(new java.awt.Color(255, 204, 204));
        inserir.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        Botaocalcular.setBackground(new java.awt.Color(255, 153, 153));
        Botaocalcular.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        Botaocalcular.setForeground(new java.awt.Color(255, 255, 255));
        Botaocalcular.setText("calcular");
        Botaocalcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botaocalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaocalcularActionPerformed(evt);
            }
        });

        resultadoInterface.setColumns(20);
        resultadoInterface.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        resultadoInterface.setRows(5);
        result.setViewportView(resultadoInterface);

        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoFechar.setText("fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Botaocalcular))
                    .addComponent(label_Um)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoFechar))
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_Um, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botaocalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoFechar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        resultadoInterface.setText(""); 
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void BotaocalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaocalcularActionPerformed
    try{
            resultadoInterface.setText("");
            
            int  n, dobro, triplo, quadrado, cubo;
            
            double raiz_quadrada;

            n = Integer.parseInt(inserir.getText());
            
            dobro = 2*n;
            triplo = 3*n;
            quadrado = (int)Math.pow(n, 2);
            cubo = (int)Math.pow(n, 3);
            raiz_quadrada = Math.sqrt(n);
            

            resultadoInterface.append(String.format("sendo n = %d, tem-se:\n", n));
            resultadoInterface.append(String.format("Dobro.......: %d\n", dobro));
            resultadoInterface.append(String.format("Triplo.......: %d\n", triplo));
            resultadoInterface.append(String.format("Quadruplo.......: %d\n", quadrado));
            resultadoInterface.append(String.format("Cubo.......: %d\n", cubo));
            resultadoInterface.append(String.format("Raiz quadrada.......: %.1f\n", raiz_quadrada));
            resultadoInterface.append(String.format("-------------------------------------\n"));

          }
        catch(java.lang.NumberFormatException erro){
        }
    }//GEN-LAST:event_BotaocalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Operacoes_Matematicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacoes_Matematicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacoes_Matematicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacoes_Matematicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacoes_Matematicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botaocalcular;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField inserir;
    private javax.swing.JLabel label_Um;
    private javax.swing.JScrollPane result;
    private javax.swing.JTextArea resultadoInterface;
    // End of variables declaration//GEN-END:variables
}