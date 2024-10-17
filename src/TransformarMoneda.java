import java.util.Scanner;

public class TransformarMoneda {
    public static void convertir(String monedaBase, String monedaCambio, ConsultaMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaCambio);
        System.out.println("Ingrese la cantidad de "+monedaBase+" que desea transformar a "+monedaCambio);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }
}
