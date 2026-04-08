package Conversor_temp;

public class Main {
    public static void main(String[] args){
        int opc;
        conversiones co = new conversiones();
        System.out.println("-----Conversor de temperaturas-----");

        do{
            opc = co.menu();

            switch (opc) {
                case 1:
                    co.fahACel();
                    break;
                case 2:
                    co.celAFah();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese opcion correcta");
                    break;
            }

        }while(opc != 3);

    }
    
}
