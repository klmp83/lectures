package junyeong.yu.basic.ch01inheritance;

import junyeong.yu.basic.ch01inheritance.composition.ChildComposition;
import junyeong.yu.basic.ch01inheritance.composition.ParentExcellentCompostion;
import junyeong.yu.basic.ch01inheritance.extend.ChildExtends;
import junyeong.yu.basic.ch01inheritance.extend.ParentExtends;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // First, I want to use Parent object for reusability
        ChildComposition childComposition = new ChildComposition();
        childComposition.setParentComposition(new ParentExcellentCompostion());
        childComposition.parentComposition.printParent();

        ChildExtends childExtends = new ChildExtends();
        childExtends.printParent();

        //ParentComposition parentComposition = new ParentComposition();
        //ParentComposition parentComposition1 = new ChildComposition();
        ChildComposition childComposition1 = new ChildComposition();

        ParentExtends parentExtends = new ParentExtends();
        ParentExtends parentExtends1 = /*(ParentExtends)*/ new ChildExtends(); // up casting
        ChildExtends childExtends1 = new ChildExtends();

        ParentExtends parentExtends2 = new ChildExtends();
        ChildExtends childExtends2 = (ChildExtends) parentExtends2; // down casting
        childExtends2.printChild();


        /*ArrayList list = new ArrayList();
        List list1 = new ArrayList(); // up casting

        List arrayList = new LinkedList();
        ArrayList arrayList1 = (ArrayList) arrayList; // down casting
        arrayList1.add(new Object());*/

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Data using ArrayList");
        arrayList.add("Data two using ArrayList");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Data using LinkedList");
        linkedList.add("Data two using LinkedList");

        Main main = new Main();
        main.printList(arrayList);
        main.printList(linkedList);

        //ChildExtends childExtends56 = new ParentExtends();
        //ParentComposition parentComposition = new ChildComposition(); // It does not work;

    }

    private void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}