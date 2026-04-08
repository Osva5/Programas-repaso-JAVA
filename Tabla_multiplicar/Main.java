package Tabla_multiplicar;

public class Main {
    public static void main(String[] args){
        validacion vn = new validacion();
        int opc, rep;
        do{
            System.out.println("Tablas de multiplicar");

            System.out.println("Ingrese un numero");
            opc = vn.validaEntrada("Ingrese un numero");

            for (int i = 1; i < 11; i++){
                System.out.printf("%d x %d = %d\n",opc, i, opc*i );
            }
            rep = vn.repetir("Desea volver a ingresar un numero? 1) SI / 2) NO");
        }while(rep != 2);

    }
}
