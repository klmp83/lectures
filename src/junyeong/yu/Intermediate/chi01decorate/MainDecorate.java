package junyeong.yu.Intermediate.chi01decorate;

import junyeong.yu.Intermediate.chi01decorate.extend.ChildExtends;
import junyeong.yu.Intermediate.chi01decorate.pattern.*;

import java.io.*;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class MainDecorate {
    public static void main(String[] args) {
        ChildExtends childExtends = new ChildExtends();
        childExtends.printGrandParent();

        System.out.println();

        Family family = new FamilyImpl();
        family = new BadFamily(family);
        family = new GoodFamily(family);
        family = new KindFamily(family);
        family.printGrandParent();
        family.openConnection();

        System.out.println();

        Family family1 = new KindFamily(new GoodFamily(new BadFamily(new FamilyImpl())));
        family.printGrandParent();

        Writer writer = null;
        // real practice
        try {
            File file = new File("abc.txt");
            writer = new FileWriter(file);
            writer = new BufferedWriter(writer);
            writer = new PrintWriter(writer);

            writer.write("abddddcv");
            writer.close();


            Writer writer1 = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            writer1.write("asdfsafsd");
            writer1.close();
        } catch (Exception e) {
            e.printStackTrace(); // not good way
            throw new RuntimeException("File something problem");
        } finally {
            if (writer !=  null) {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
