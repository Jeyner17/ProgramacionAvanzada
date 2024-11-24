package etiqueta;

import javax.swing.JLabel;

public class EtiquetaContador {
    private int valor;
    private JLabel etiqueta;

    public EtiquetaContador() {
        this.valor = 0;
        this.etiqueta = new JLabel("Valor: " + valor);
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        etiqueta.setText("Valor: " + valor);
    }
}