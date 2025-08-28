public class Personaje {
    private int id = 0;
    private String nombre = "";
    private String raza = "";

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void verNombre(){
        System.out.println(nombre);
    }
}
