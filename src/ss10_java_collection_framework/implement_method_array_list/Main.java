package ss10_java_collection_framework.implement_method_array_list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        System.out.println(Arrays.toString(myList.clone().elements));
        myList.remove(2);
        System.out.println(Arrays.toString(myList.clone().elements));
        myList.clear();
        System.out.println(Arrays.toString(myList.clone().elements));
    }
}
