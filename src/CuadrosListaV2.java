import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CuadrosListaV2 {
    private JPanel pnl1;
    private JList lstHabilidades;
    private JLabel IblMensaje;


    public CuadrosListaV2() {
        lstHabilidades.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje="La/s habilidad/es seleccionada/s es/son: "+lstHabilidades.getSelectedValuesList().toString();
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadrosListaV2");
        frame.setContentPane(new CuadrosListaV2().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

