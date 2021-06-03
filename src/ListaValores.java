import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ListaValores {
    private JSpinner spnValor;
    private JPanel panel1;
    private JLabel IblMensaje;


    public ListaValores() {
        spnValor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                IblMensaje.setText("El valor es: "+spnValor.getValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ListaValores");
        frame.setContentPane(new ListaValores().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
