import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CuadroListaBotonesEtiquetaV2 {
    private JPanel panel1;
    private JList lstGeneraciones;
    private JButton btnGeneracion1;
    private JButton btnGeneracion2;
    private JButton btnVaciar;
    private JLabel IblMensaje;

    public CuadroListaBotonesEtiquetaV2() {
        btnGeneracion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo= new DefaultListModel();
                modelo.addElement("Charizard");
                modelo.addElement("Pikachu");
                modelo.addElement("Arcanine");
                lstGeneraciones.setModel(modelo);
            }
        });
        btnGeneracion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo= new DefaultListModel();
                modelo.addElement("Totodile");
                modelo.addElement("Heracross");
                modelo.addElement("Tyranitar");
                lstGeneraciones.setModel(modelo);
            }
        });
        lstGeneraciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje="Elegido: "+lstGeneraciones.getSelectedValuesList().toString();
                IblMensaje.setText(mensaje);
            }
        });
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IblMensaje.setText("Elegido:");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadroListaBotonesEtiquetaV2");
        frame.setContentPane(new CuadroListaBotonesEtiquetaV2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
