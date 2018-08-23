package wallet;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;


public class FinanceApiTest {

    @Test
    public void convert() throws Exception {
        Assertions.assertThat(new FinanceApi().convert("EUR", "USD", "10")).isNotEmpty();
    }

}