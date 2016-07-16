package junyeong.yu.inheritance;

import junyeong.yu.inheritance.composition.ChildComposition;
import junyeong.yu.inheritance.composition.ParentComposition;
import junyeong.yu.inheritance.composition.ParentExcellentCompostion;
import junyeong.yu.inheritance.composition.ParentKindCompostion;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class MainDepedacyInjection {
    public static void main(String args[]) {
        ChildComposition childComposition = new ChildComposition();

        //ParentComposition parentComposition  = new ParentExcellentCompostion();
        ParentComposition parentComposition  = new ParentKindCompostion();
        //parentComposition.setSomethid('aa')
        childComposition.setParentComposition(parentComposition);
        childComposition.printParent();
        childComposition.printChild();
    }
}
