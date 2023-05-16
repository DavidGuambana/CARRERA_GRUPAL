
package Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Tiempo extends Thread {

    public Tiempo() {
        t = new Timer(10, acciones);
    }
    private Timer t;
    public static int h, m, s, cs;
    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;
                ++h;
            }
            actualizarLabel();

        }
    };

    private void actualizarLabel() {
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        Carrera.xtiempo.setText(tiempo);
    }
    
    public void reiniciar() {
        h = 0;
        m = 0;
        s = 0;
        cs = 0;
        actualizarLabel();
    }
    public void parar(){
        t.stop();
    }
    public void reaunudar(){
        t.restart();
    }

    @Override
    public void run() {
        t.start();
    }    
}
