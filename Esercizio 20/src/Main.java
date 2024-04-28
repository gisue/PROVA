public class Main {
    public static void main(String[] args) {
        char[] alfa = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Interfaccia game1 = new Interfaccia(new Mastermind(alfa, 10, 3));
        game1.start();
    }
}