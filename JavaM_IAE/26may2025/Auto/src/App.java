public class App {
    public static void main(String[] args) throws Exception {
        Auto chevrolet = new Auto(
                         "Chevrolet",
                        "Corsa",
                         "rojo",
                            2007);
        chevrolet.arrancar();
        chevrolet.verDatos();
    }
}
