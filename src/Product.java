import java.text.DecimalFormat;

public abstract class Product {

    protected String nazivProizvoda;
    protected String barkod;
    protected double osnovnaCena;

    final static double PDV1 = 0.20;
    final static double PDV2 = 0.10;


    public Product(String nazivProizvoda, String barKod, double osnovnaCena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barkod = barKod;
        this.osnovnaCena = osnovnaCena;
    }


    public void racunanjeCene() {
        DecimalFormat df = new DecimalFormat("0.00");
        double novaCena = osnovnaCena + osnovnaCena * PDV1;
        System.out.println("Prodajna cena proizvoda " + nazivProizvoda + " je: " + df.format(novaCena) + " din.");
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barKod=" + barkod +
                ", osnovnaCena=" + osnovnaCena +
                '}';
    }
}
