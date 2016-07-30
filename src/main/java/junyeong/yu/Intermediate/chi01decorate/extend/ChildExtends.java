package junyeong.yu.Intermediate.chi01decorate.extend;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class ChildExtends extends ParentExtends {
    public void printChild() {
        System.out.println("call printChild() in ChildExtends");
    }

    @Override
    public void printGrandParent() {
        super.printGrandParent();
        System.out.println("call printGrandParent() in ChildExtends");
    }
}
