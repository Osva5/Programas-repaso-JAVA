package Calculadora_Basica;

import java.util.Scanner;


public class Main{
    public static void main(String[]args){

        int opc;
        Scanner sc = new Scanner(System.in);
        operaciones op = new operaciones();
        System.out.println("-----Calculadora basica-----");
        do{
        System.out.println("----Menu----");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("5) Salir");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                op.suma();
                break;
            case 2:
                op.resta();
                break;
            case 3:
                op.multiplicacion();
                break;
            case 4:
                op.division();
                break;
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Ingresa una opcion correcta");
                break;
        }



        }while(opc != 5);
        sc.close();
    }

}