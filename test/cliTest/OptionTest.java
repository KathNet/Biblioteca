package cliTest;

import cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest {

    @Test
    void addOptionInList(){
        Options.loadAvailableOptions();
        assertEquals(8, Options.getOptions().size());
    }

    @Test
    void addOneOption()
    {
        Options.getOptions().clear();
        Options.getOptions().add("1");
        assertEquals(1, Options.getOptions().size());
    }
}
