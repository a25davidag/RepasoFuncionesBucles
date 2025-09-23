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
            }else{
                System.out.println(" Numero de pista incorrecto");
            }


        } while (numeroPIstas  != 0);


        //Ejercicio 2
        Scanner st = new Scanner(System.in);
        System.out.println("Pon un nivel de oxigeno");
        int comprobarNivelOxigeno = st.nextInt();
        comprobarNivelOxigeno(comprobarNivelOxigeno);
        if (comprobarNivelOxigeno >= 80 && comprobarNivelOxigeno <= 100) {
            System.out.println("nivel oxigeno optimo");
        } else if (comprobarNivelOxigeno >= 40 && comprobarNivelOxigeno <= 79) {
            System.out.println(" Rebastecimiento");
        } else if (comprobarNivelOxigeno < 40) {
            System.out.println(" critico");
        }
    }//Ejercicio 1
        public static void numeroPistas(int x){
            do {
                System.out.println(" Introduce el numero de pista ");
                System.out.print(" Pon el numero de pista ");
                if (x >= 1 && x <= 5) {
                    System.out.println(" El aterrizaje es seguro");
                } else if (x == 0) {
                    System.out.println(" El aterrrizaje debe cancelarse");
                }else{
                    System.out.println(" Numero de pista incorrecto");
                }


            } while (x  != 0);
        }


        public static int comprobarNivelOxigeno ( int x){
            for (int i = 1; i <= 3; i++) {
                System.out.println(" Ingrese el nivel de oxigeno (" + i + "/3): ");
            }
            return 0;
        }


    }


