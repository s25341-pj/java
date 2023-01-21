package pjatk.s25341;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RejestracjaKlientaTest {

    RejestracjaKlienta rejestracjaKlienta = new RejestracjaKlienta();

    @Test
    void checkKlient(){
        //WHEN
        Klient findID = rejestracjaKlienta.findKlient("a123456");
        //THEN
        assertThat(findID.getIdentyfikator()).isEqualTo("a123456");
    }
}
