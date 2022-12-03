package SimpleProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListTest {

    public static void ArrayListExample(){

        List<String> names = new ArrayList<>();
        names.add("Adrian");
        names.add("Kamil");
        names.add("Robert");
        names.add("Paweł");

        names.remove("Paweł");

        for (String name : names) {
            System.out.println(name);
        }
    }
    public static void HashMapTest(){
        Map<String, String> EPS = new HashMap<>();
        EPS.put("Sztuka1", "OK");
        EPS.put("Sztuka2", "OK");
        EPS.put("Sztuka3", "NG");
        System.out.println(EPS.get("Sztuka3"));
    }


}
