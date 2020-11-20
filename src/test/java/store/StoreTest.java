package store;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StoreTest {
    @Test
    public void betaTest() {
        String text = "abc";
        String dupltext = "abc";
        assertThat(text, is(dupltext));
    }
}