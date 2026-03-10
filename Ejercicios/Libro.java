package Ejercicios;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    public Libro(String t, String a, int p) {
        titulo = t;
        autor = a;
        paginas = p;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", escrito por " + autor);
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote", "Cervantes", 863);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 560);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}