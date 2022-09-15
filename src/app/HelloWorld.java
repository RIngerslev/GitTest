package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Rasmus!! ");
        System.out.println("Hello again");
        System.out.println("Hola");
        System.out.println("Hvad sker der??");
        System.out.println("Peter er den bedste");
        System.out.println("nyt");
        List<String> navne = new ArrayList<>();
        Collections.addAll(navne,"Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen");
        System.out.println(navne);
    }

    public static int countDelStreng(List<String> list, String sub){

        return 0;
    }
}
