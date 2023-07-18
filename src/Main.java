import javax.swing.*;

public class Main {
    public static void main(String... args) {
        long number;
        int intentos = 0;
        int minimoIntentos;

        do{
            minimoIntentos = Integer.parseInt(JOptionPane.showInputDialog("Minimo de intentos:"));
            if(minimoIntentos < 1){
                JOptionPane.showMessageDialog(null,"No puede ser menor a 1");
            }
        }while(minimoIntentos<0);
        int numerosGenerados;
        do {
            numerosGenerados = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de valores: ")) - 1;
            if(numerosGenerados < 1){
                JOptionPane.showMessageDialog(null,"No puede ser menor a 2");
            }
        }while(numerosGenerados < 1);
        int masCercano = 0;
        long intentosTotales = 0;
            do {
                intentosTotales++;
                do {
                    intentos++;
                    number = Math.round(Math.random() * numerosGenerados);
                    System.out.println(number);
                } while (number != numerosGenerados);
                if (masCercano < intentos) {
                    masCercano = intentos;
                }
                System.out.println("Intentos: " + intentos);
                System.out.println("Mas cercano: " + masCercano);
                System.out.println("Intentos totales: " + intentosTotales);
                System.out.println("");
                if (intentos < minimoIntentos) {
                    intentos = 0;
                }
            } while (intentos < minimoIntentos);
    }
}