public class Auto {
    private String marca = "";
    private String modelo = "";
    public String color = "";
    private int año = 0;

    public Auto(String marcaDelAuto, String modelo, 
                String color, int año){
        this.marca = marcaDelAuto;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }


    public void arrancar(){
        System.out.println("BRUM BRUM");
    }

    public void verDatos(){
        System.out.println("Este auto es un " + marca);
        System.out.println("Su modelo es " + modelo);
        System.out.println("Fabricado en el año " + año);
    }
}
