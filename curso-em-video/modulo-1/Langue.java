import java.util.*;

public class Langue {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage()); // imprime " protuguês"
        System.out.println(loc.getLanguage()); // imprime "pt"
    }
}