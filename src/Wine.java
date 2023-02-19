import java.text.DecimalFormat;

public class Wine extends Product {

    double zapremina;

    public Wine(String nazivProizvoda, String barkod, double osnovnaCena, double zapremina) {
        super(nazivProizvoda, barkod, osnovnaCena);
        this.zapremina = zapremina;
    }

    @Override
    public String toString() {
        return "Wine {" +
                "naziv proizvoda='" + nazivProizvoda + '\'' +
                ", zapremina=" + zapremina + " ml" +
                ", barkod=" + barkod +
                ", osnovna cena=" + osnovnaCena + " din" +
                '}';
    }
    @Override
    public void racunanjeCene() {
        DecimalFormat df = new DecimalFormat("0.00");
        double novaCena = osnovnaCena + osnovnaCena * PDV1;
        double novaCena2 = novaCena + novaCena * PDV2;
        System.out.println("Prodajna cena proizvoda " + nazivProizvoda + " je: " + df.format(novaCena2) + " din.");
    }
}