package Juego;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Auto extends Thread{
    private final JLabel carro;
    private final Carrera carrera;
    private final String skin;
    
    public Auto(JLabel carro, Carrera carrera, String skin) {
        this.carro = carro;
        this.carrera = carrera;
        this.skin = skin;
    }
    public static List<Carro> carros = new ArrayList<>();
    boolean activo = true;
    
    @Override
    public void run() {
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        long empieza = System.currentTimeMillis();
        
        while (activo) {           
            try {
                sleep((int) (Math.random() * 100));
                x1 = carrera.pos_car1();
                x2 = carrera.pos_car2();
                x3 = carrera.pos_car3();
                x4 = carrera.pos_car4();
                if (x1 < carrera.pos_finish() && x2 < carrera.pos_finish() && x3 < carrera.pos_finish() && x4 < carrera.pos_finish()) {
                    carro.setLocation(carro.getLocation().x + 5, carro.getLocation().y);
                    carrera.repaint();
                } else {
                    break;
                }
            } catch (Exception e) {
            }
        }
        
        long finaliza = System.currentTimeMillis() - empieza;
        Carro car = new Carro(skin, (int) finaliza);
        carros.add(car);

        if (carros.size() == 4) {
            System.out.println(carros.toString());
            Podium p = new Podium();
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.top1, carros.get(0).getUrl());
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.top2, carros.get(1).getUrl());
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.top3, carros.get(2).getUrl());
            
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.a1, carros.get(0).getUrl());
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.a2, carros.get(1).getUrl());
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.a3, carros.get(2).getUrl());
            rsscalelabel.RSScaleLabel.setScaleLabel(Podium.a4, carros.get(3).getUrl());
            Podium.b1.setText(carros.get(0).getMilisegundos()/1000+","+carros.get(0).getMilisegundos()%1000+" s.");
            Podium.b2.setText(carros.get(1).getMilisegundos()/1000+","+carros.get(1).getMilisegundos()%1000+" s.");
            Podium.b3.setText(carros.get(2).getMilisegundos()/1000+","+carros.get(2).getMilisegundos()%1000+" s.");
            Podium.b4.setText(carros.get(3).getMilisegundos()/1000+","+carros.get(3).getMilisegundos()%1000+" s.");
            
            p.setVisible(true);
            carrera.dispose();
            
        }
    }

}
