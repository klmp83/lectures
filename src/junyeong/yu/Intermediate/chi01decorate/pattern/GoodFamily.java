package junyeong.yu.Intermediate.chi01decorate.pattern;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class GoodFamily implements Family {
    protected Family family;

    public GoodFamily(Family family) {
        this.family = family;
    }

    @Override
    public void printGrandParent() {
        family.printGrandParent();
        System.out.println("call printGrandParent() in GoodFamily");
    }

    @Override
    public void openConnection() {
        family.openConnection();
        System.out.println("call openConnection() in GoodFamily");
    }
}
