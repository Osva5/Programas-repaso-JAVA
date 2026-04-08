package Conversor_temp;
import java.util.Scanner;

public class conversiones {
    Scanner sc = new Scanner(System.in);

    public double valiLetras(){
        while (!sc.hasNextDouble()) { //Hacemos que reciba el dato
            System.out.println("Error: Ingresa un numero valido"); //Imprime si ingresan letras
            sc.next();// Limpia el sc para que pueda volver a ingresar la respuesta
        }
        return sc.nextDouble();
    }
    
    public int validar(){      //Validamos entradas
        int rep;
        do{
        System.out.println("Desea repetir la operacion?");
        System.out.println("1) SI / 2) NO");
        rep = sc.nextInt();
        if (rep != 1 && rep != 2)
            System.out.println("Error: Opcion invalida");
        }while(rep != 1 && rep != 2); 
        return rep;
    }

    public int menu(){
        int opc;
        do{
        System.out.println("          Menu         ");
        System.out.println("1) Fahrenheit a Celsius");
        System.out.println("2) Celsius a Fahrenheit");
        System.out.println("3) Salir");
        while (!sc.hasNextInt()){
            System.out.println("Error: Ingrese opcion correcta");
            sc.next();
        }

        opc = sc.nextInt();

        if (opc < 1 || opc > 3)
            System.out.println("Error: Ingrese opcion correcta");
        }while(opc <1 || opc >3);

        return opc;
    }

    public void fahACel(){
        //float fahre;
        int rep;
        do{
        System.out.println("Ingrese los grados °F");
        double fahre = valiLetras();
        double C = (fahre - 32)/1.8;
        System.out.printf("La temperatura es %.2f °C\n", C);
        rep = validar();
        }while(rep != 2);
    }

    public void celAFah(){
        int rep;
        do{
        System.out.println("Ingrese los grados °C");
        double Cel = valiLetras();
        double F = (Cel * 9/5)+32;
        System.out.printf("La temperatura es %.2f °F\n", F);
        rep = validar();
        }while(rep != 2);
    }
    
}
