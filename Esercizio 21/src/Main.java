public class Main {
    public static void main(String[] args) {
        String[][] schema = new String[6][6];
        Interfaccia game1 = new Interfaccia(new ForzaQuattro(schema));
        game1.start();
    }
}
