import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        // to see how IntelliJ IDEA suggests fixing it.
        try {

            Scanner scanner=new Scanner(System.in);
            String ñoño="pedro";
            Integer numero1 = 0;
            System.out.println("Escribe un número");
            numero1=scanner.nextInt();

            System.out.println(numero1*10);


            System.out.println("Escribe tu nombre");
            String nombre=scanner.next();

            System.out.println("Escribe 2 números");
            Integer num1=scanner.nextInt();
            Integer num2=scanner.nextInt();
            System.out.println(num1+num1);
            System.out.println("Nombre:"+nombre);

        }catch (Exception e){
            e.getMessage();
        }


    }
}