package junyeong.yu.Intermediate.chi02adapt;

import java.util.*;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class MainAdapt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("List one");
        list.add("list two");
        list.add("List Three");

        Vector<String> vector = new Vector<String>();
        vector.add("Vector one");
        vector.add("Vector two");
        vector.add("Vector Three");

        Iterator<String> iterator = list.iterator();
        loop(iterator);

        Iterator<String> iteratorTwo = new AdaptIterator(vector.elements());
        loop(iteratorTwo);

        List<Iterator> iteratorList = new ArrayList<Iterator>();
        iteratorList.add(iterator);
        iteratorList.add(iteratorTwo);
    }
    private static void loop(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String result = iterator.next();
            System.out.println(result);
        }
    }
    /*private static void loop(Enumeration<String> enumeration) {
        while (enumeration.hasMoreElements()) {
            String result = enumeration.nextElement();
            System.out.println(result);
        }
    }*/
}
