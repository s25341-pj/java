package pjatk.s25341;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class KlientIntegrationalTest {

    @MockBean
    private RejestracjaKlienta rejestracjaKlienta;

    @Autowired
    private Klientprzelewy klientprzelewy;

    @Test
    void checkWielkoscOplaty() {
        when(rejestracjaKlienta.findKlient(any())).thenReturn(new Klient("imie", "nazwisko", "abc123", "PL852963741", "VIP", 50000));
        //GIVEN
        double obciazRachunekTest = 10 * 0.5;
        //WHEN
        //double cenaVip = klientprzelewy.przelewOplata();
        //THEN
        //assertThat(cenaVip).isEqualTo(obciazRachunekTest);
    }

    @Test
    void testfind(){
        when(rejestracjaKlienta.findKlient(any())).thenReturn(new Klient("imie", "nazwisko", "abc123", "PL852963741", "VIP", 50000));
        List<Klient> allKlient = rejestracjaKlienta.getKlienci();

        assertThat(allKlient).isNotEmpty();
    }

    @Test
    void checkKlient() {
        //WHEN
        Klient findID = rejestracjaKlienta.findKlient("a123456");
        //THEN
        assertThat(findID.getIdentyfikator()).isEqualTo("a123456");
    }
}
