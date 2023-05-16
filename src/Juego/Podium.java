package Juego;


public class Podium extends javax.swing.JFrame {

    public Podium() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top1 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 150, 80));

        top3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(top3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 150, 80));

        top2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(top2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 150, 80));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESUMEN");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 759, 48));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b1.setText("tiempo 1");
        b1.setOpaque(true);
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 60, 163, 52));
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 60, 94, 52));
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 127, 94, 52));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b2.setText("tiempo 2");
        b2.setOpaque(true);
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 127, 163, 52));
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 60, 94, 52));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b3.setText("tiempo 3");
        b3.setOpaque(true);
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 163, 52));
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 127, 94, 52));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b4.setText("tiempo 4");
        b4.setOpaque(true);
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 127, 163, 52));

        jLabel3.setFont(new java.awt.Font("Onyx", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 127, 30, -1));

        jLabel4.setFont(new java.awt.Font("Onyx", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 60, 30, -1));

        jLabel5.setFont(new java.awt.Font("Onyx", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 30, -1));

        jLabel6.setFont(new java.awt.Font("Onyx", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("4");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, 759, 190));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/podium.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 759, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Podium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel a1;
    public static javax.swing.JLabel a2;
    public static javax.swing.JLabel a3;
    public static javax.swing.JLabel a4;
    public static javax.swing.JLabel b1;
    public static javax.swing.JLabel b2;
    public static javax.swing.JLabel b3;
    public static javax.swing.JLabel b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel top1;
    public static javax.swing.JLabel top2;
    public static javax.swing.JLabel top3;
    // End of variables declaration//GEN-END:variables
}
