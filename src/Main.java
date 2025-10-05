import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio1 Crea un programa para una nave espacial que se aproxima a un planeta con múltiples pistas de
        //aterrizaje. El sistema debe pedir al usuario que introduzca el número de pista (int). Si el número
        //está entre 1 y 5, el sistema debe informar que el aterrizaje es seguro. Si el número es 0, la operación
        //debe cancelarse. Para cualquier otro valor, debe indicar que la pista no es válida y seguir pidiendo
        //un número de pista hasta que se introduzca un valor válido o se cancele la operación. Usa un bucle
        //do-while y una función que valide el número de pista

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

        //Ejercicio 2 Desarrolla una función llamada comprobarNivelOxigeno que reciba un porcentaje de
        //oxígeno (int). La función debe imprimir "Nivel óptimo" si el porcentaje está entre 80% y 100%,
        //"Nivel bajo, se requiere reabastecimiento" si está entre 40% y 79%, y "Nivel crítico, evacuación de
        //la cabina" si es inferior a 40%. En el programa principal, pide al usuario que ingrese el nivel de
        //oxígeno y llama a la función para evaluar el estado. Repite el proceso con un bucle for 3 veces
        //para simular múltiples lecturas.

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
        //Ejercicio3 Imagina que una nave de recolección de meteoritos debe recoger 10 meteoritos. Crea una función
        //recolectarMeteoritos que tome como argumento el número de meteoritos a recolectar
        //(int). Dentro de la función, usa un bucle for para simular la recolección, imprimiendo un
        //mensaje por cada meteorito recogido y mostrando el progreso total (ej: "Meteorito 1 de 10
        //recogido. Progreso: 10%"). Al finalizar el bucle, imprime "Misión de recolección completada".

        recolectarMeteoritos(10);

        //Ejercicio 4 Escribe una función buscarSatelites que reciba un código de satélite (String). Dentro de
        //la función, usa una estructura switch para determinar el estado del satélite. Si el código es "SATA", "SAT-B" o "SAT-C", imprime "Satélite activo, transmitiendo datos". Si el código es "SAT-D" o
        //"SAT-E", imprime "Satélite inactivo, requiere mantenimiento". Para cualquier otro código, informa
        //"Código de satélite desconocido". En el programa principal, usa un bucle while para permitir que
        //el usuario consulte el estado de varios satélites hasta que escriba "FIN".

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
        //Ejercicio 5 Crea un programa que ayude a estabilizar la órbita de un satélite. El sistema debe solicitar la altura
        //de la órbita (int) hasta que se ingrese un valor entre 200 km y 500 km. Usa un bucle while para
        //seguir pidiendo la altura hasta que se cumpla la condición. Cuando se ingrese un valor válido, la
        //función estabilizarOrbita debe calcular el tiempo de estabilización usando la fórmula
        //tiempo = (altura - 200) * 1.5 y mostrar el resultado.

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

        //Ejercico 6 Diseña una función enviarMensaje que reciba un destino (String) y un mensaje (String).
        //El programa debe pedir al usuario que ingrese el destino (ej: "Marte", "Júpiter") y el mensaje.
        //Dentro de la función, usa una estructura if-else if-else para simular la transmisión. Si el
        //destino es "Marte", imprime "Mensaje a Marte enviado, tiempo de llegada: 3 minutos". Si es
        //"Júpiter", imprime "Mensaje a Júpiter enviado, tiempo de llegada: 25 minutos". Para cualquier otro
        //destino, indica "Destino fuera de alcance". El programa debe permitir el envío de múltiples
        //mensajes en un bucle for.

        Scanner sp = new Scanner(System.in);
        int numero = 10;
        System.out.println("Quieres mandar un mensaje/Fin");
        String terminado = sp.nextLine();
        if(terminado.equals("FIN")) {
            System.out.println("===SALIENDO DEL SISTEMA===");
        }else {

            for(int i = 0; i <= numero; i++) {
            System.out.println("Escribe un destino");
            String destino = sp.nextLine();
            System.out.println("Escribe un mensaje");
            String mensaje = sp.nextLine();
            mensaejesPLaneta(destino, mensaje);
            }
        }
        //Ejecicio 7 Desarrolla una función calcularConsumo que acepte los kilómetros recorridos (double) y el
        //consumo por km (double). La función debe calcular el consumo total y compararlo con un
        //tanque inicial de 500 litros. Si el consumo total es menor o igual a 500, imprime "Viaje
        //completado. Combustible restante: X litros". Si el consumo excede los 500 litros, imprime
        //"Advertencia: Combustible insuficiente, se requiere recarga". Usa un bucle do-while para pedir
        //los datos al usuario hasta que el viaje sea sostenible (consumo <= 500).

        Scanner sl = new Scanner(System.in);
        System.out.println(" EScribe los kilometros que quieres recorrer");
        double recorrido = sl.nextDouble();
        System.out.println(" Tienes 500 litros ");
        int litros = 500;



        //Ejercicio 8 Crea un programa que simule la navegación de una nave a través de 5 puntos de control. Define
        //una función navegarPuntos que acepte un punto de control actual (int). Dentro de la
        //función, usa un bucle for para iterar desde el punto 1 hasta el punto 5, imprimiendo un mensaje de
        //"Navegando hacia el punto de control [número]". Si el número del punto de control es par, imprime
        //"¡Control de trayectoria exitoso!". Después de los 5 puntos, imprime "Ruta completada".

        Scanner sv = new Scanner(System.in);
        System.out.println(" Escribe un punto de recorrido");
        int puntoActual = sv.nextInt();
        navegarPuntos(puntoActual);

        //Ejercicio 9 Escribe un programa con una función generarCodigoMision que reciba el nombre de una
        //misión (String). La función debe crear un código de misión que sea una combinación del
        //nombre de la misión y un número secuencial aleatorio del 1 al 100. En el programa principal, usa un
        //bucle while para permitir al usuario generar códigos para múltiples misiones hasta que decida
        //salir. La función debe mostrar el código generado. Si el nombre de la misión está vacío, debe
        //imprimir "Nombre de misión inválido".

        Scanner sh = new Scanner(System.in);
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

        //Ejercicio 10 Desarrolla una función desplegarPaneles que tome como argumento el número de paneles a
        //desplegar (int). La función debe usar un bucle for para simular el despliegue de cada panel,
        //imprimiendo "Desplegando panel [número]". Si el número del panel es un múltiplo de 3, debe
        //imprimir "Panel [número] desplegado con éxito, calibración automática completada". Al final del
        //bucle, si todos los paneles se desplegaron, imprime "Despliegue de paneles solares completado.
        //Energía al 100%". Si no se desplegó ningún panel, imprime "No se desplegó ningún panel". Pide al
        //usuario el número de paneles y llama a la función.

        Scanner sw = new Scanner(System.in);
        int numeroPneles = sw.nextInt();
        int h;
        for (h = 0; h < 5; h++) {
            //System.out.println("hola");
            desplegarPaneles(numeroPneles);
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
    public static void navegarPuntos(int x) {
        for (int i = 1; i <= 5; i++)
            if (x % 2 == 0) {
                System.out.println("!Control de trayecto existoso");
            } else {
                System.out.println("!Control de trayecto no existoso");
            }
        System.out.println("Ruta completada");
    }

    //Ejercicio 9
    public static void generarCodigoMision(String m) {
        if (m == null || m.trim().isEmpty()) {
            System.out.println("Mision invalido");
            return;
        }
        Random rd = new Random();
        System.out.println("escribe un numero ");
        int numeroAleatorio = rd.nextInt(100) + 1;
        String codigoMision = m + "-" + numeroAleatorio;
    }

    public static void desplegarPaneles(int h) {
        if (h % 3 == 0) {
            System.out.println("Panel " + h + " Desplegado con exito,calibracion automatica completada");
            System.out.println("=====DESPLIEGUE DE PANELES SOLARES COMPLETO=====");
            System.out.println("=====ENERGIA AL 100%=====");
        } else {
            System.out.println("no completado" + h);
        }
    }
}



