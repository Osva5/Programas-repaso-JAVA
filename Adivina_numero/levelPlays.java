package Adivina_numero;


public class levelPlays {
    private int num, cont = 0, genera;
    controlJuego cj = new controlJuego();
    
    public void level(String mensaje, int nummax){
        cont = 0;
        genera = (int) (Math.random() * (nummax))+ 1;
        

        System.out.printf("Nivel %s (1 al %d)\n", mensaje, nummax);
            do{
                cont += 1;

                do{
                    System.out.printf("Ingresa un numero del 1 al %d", nummax);
                    System.out.println("Pista");
                    if (genera > nummax/2)
                        System.out.printf("Es un numero mayor a %d\n", nummax/2);
                    else
                        System.out.printf("Es un numero menor a %d\n", nummax/2);

                    num = cj.validaEntrada("Ingresa numeros, no letras"); //Valida letras
                    // //Asignar el numero a la variable 

                    cj.rangoEntrada(num, 1, nummax);
                
                }while(num < 1 || num > nummax);    //Repetir si no es

                if (num == genera){
                    System.out.printf("Adivinaste el numero %d\n", num);
                    System.out.printf("Numero de intentos: %d\n", cont);

                }else{
                    System.out.printf("Incorrecto, intenta nuevamente\n");
                    System.out.println("Pista");
                    if (num < genera)
                        System.out.println("Es un numero mayor\n");
                    else
                        System.out.println("Es un numero menor\n");
                }

            }while(num != genera);

    }
}
