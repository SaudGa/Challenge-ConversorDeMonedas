import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;

        while (opcion != 7){
            System.out.println("******************************************************************************");
            System.out.println("Bienvenido al conversor de monedas <3");
            System.out.println("Elija una de las siguientes opciones de transformación: \n" +
                    "1)USD a CLP \n" +
                    "2)CLP a USD \n" +
                    "3)CAD a CLP \n" +
                    "4)CLP a CAD \n" +
                    "5)USD a CAD \n" +
                    "6)CAD a USD \n" +
                    "7)Salir del sistema \n");
            System.out.println("******************************************************************************");
            opcion = lectura.nextInt();
            lectura.nextLine();
            
            switch (opcion){
                case 1:
                    TransformarMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 2:
                    TransformarMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 3:
                    TransformarMoneda.convertir("CAD", "CLP", consulta, lectura);
                    break;
                case 4:
                    TransformarMoneda.convertir("CLP", "CAD", consulta, lectura);
                    break;
                case 5:
                    TransformarMoneda.convertir("USD", "CAD", consulta, lectura);
                    break;
                case 6:
                    TransformarMoneda.convertir("CAD", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Gracias por ocupar mi sistema <3");
                    break;
            }
        }



    }
}