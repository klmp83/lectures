package junyeong.yu.Intermediate.chi01decorate.extend;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class ParentExtends extends GrandParentExtends {
    public void printParent() {
        System.out.println("call printParent() in ParentExtends");
    }

    @Override
    public void printGrandParent() {
        super.printGrandParent();
        System.out.println("call printGrandParent() in ParentExtends");
    }
}
