package decremento;

import etiqueta.EtiquetaContador;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonDecrementar extends JButton {
    public BotonDecrementar(EtiquetaContador etiquetaContador) {
        super("Decrementar");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaContador.setValor(etiquetaContador.getValor() - 1);
            }
        });
    }
}