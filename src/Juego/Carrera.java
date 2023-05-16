
package Juego;


public class Carrera extends javax.swing.JFrame{
    public static boolean carrera_finalizada = false;
    String c1 = "src\\img\\c1.png";
    String c2 = "src\\img\\c2.png";
    String c3 = "src\\img\\c3.png";
    String c4 = "src\\img\\c4.png";
    String flag = "src\\img\\flag_icon.jpg";
    String paisaje_png = "src\\img\\paisaje.png";
    Tiempo T = new Tiempo();
    
     long startime;
    long finistime;
     long time;
    public static Auto h1, h2, h3, h4;
    public Carrera() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(bandera, flag);
        paisaje.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(paisaje_estatico, paisaje_png);
        
        h1 = new Auto(car1,this,c1);
        h2 = new Auto(car2,this,c2);
        h3 = new Auto(car3,this,c3);
        h4 = new Auto(car4,this,c4);
        
    }
    
    public void iniciar_carrera(){
        paisaje.setVisible(true);
        cargar_coches();
        car1.setLocation(10, car1.getLocation().y);
        car2.setLocation(10, car2.getLocation().y);
        car3.setLocation(10, car3.getLocation().y);
        car4.setLocation(10, car4.getLocation().y);
        h4.start();
        h3.start();
        h2.start();
        h1.start();
        paisaje_estatico.setVisible(false);
    }

    public void pausar_carrera() {
        h4.suspend();
        h3.suspend();
        h2.suspend();
        h1.suspend();
    }
    public void reaunudar_carrera() {
        h4.resume();
        h3.resume();
        h2.resume();
        h1.resume();
    }

    
    public void cargar_coches(){
        rsscalelabel.RSScaleLabel.setScaleLabel(car1, c1);
        rsscalelabel.RSScaleLabel.setScaleLabel(car2, c2);
        rsscalelabel.RSScaleLabel.setScaleLabel(car3, c3);
        rsscalelabel.RSScaleLabel.setScaleLabel(car4, c4);
    }
    public int pos_car1(){
        return car1.getLocation().x;
        
    }
    public int pos_car2(){
        return car2.getLocation().x;
    }
    public int pos_car3(){
        return car3.getLocation().x;
    }
    public int pos_car4(){
        return car4.getLocation().x;
    }
    public int pos_finish(){
        return finish.getLocation().x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xtiempo = new javax.swing.JTextField();
        paisaje_estatico = new javax.swing.JLabel();
        RESUME = new javax.swing.JButton();
        START = new javax.swing.JButton();
        STOP = new javax.swing.JButton();
        car4 = new javax.swing.JLabel();
        car3 = new javax.swing.JLabel();
        car2 = new javax.swing.JLabel();
        car1 = new javax.swing.JLabel();
        finish = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        linea4 = new javax.swing.JSeparator();
        linea3 = new javax.swing.JSeparator();
        linea2 = new javax.swing.JSeparator();
        linea1 = new javax.swing.JSeparator();
        carretera = new javax.swing.JLabel();
        paisaje = new javax.swing.JLabel();
        bandera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xtiempo.setEditable(false);
        xtiempo.setBackground(new java.awt.Color(0, 102, 255));
        xtiempo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        xtiempo.setForeground(new java.awt.Color(255, 255, 255));
        xtiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xtiempo.setText("00:00:00:00");
        xtiempo.setBorder(null);
        getContentPane().add(xtiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 130, 40));

        paisaje_estatico.setOpaque(true);
        getContentPane().add(paisaje_estatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        RESUME.setBackground(new java.awt.Color(0, 102, 204));
        RESUME.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RESUME.setForeground(new java.awt.Color(255, 255, 0));
        RESUME.setText("RESUME");
        RESUME.setBorder(null);
        RESUME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESUME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESUMEActionPerformed(evt);
            }
        });
        getContentPane().add(RESUME, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 130, 40));

        START.setBackground(new java.awt.Color(0, 102, 204));
        START.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        START.setForeground(new java.awt.Color(255, 255, 0));
        START.setText("START");
        START.setBorder(null);
        START.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        getContentPane().add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, 40));

        STOP.setBackground(new java.awt.Color(0, 102, 204));
        STOP.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        STOP.setForeground(new java.awt.Color(255, 255, 0));
        STOP.setText("STOP");
        STOP.setBorder(null);
        STOP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOPActionPerformed(evt);
            }
        });
        getContentPane().add(STOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 130, 40));

        car4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(car4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 40));

        car3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(car3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 40));

        car2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(car2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 40));

        car1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(car1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 40));

        finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finish.png"))); // NOI18N
        getContentPane().add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/start.png"))); // NOI18N
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        linea4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 770, 10));

        linea3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 770, 10));

        linea2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 770, 10));

        linea1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 190, 770, 10));

        carretera.setBackground(new java.awt.Color(51, 51, 51));
        carretera.setOpaque(true);
        getContentPane().add(carretera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 770, 272));

        paisaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paisaje_desert.gif"))); // NOI18N
        paisaje.setOpaque(true);
        getContentPane().add(paisaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        bandera.setBackground(new java.awt.Color(51, 51, 51));
        bandera.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bandera.setForeground(new java.awt.Color(255, 255, 255));
        bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandera.setOpaque(true);
        getContentPane().add(bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 130, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
       
        try {
            iniciar_carrera();
            
            T.start();
        } catch (Exception e) {
            T.reiniciar();
            System.out.println(Auto.carros);
            Auto.carros.clear();
        }
    }//GEN-LAST:event_STARTActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void STOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOPActionPerformed
        try {
            pausar_carrera();
                T.parar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_STOPActionPerformed

    private void RESUMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESUMEActionPerformed
        try {
            reaunudar_carrera();
            T.reaunudar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_RESUMEActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESUME;
    private javax.swing.JButton START;
    private javax.swing.JButton STOP;
    private javax.swing.JLabel bandera;
    public static javax.swing.JLabel car1;
    public static javax.swing.JLabel car2;
    public static javax.swing.JLabel car3;
    public static javax.swing.JLabel car4;
    private javax.swing.JLabel carretera;
    public static javax.swing.JLabel finish;
    private javax.swing.JSeparator linea1;
    private javax.swing.JSeparator linea2;
    private javax.swing.JSeparator linea3;
    private javax.swing.JSeparator linea4;
    public static javax.swing.JLabel paisaje;
    public static javax.swing.JLabel paisaje_estatico;
    private javax.swing.JLabel start;
    public static javax.swing.JTextField xtiempo;
    // End of variables declaration//GEN-END:variables

}
