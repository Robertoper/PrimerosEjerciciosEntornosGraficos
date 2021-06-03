import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuadrosLista {
    private JPanel panel1;
    private JButton btnAceptar;
    private JLabel IblMensaje;
    private JList lstHabilidades;


    public CuadrosLista() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="La/s habilidad/es seleccionada/s es/son: "+lstHabilidades.getSelectedValuesList().toString();
                IblMensaje.setText(mensaje);

            }
        });

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadrosLista");
        frame.setContentPane(new CuadrosLista().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
