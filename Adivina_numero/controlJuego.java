package Adivina_numero;

import java.util.Scanner;

public class controlJuego {
    Scanner sc = new Scanner(System.in);
    int juego, opc;


    public int validaEntrada(String mensaje){
        while (!sc.hasNextInt()) {  //Validar letras
            System.out.println("Error: debe de ingresar opcion correcta");
            sc.next();      //Limpiar letras
            System.out.println(mensaje);
        }
        opc = sc.nextInt();
        return opc;
    }

    public int rangoEntrada(int juego, int rangomin, int rangomax){
        while(juego <  rangomin || juego > rangomax){
            System.out.printf("Ingrese un numero entre %d y %d\n", rangomin, rangomax);
            juego = validaEntrada("Ingrese opcion correcta");
        }
        return juego;
    }
    public int volverJugar(){
        do{
            System.out.println("Desea volver a jugar? 1) SI / 2) NO");
            validaEntrada("Desea volver a jugar? 1) SI / 2) NO");
            rangoEntrada(juego, 1, 2);
        }while(juego != 1 && juego !=2);
        return juego;
    }
}
