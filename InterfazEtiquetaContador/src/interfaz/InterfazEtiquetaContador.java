package interfaz;

import etiqueta.EtiquetaContador;
import incremento.BotonIncrementar;
import decremento.BotonDecrementar;
import reinicio.BotonReiniciar;

import javax.swing.*;
import java.awt.*;

public class InterfazEtiquetaContador extends JFrame {
    private EtiquetaContador etiquetaContador;

    public InterfazEtiquetaContador() {
        etiquetaContador = new EtiquetaContador();

        inicializarInterfaz();
    }

    private void inicializarInterfaz() {
        setTitle("Etiqueta Contador");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Mostrar la etiqueta
        add(etiquetaContador.getEtiqueta());

        // Botón Incrementar
        BotonIncrementar botonIncrementar = new BotonIncrementar(etiquetaContador);
        add(botonIncrementar);

        // Botón Decrementar
        BotonDecrementar botonDecrementar = new BotonDecrementar(etiquetaContador);
        add(botonDecrementar);

        // Botón Reiniciar
        BotonReiniciar botonReiniciar = new BotonReiniciar(etiquetaContador);
        add(botonReiniciar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazEtiquetaContador frame = new InterfazEtiquetaContador();
            frame.setVisible(true);
        });
    }
}