package junyeong.yu.basic.ch01inheritance.composition;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class ParentKindCompostion implements ParentComposition {
    @Override
    public void printParent() {
        System.out.println("call printParent() - My parent is Kind and Good ParentKindCompostion");
    }
}
