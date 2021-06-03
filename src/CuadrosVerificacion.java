import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuadrosVerificacion {
    private JCheckBox chkCharmander;
    private JCheckBox chkSquirtle;
    private JCheckBox chkBulbasur;
    private JButton btnAceptar;
    private JLabel IblMensaje;
    private JPanel pnl1;


    public CuadrosVerificacion() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="Inicial elegido: ";
                if (chkCharmander.isSelected()){
                    mensaje=mensaje+" Charmander";
                }
                if (chkBulbasur.isSelected()){
                    mensaje=mensaje+" Bulbasur";
                }
                if (chkSquirtle.isSelected()){
                    mensaje=mensaje+" Squirtle";
                }
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadrosVerificacion");
        frame.setContentPane(new CuadrosVerificacion().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

