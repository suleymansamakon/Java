package chaining;

import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("ahmet");
        liste.add("mahmut");
        liste.add("ayse");
        liste.add(2,"fatma");
        for(String str:liste){
            System.out.println(str);
        }
    }
}
