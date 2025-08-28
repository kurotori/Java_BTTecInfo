import java.util.Scanner;

public class Auto {
    private String marca = "";
    private String modelo = "";

    public void verDatos(){
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " + modelo);
    }

    public Auto(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Marca: ");
        this.marca = teclado.nextLine();
        System.out.print("Modelo: ");
        this.modelo = teclado.nextLine();
        teclado.close();
    }

    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }


}
