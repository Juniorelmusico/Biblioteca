public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Interfaz interfaz = new Interfaz();
                JFrame frame = new JFrame("Biblioteca App");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPanel(interfaz.mainPanel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
