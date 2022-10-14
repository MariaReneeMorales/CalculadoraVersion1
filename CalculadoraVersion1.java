//Librerías especiales.
import java.util.Scanner;

//Función de tipo "CalculadoraVersion1.java".
public class CalculadoraVersion1 {
    //Función principal.
    public static void main(String[] args) {
        //Definición e inialización de variables locales.
        var lnNumero1 = 0.0;
        var lnNumero2 = 0.0;
        var lnResultado = 0.0;

        //Definición del scanner.
        Scanner lsDatos = new Scanner(System.in);

        //Título + Saltos de línea.
        System.out.println(" ");
        System.out.println(" +===========================================+ ");
        System.out.println(" | C A L C U L A D O R A   V E R S I Ó N   1 | ");
        System.out.println(" +===========================================+ ");
        System.out.println(" ");

        //Suma.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   S U M A \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Impresión de datos.
        lnResultado = lnNumero1 + lnNumero2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " + " + lnNumero2 + " = " + lnResultado);

        //Resta.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   R E S T A \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Impresión de datos.
        lnResultado = lnNumero1 - lnNumero2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " - " + lnNumero2 + " = " + lnResultado);

        //Multiplicación.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   M U L T I P L I C A C I Ó N \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Impresión de datos.
        lnResultado = lnNumero1 * lnNumero2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " x " + lnNumero2 + " = " + lnResultado);

        //División.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   D I V I S I Ó N \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Condición para evitar que se divida entre 0.
        if(lnNumero2 != 0){
            //Cálculos + Impresión de datos.
            lnResultado = lnNumero1 / lnNumero2;
            System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " / " + lnNumero2 + " = " + lnResultado);
        }
        else{
            System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " / " + lnNumero2 + " = Math error... ");
        }

        //Potenciación.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   P O T E N C I A C I Ó N \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Impresión de datos.
        lnResultado = Math.pow(lnNumero1, lnNumero2);
        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " ^ " + lnNumero2 + " = " + lnResultado);

        //Raíz cuadrada.
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   R A Í Z   C U A D R A D A \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Evitando que se saqué la raíz de un número negativo + Impresión de datos.
        if(lnNumero1 >= 0 && lnNumero2 >= 0){
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnNumero1 + " = " + Math.sqrt(lnNumero1));
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnNumero2 + " = " + Math.sqrt(lnNumero2));
        }
        else {
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnNumero1 + " = Math error... ");
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnNumero2 + " = Math error... ");
        }

        //Residuo de la divisón (MOD).
        System.out.println(" ");
        System.out.println(" \uD83C\uDF89 O P E R A C I Ó N   R E S I D U O \uD83C\uDF89 ");
        System.out.println(" ");

        //Captura de datos + Saltos de línea.
        System.out.print(" ✔ Ingrese el primer número: ");
        lnNumero1 = lsDatos.nextDouble();
        System.out.print(" ✔ Ingrese el segundo número: ");
        lnNumero2 = lsDatos.nextDouble();
        System.out.println(" ");

        //Cálculos + Impresión de datos.
        lnResultado = lnNumero1 % lnNumero2;
        System.out.println(" \uD83D\uDD38 El residuo de " + lnNumero1 + " % " + lnNumero2 + " = " + lnResultado);
    }
}