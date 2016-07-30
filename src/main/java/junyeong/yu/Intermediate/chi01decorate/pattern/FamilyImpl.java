package junyeong.yu.Intermediate.chi01decorate.pattern;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class FamilyImpl implements Family {
    @Override
    public void printGrandParent() {
        System.out.println("call printGrandParent() in FamilyImpl");
    }

    @Override
    public void openConnection() {
        System.out.println("call openConnection() in FamilyImpl");
    }
}
