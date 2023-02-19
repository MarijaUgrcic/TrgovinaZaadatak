public class Chocolate extends Product {

    double tezina;

    public Chocolate(String nazivProizvoda, String barkod, double osnovnaCena, double tezina) {
        super(nazivProizvoda, barkod, osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Chocolate {" +
                "naziv proizvoda='" + nazivProizvoda + '\'' +
                ", tezina=" + tezina + " g" +
                ", barkod=" + barkod +
                ", osnovna cena=" + osnovnaCena + " din" +
                '}';
    }

    @Override
    public void racunanjeCene() {
        super.racunanjeCene();
    }
}

