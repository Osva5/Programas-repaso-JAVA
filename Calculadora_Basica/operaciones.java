package Calculadora_Basica;

import java.util.Scanner;

public class operaciones {
    int num1, num2, opc;
    Scanner sc = new Scanner(System.in);

    public int validacion(String tipo){   // Funcion para validar 
        do{
            System.out.println("Desea realizar otra "+ tipo + "?");
            System.out.println("1) SI / 2) NO");
            opc = sc.nextInt();

            if(opc != 1 && opc != 2)
                System.out.println("Ingrese una opcion correcta");
                
        }while(opc != 1 && opc != 2);
        return opc;
    }

    public void pedirNumero(){
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
    }


    public void suma(){
        do{
            pedirNumero();
            int suma = num1+num2;
            System.out.println("El resultado es: " + suma);
            while(true){            //Primer metodo de validacion, el problema es que tiene mas lineas de codigo
                System.out.println("Desea realizar otra suma?");
                System.out.println("1) SI / 2) NO");
                opc = sc.nextInt();
                if(opc != 1 && opc != 2){
                    System.out.println("Ingrese una opcion correcta");
                }else{
                    break;
                }
            }
        }while(opc != 2);
    }

    public void resta(){
        do{
            pedirNumero();
            int resta = num1-num2;
            System.out.println("El resultado es: "+ resta);
            do{
                System.out.println("Desea realizar otra resta?");
                System.out.println("1) SI / 2) NO");
                opc = sc.nextInt();

                if(opc != 1 && opc != 2)
                    System.out.println("Ingrese una opcion correcta");
                
            }while(opc != 1 && opc != 2);           //Hcaemos la misma validacion que con while(true), con menos codigo
        }while(opc != 2);    
    }

    public void multiplicacion(){
        do{    
            pedirNumero();
            int multi = num1*num2;
            System.out.println("El resultado es: "+ multi);
            opc = validacion("Multiplicacion");  
     //LLamado de funcion y guradamos lo que retorna al igual que le damos la leyenda que imprimira 
        }while(opc != 2);
    }

    public void division(){
        do{
            pedirNumero();
            if (num2 != 0){
                int div = num1/num2;
                System.out.println("El resultado es: "+ div);
            }else{
                System.out.println("Error: Division por 0");
            }
            opc = validacion("Division");

        }while(opc != 2);
    }
}
