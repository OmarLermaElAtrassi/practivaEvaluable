import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma = 2;
        int contador = 0;
        while (contador < 5){
            suma += contador++;
        }
        System.out.println(suma);
    }

}
