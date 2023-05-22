public class Libros {
    private int id;
    private String nombre;
    private int numPaginas;

    public Libros(String nombre, int numPaginas) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
