package incremento;

import etiqueta.EtiquetaContador;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonIncrementar extends JButton {
    public BotonIncrementar(EtiquetaContador etiquetaContador) {
        super("Incrementar");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaContador.setValor(etiquetaContador.getValor() + 1);
            }
        });
    }
}