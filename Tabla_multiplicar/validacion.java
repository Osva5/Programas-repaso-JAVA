package Tabla_multiplicar;
import java.util.Scanner;

public class validacion {
    Scanner sc = new Scanner(System.in);
    int opc;


    public int validaEntrada(String mensaje){
        while (!sc.hasNextInt()) {
            System.out.println("Error: Ingrese solo numeros");
            sc.next();  //Limpiar
            System.out.println(mensaje);
        }
        return sc.nextInt();
    }

    public int repetir(String mensaje){
        do{
            System.out.println(mensaje);
            opc = validaEntrada(mensaje);
        }while(opc < 1 || opc > 2);
        return opc;
    }
//"Desea volver a ingresar un numero? 1) SI / 2) NO"

    public String validaString(String mensaje){
        while (!sc.hasNextLine()) {
            System.out.println("Error: Ingrese solo letras");
            sc.next();  //Limpiar
            System.out.println(mensaje);
        }
        return sc.nextLine();
    }


}
