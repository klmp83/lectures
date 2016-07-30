package junyeong.yu.basic.ch02abstracts;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class Ch02Main {
    public static void main(String[] args) {
        //System.out.println();
        //System.out.println();

        //new Ch02ParentExtends().printParent();
        new Ch02ChildExtends().printParent();
        new Ch02ChildExtends().printAbstractParent();

        new Ch02AnotherChildExtends().printParent();
        new Ch02AnotherChildExtends().printAbstractParent();

    }
}
