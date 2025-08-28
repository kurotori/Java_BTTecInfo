public class Usuario {
    private int id = 0;
    private String nombre = "";
    private String contraseña = "";

    private Personaje[] personajes = new Personaje[3];

    public String getNombre() {
        return nombre;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }
    
    public Personaje getPersonaje(int posicion){
        return personajes[posicion];
    }

    public void verPersonajes(){
        
        for (Personaje personaje : personajes) {
            System.out.println(
                personaje.getNombre() + " - " 
                + personaje.getRaza()
            );
            
        }
    }
}
