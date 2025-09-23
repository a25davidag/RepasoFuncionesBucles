import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio1
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
    public static void buscarSatelites(String x){
        switch (x){
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
    }
}



