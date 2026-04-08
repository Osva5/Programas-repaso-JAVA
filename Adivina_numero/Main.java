package Adivina_numero;


//import java.util.Random;

public class Main {
    public static void main(String[] args){

        controlJuego cj = new controlJuego();
        levelPlays lp = new levelPlays();
        //Random rd = new Random();
        int juego, opc;

        do{
            System.out.println("Adivina el numero\n");
            System.out.println("     Menu     ");
            System.out.println("1) Nivel facil");
            System.out.println("2) Nivel Medio");
            System.out.println("3) Nivel Dificil");
            System.out.println("4) Salir");
            opc = cj.validaEntrada("Ingresa numeros, no letras");
            cj.rangoEntrada(opc, 1, 4);
            switch (opc) {
                case 1:
                    lp.level("Facil", 10);
                    break;
                case 2:
                    lp.level("Medio", 50);
                    break;
                case 3:
                    lp.level("Dificil", 100);
                    break;
                case 4:
                    System.out.println("Bye :D");
                    break;
                default:
                    System.out.println("Error: Ingresa opcion correcta");
                    break;
            }
            juego = cj.volverJugar();

        }while(opc != 4 && juego != 2);
    }
}
