package reinicio;

import etiqueta.EtiquetaContador;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonReiniciar extends JButton {
    public BotonReiniciar(EtiquetaContador etiquetaContador) {
        super("Reiniciar");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaContador.setValor(0);
            }
        });
    }
}
