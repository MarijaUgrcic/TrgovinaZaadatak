public class Main {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Jaffa", "8600568608765", 90, 100);
        Wine wine = new Wine("Vranac", "8600457097124", 550, 750);

        System.out.println(chocolate);
        chocolate.racunanjeCene();

        System.out.println(wine);
        wine.racunanjeCene();

    }

}