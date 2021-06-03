import javax.swing.*;
import java.awt.event.*;

public class CuadroListaBotonesEtiqueta {
    private JPanel pnl1;
    private JList lstGeneraciones;
    private JButton btnGeneracion1;
    private JButton btnGeneracion2;
    private JLabel IblMensaje;

    public CuadroListaBotonesEtiqueta() {
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
        lstGeneraciones.addComponentListener(new ComponentAdapter() {
        });
        lstGeneraciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje="Elegido: "+lstGeneraciones.getSelectedValuesList().toString();
                IblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CuadroListaBotonesEtiqueta");
        frame.setContentPane(new CuadroListaBotonesEtiqueta().pnl1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
