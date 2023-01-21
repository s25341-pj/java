package pjatk.s25341;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RejestracjaKlienta {

    private List<Klient> klienci;

    public RejestracjaKlienta() {
        klienci = List.of(
                new Klient("Klient1imie", "Klienta1nazwisko", "a123456", "PL845698785", "VIP", 10000),
                new Klient("Klient2imie", "Klienta2nazwisko", "b123457", "PL147258369", "Standard",2000),
                new Klient("Klient3imie", "Klienta3nazwisko", "c123458", "PL963852741", "Standard",5000)
        );
    }

    public List<Klient> getKlienci() {
        return klienci;
    }

    public Klient findKlient(String identyfikator) {
        for (Klient klient : klienci) {
            if (klient.getIdentyfikator().equals(identyfikator)) {
                return klient;
            }
        }
        return null;
    }
}
