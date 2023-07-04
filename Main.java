import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta un entero");
        String cadena = scanner.next().toLowerCase();
        String cadenaInvertida = invCad(cadena);

        if(cadena.equals(cadenaInvertida)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
    public static String invCad(String cadena){

        cadena = cadena.toLowerCase();
        String cadInv = "";

        // Invertimos la cadena
        char caracter;
        for (int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            cadInv += caracter;
        }
        return cadInv;
    }
}

