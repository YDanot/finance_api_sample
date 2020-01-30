package wallet;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class FinanceApiTest {

    @Test
    public void convert() throws Exception {
        final String tenEurosToDollars = new FinanceApi().convert("EUR", "USD", "10");
        Assertions.assertThat(new BigDecimal(tenEurosToDollars)).isPositive();
    }

}