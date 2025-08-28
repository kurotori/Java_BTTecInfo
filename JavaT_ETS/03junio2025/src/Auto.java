public class Auto {
    private String marca = "";
    private String modelo = "";
    public String color = "";


    public Auto(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //accesibilidad Tipo accion(){}
    public void encender(){
        System.out.println("BRUM BRUM");
    }

    public void verDatos(){
        System.out.println("Este auto es un " + marca 
            + " de color " + color);
        System.out.println("Modelo " + modelo);
    }
}
