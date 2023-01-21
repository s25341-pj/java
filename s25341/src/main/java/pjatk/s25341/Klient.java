package pjatk.s25341;

public class Klient {
    private String imie;
    private String nazwisko;
    private String identyfikator;
    private String numer_konta;
    private String klasyfikacja_klienta;
    private long saldo_konta;

    public Klient(String imie, String nazwisko, String identyfikator, String numer_konta, String klasyfikacja_klienta, long saldo_konta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.identyfikator = identyfikator;
        this.numer_konta = numer_konta;
        this.klasyfikacja_klienta = klasyfikacja_klienta;
        this.saldo_konta = saldo_konta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String Identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getNumer_konta() {
        return numer_konta;
    }

    public void setNumer_konta(String numer_konta) {
        this.numer_konta = numer_konta;
    }

    public Long getSaldo_konta() {
        return saldo_konta;
    }

    public void setSaldo_konta(Long saldo_konta) {
        this.saldo_konta = saldo_konta;
    }

    public String getKlasyfikacja_klienta() {
        return klasyfikacja_klienta;
    }

    public void setKlasyfikacja_klienta(String klasyfikacja_klienta) {
        this.klasyfikacja_klienta = klasyfikacja_klienta;
    }

    public void setSaldo_konta(long saldo_konta) {
        this.saldo_konta = saldo_konta;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", identyfikator='" + identyfikator + '\'' +
                ", numer_konta='" + numer_konta + '\'' +
                ", klasyfikacja_klienta='" + klasyfikacja_klienta + '\'' +
                ", saldo_konta=" + saldo_konta +
                '}';
    }
}
