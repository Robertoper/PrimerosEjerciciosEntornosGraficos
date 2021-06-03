import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesOpcion {
    private JPanel pnl1;
    private JRadioButton rbnRojo;
    private JRadioButton rbnVerde;
    private JRadioButton rbnAzul;
    private JPanel pnlColores;
    private JButton Aceptar;
    private JLabel iblMensaje;

    public BotonesOpcion() {
        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="Color elegido: ";
                if (rbnRojo.isSelected()){
                    mensaje=mensaje+" Rojo";
                }
                if (rbnAzul.isSelected()) {
                    mensaje=mensaje+" Azul";
                }
                if (rbnVerde.isSelected()){
                    mensaje=mensaje+" Verde";
                }
                iblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BotonesOpcion");
        frame.setContentPane(new BotonesOpcion().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
