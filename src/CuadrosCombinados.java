import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuadrosCombinados {
    private JPanel pnl1;
    private JComboBox cmbModoDeJuego;
    private JLabel IblMensaje;

    public CuadrosCombinados() {
        cmbModoDeJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="Modo de juego elegido es: ";
                mensaje=mensaje+cmbModoDeJuego.getSelectedItem().toString();
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadrosCombinados");
        frame.setContentPane(new CuadrosCombinados().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
