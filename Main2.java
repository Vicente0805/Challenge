import java.util.Scanner;
class Main2 {
    public static void main(String [] args)  {
        int n = 0;
        System.out.println("Introduzca Numero:");
        Scanner entrada = new Scanner(System.in);
        n = Integer.parseInt(entrada.next());
        for(int i=n;i<200;i++){
            if(Palin(i)){
                if(Primo(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    static boolean Palin(int px) {
        int nn = px;
        String cadena= Integer.toString(nn);
        String cadInv = "";
        int tam = cadena.trim().length()-1;
        for(int j=tam;j >= 0;j--) {
            cadInv = cadInv + cadena.charAt(j);
        }
        if (cadena.equals(cadInv))
            return true;
        else
            return false;
    }

    static boolean Primo(int pn){
        int j = 0;
        for(int i = 1;i<=pn;i++) {

            if((pn % i) == 0) {
                j +=1;
            }
            if(j>2) {
                return false;
            }
        }
        return true;
    }
}