package cli;

import java.util.ArrayList;
import java.util.List;

public class Options {

    private static List<String> options = new ArrayList<>();

    public static List<String> getOptions() {
        return options;
    }

    public static void loadAvailableOptions(){
        getOptions().clear();
        getOptions().add("0");
        getOptions().add("1");
        getOptions().add("2");
        getOptions().add("3");
        getOptions().add("4");
        getOptions().add("5");
        getOptions().add("6");
        getOptions().add("7");
    }
}
