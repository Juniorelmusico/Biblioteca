import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTabbedPane tabbedPane1;
    private JTextPane cantidadTotalDePaginasTextPane;
    private JTextArea busquedaPorIDTextArea;
    private JTextPane busquedaPorNombreTextPane;
    private JTextPane eliminarLibroConIDTextPane;
    private JTextPane ingresarLosLibrosConTextPane;
    private JButton agregarLibroButton;
    private JButton eliminarLibroPorIdButton;
    private JButton buscarLibroPorNombreButton;
    private JButton buscarLibroPorIdButton;
    private JButton calcularCantidadTotalButton;
    private JTextArea resultadoTextArea;
    JPanel mainPanel;

    private BibliotecaApp bibliotecaApp;

    public Interfaz() {
        bibliotecaApp = new BibliotecaApp();

        agregarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField1.getText();
                int numPaginas = Integer.parseInt(textField2.getText());
                bibliotecaApp.agregarLibro(nombre, numPaginas);
            }
        });

        eliminarLibroPorIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField3.getText());
                bibliotecaApp.eliminarLibroPorId(id);
            }
        });

        buscarLibroPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField4.getText();
                Libros libro = bibliotecaApp.buscarLibroPorNombre(nombre);
                if (libro != null) {
                    resultadoTextArea.setText(libro.toString());
                } else {
                    resultadoTextArea.setText("No se encontró un libro con el nombre especificado.");
                }
            }
        });

        buscarLibroPorIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField4.getText());
                Libros libro = bibliotecaApp.buscarLibroPorId(id);
                if (libro != null) {
                    resultadoTextArea.setText(libro.toString());
                } else {
                    resultadoTextArea.setText("No se encontró un libro con el ID especificado.");
                }
            }
        });

        calcularCantidadTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidadTotalPaginas = bibliotecaApp.calcularCantidadTotalPaginas();
                resultadoTextArea.setText("Cantidad total de páginas en la biblioteca: " + cantidadTotalPaginas);
            }
        });


    }
}