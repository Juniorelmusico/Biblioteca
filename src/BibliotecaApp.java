import java.util.ArrayList;
import java.util.Collections;
public class BibliotecaApp {
    private ArrayList<Libros> listaLibros;
    public BibliotecaApp() {
        listaLibros = new ArrayList<>();
    }
    public void agregarLibro(String nombre, int numPaginas) {
        for (Libros libro : listaLibros) {
            if (libro.getNombre().equals(nombre)) {
                System.out.println("No se puede agregar el libro. Ya existe un libro con el mismo nombre.");
                return;
            }
        }

        Libros nuevoLibro = new Libros(nombre, numPaginas);
        listaLibros.add(nuevoLibro);
        System.out.println("Libro agregado correctamente.");
    }

    public void eliminarLibroPorId(int id) {
        for (Libros libro : listaLibros) {
            if (libro.getId() == id) {
                listaLibros.remove(libro);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un libro con el ID especificado.");
    }

    public void eliminarLibroPorNombre(String nombre) {
        for (Libros libro : listaLibros) {
            if (libro.getNombre().equals(nombre)) {
                listaLibros.remove(libro);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un libro con el nombre especificado.");
    }

    public Libros buscarLibroPorNombre(String nombre) {
        for (Libros libro : listaLibros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }

    public void ordenarLibrosPorId() {
        Collections.sort(listaLibros, (libro1, libro2) -> Integer.compare(libro1.getId(), libro2.getId()));
    }

    public Libros buscarLibroPorId(int id) {
        int inicio = 0;
        int fin = listaLibros.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Libros libro = listaLibros.get(medio);
            if (libro.getId() == id) {
                return libro;
            } else if (libro.getId() < id) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }

    public int calcularCantidadTotalPaginas() {
        return calcularCantidadTotalPaginasRecursivo(listaLibros.size() - 1);
    }

    private int calcularCantidadTotalPaginasRecursivo(int index) {
        if (index < 0) {
            return 0;
        }
        Libros libro = listaLibros.get(index);
        return libro.getNumPaginas() + calcularCantidadTotalPaginasRecursivo(index - 1);
    }
}
