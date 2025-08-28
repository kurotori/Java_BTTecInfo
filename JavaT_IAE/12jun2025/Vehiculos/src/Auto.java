import java.util.Scanner;

public class Auto extends Vehiculo {

    public Auto( String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Marca?");
        this.marca = teclado.nextLine();

        System.out.println("Modelo?");
        this.modelo = teclado.nextLine();

        teclado.close();
    }

    public void verDatos(){
        System.out.println("Marca del auto:" + marca);
        System.out.println("Modelo del auto: " + modelo);
    }
}
