import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Deslizadores {
    private JSlider sldNivel;
    private JPanel panel1;
    private JLabel IblMensaje;


    public Deslizadores() {
        sldNivel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                String mensaje="El nivel del pokemon es: "+sldNivel.getValue();
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Deslizadores");
        frame.setContentPane(new Deslizadores().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
