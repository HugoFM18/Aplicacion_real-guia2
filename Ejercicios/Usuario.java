package Ejercicios;

public class Usuario {

    String username;
    int seguidores;

    public Usuario(String nombre) {
        username = nombre;
        seguidores = 0;
    }

    public void nuevoSeguidor() {
        seguidores = seguidores + 1;
    }

    public static void main(String[] args) {

        Usuario u = new Usuario("JavaCoder");

        u.nuevoSeguidor();
        u.nuevoSeguidor();
        u.nuevoSeguidor();

        System.out.println(u.username + " tiene " + u.seguidores + " seguidores");
    }
}