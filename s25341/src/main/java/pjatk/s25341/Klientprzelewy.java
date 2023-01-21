package pjatk.s25341;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Klientprzelewy {
    private double cenaPrzelewu;
    private final RejestracjaKlienta rejestracjaKlienta;

    public Klientprzelewy(RejestracjaKlienta rejestracjaKlienta) {
        this.rejestracjaKlienta = rejestracjaKlienta;
    }

    public List<Klient> getAllKlient() {
        return rejestracjaKlienta.getKlienci();
    }

    private double przelewOplata(Klient klient) {
        switch (klient.getKlasyfikacja_klienta()) {
            case "VIP": {
                cenaPrzelewu = 0.5;
                break;
            }
            case "Standard": {
                cenaPrzelewu = 2.5;
                break;
            }
        }
        return cenaPrzelewu;
    }
}
