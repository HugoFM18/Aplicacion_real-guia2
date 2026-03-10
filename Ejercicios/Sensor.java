package Ejercicios;

public class Sensor {

    double temperatura;
    String ubicacion;

    public Sensor(String lugar) {
        ubicacion = lugar;
        temperatura = 25.0;
    }

    public void ajustar(double nuevaTemp) {
        temperatura = nuevaTemp;
    }

    public void verificarAlerta() {

        if (temperatura > 45.0) {
            System.out.println("¡ALERTA en " + ubicacion + "!");
        }

    }

    public static void main(String[] args) {

        Sensor sensor1 = new Sensor("cocina");

        sensor1.ajustar(50.0);
        sensor1.verificarAlerta();
    }
}