import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* // Ejercicio1
        Scanner sc = new Scanner(System.in);
        int numeroPIstas;
        do {
            System.out.println(" Introduce el numero de pista ");
            System.out.print(" Pon el numero de pista ");
            numeroPIstas = sc.nextInt();
            if (numeroPIstas >= 1 && numeroPIstas <= 5) {
                System.out.println(" El aterrizaje es seguro");
            } else if (numeroPIstas == 0) {
                System.out.println(" El aterrrizaje debe cancelarse");
            } else {
                System.out.println(" Numero de pista incorrecto");
            }
        } while (numeroPIstas != 0);

        //Ejercicio 2
        Scanner st = new Scanner(System.in);
        System.out.println(" Pon un nivel de oxigeno");
        int comprobarNivelOxigeno = st.nextInt();
        comprobarNivelOxigeno(comprobarNivelOxigeno);
        if (comprobarNivelOxigeno >= 80 && comprobarNivelOxigeno <= 100) {
            System.out.println(" nivel oxigeno optimo");
        } else if (comprobarNivelOxigeno >= 40 && comprobarNivelOxigeno <= 79) {
            System.out.println(" Rebastecimiento");
        } else if (comprobarNivelOxigeno < 40) {
            System.out.println(" critico");
        }
        //Ejercicio3
        recolectarMeteoritos(10);
        //Ejercicio 4
        Scanner sm = new Scanner(System.in);
        String codigoSatelite;
        System.out.println("=== SIstema de busqueda de satelites ===");
        System.out.println(" Ingrese el codigo de satelite (SAT-A, SAT-B, SAT-C, SAT-D, SAT-E)");
        System.out.println("Escribe 'FIN' para salir. ");

        while(true){
            System.out.println(" Ingresa el codigo del satélite: ");
            codigoSatelite = sm.next().toUpperCase();
            if(codigoSatelite.equals("FIN")){
                System.out.println(" Salir del satelite");
                break;
            }
        buscarSatelites(codigoSatelite);
        }
        //Ejercicio 5
        Scanner sj = new Scanner(System.in);
        System.out.println(" Escriba la altura de la orbita ");
        int alturaOrbita = sj.nextInt();
        while (true){
            if (alturaOrbita >= 200 && alturaOrbita <= 500){
                estabilizacionOrbita(alturaOrbita);
                break;
            }
            System.out.println(" Escriba la altura de la orbita ");
            alturaOrbita = sj.nextInt();
        }

        //Ejercico 6
        Scanner sp = new Scanner(System.in);
        int numero = 10;
        System.out.println("Quieres mandar un mensaje/Fin");
        String terminado = sp.nextLine();
        if(terminado.equals("FIN")) {
            System.out.println("===SALIENDO DEL SISTEMA===");
        }else {

            for(int i = 1; i <= numero; i++) {
            System.out.println("Escribe un destino");
            String destino = sp.nextLine();
            System.out.println("Escribe un mensaje");
            String mensaje = sp.nextLine();
            mensaejesPLaneta(destino, mensaje);
            }
        }
        //Ejecicio 7
        Scanner sl = new Scanner(System.in);
        System.out.println(" EScribe los kilometros que quieres recorrer");
        double recorrido = sl.nextDouble();
        System.out.println(" Tienes 500 litros ");
        int litros = 500;



        //Ejercicio 8
        Scanner sv = new Scanner(System.in);
        System.out.println(" Escribe un punto de recorrido");
        int puntoActual = sv.nextInt();
        navegarPuntos(puntoActual);*/

        //Ejercicio 9
        Scanner sh = new Scanner(System.in);

        //System.out.println("Pon un numero de emisión");
        //int numero = sh.nextInt();
        String emision;
        while (true) {
            System.out.println("Pon un nombre de emision (o escribe 'salir' para salir del sistema");
            emision = sh.nextLine();
            if (emision.equals("salir")) {
                System.out.println("Program terminado");
                break;
            }
        }System.out.println("hola");
        generarCodigoMision(emision);


    }//Ejercicio 2

    public static int comprobarNivelOxigeno(int x) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Ingrese el nivel de oxigeno (" + i + "/3): ");
        }
        return 0;
    }

    //Ejercicio 3
    public static int recolectarMeteoritos(int n) {
        for (int i = 1; i <= n; i++) {
            int progreso = (i * 100) / n;
            System.out.println(" Meteorito" + i + " de " + n + " recogido. Progreso: " + progreso + "%");
        }
        System.out.println(" Mision de recoleccion completado");
        return 0;
    }

    //Ejercicio 4
    public static void buscarSatelites(String x) {
        switch (x) {
            case "SAT-A":
            case "SAT-B":
            case "SAT-C":
                System.out.println("Satelite activo, transmitiendo datos");
                break;
            case "SAT-D":
            case "SAT-E":
                System.out.println("Satelite inactivo, requiere mantenimiento");
                break;
            default:
                System.out.println("Satelite desconocido");
        }
    }//Ejercicio 5

    public static double estabilizacionOrbita(double x) {
        System.out.println(" Calculando calculando el tiempo para estabilizar la orbita");
        System.out.println(" Tiempo = " + ((x - 200) * 1.5));
        return 0;
    }

    //Ejercicio 6
    public static void mensaejesPLaneta(String d, String m) {
            if (d.equals("marte")) {
                System.out.println(m + " Mensaje a marte enviado, tiempo de llegada: 3 minutos");
            } else if (d.equals("jupiter")) {
                System.out.println(m + " Mensaje a jupiter enviado,tiempo de llegada: 25 minutos");
            } else {
                System.out.println(" El mensaje" + m + " NO fue enviado Destino fuera de alcance");
            }
    }
    //Ejercicio 7
   /* public static void calcularConsumo( double r, int l){
        if((l * 100)/r){System
        }*/


    //Ejercicio 8
    public static void navegarPuntos(int x){
        for(int i = 1; i <= 5; i++)
            if(x % 2 == 0){
                System.out.println("!Control de trayecto existoso");
            }else{
                System.out.println("!Control de trayecto no existoso");
            }
        System.out.println("Ruta completada");
    }
    //Ejercicio 9
    public static void generarCodigoMision(String m){
        if(m == null || m.trim().isEmpty()){
            System.out.println("Mision invalido");
            return;
        }
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1;
        String codigoMision = m + "-" + numeroAleatorio;
    }









}

















/*public static void calcularConsumo() {
    Scanner sc = new Scanner(System.in);
    double kilometros, consumoKm, consumoTotal;
    final double TANQUE = 500.0;

    do {
        System.out.print("Introduce los kilómetros recorridos: ");
        kilometros = sc.nextDouble();

        System.out.print("Introduce el consumo por km: ");
        consumoKm = sc.nextDouble();

        consumoTotal = kilometros * consumoKm;

        if (consumoTotal <= TANQUE) {
            double restante = TANQUE - consumoTotal;
            System.out.println("Viaje completado. Combustible restante: " + restante + " litros");
        } else {
            System.out.println("Advertencia: Combustible insuficiente, se requiere recarga\n");
        }

    } while (consumoTotal > TANQUE); // Repite hasta que el viaje sea sostenible
}

public static void main(String[] args) {
    calcularConsumo();
}
}*/





