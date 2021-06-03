import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CuadroCombinadoBotonesEtiqueta {
    private JComboBox cmbNumeros;
    private JPanel panel1;
    private JButton btnPares;
    private JButton btnImpares;
    private JLabel IblMensaje;

    public CuadroCombinadoBotonesEtiqueta() {
        btnPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel modelo= new DefaultComboBoxModel();
                modelo.addElement("Número 0");
                modelo.addElement("Número 2");
                modelo.addElement("Número 4");
                modelo.addElement("Número 6");
                modelo.addElement("Número 8");
                modelo.addElement("Número 10");
                modelo.addElement("Número 12");
                modelo.addElement("Número 14");
                modelo.addElement("Número 16");
                modelo.addElement("Número 18");
                cmbNumeros.setModel(modelo);

            }
        });
        btnImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel modelo= new DefaultComboBoxModel();
                modelo.addElement("Número 1");
                modelo.addElement("Número 3");
                modelo.addElement("Número 5");
                modelo.addElement("Número 7");
                modelo.addElement("Número 9");
                modelo.addElement("Número 11");
                modelo.addElement("Número 13");
                modelo.addElement("Número 15");
                modelo.addElement("Número 17");
                modelo.addElement("Número 19");
                cmbNumeros.setModel(modelo);
            }
        });
        cmbNumeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje=cmbNumeros.getSelectedItem().toString();
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadroCombinadoBotonesEtiqueta");
        frame.setContentPane(new CuadroCombinadoBotonesEtiqueta().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
