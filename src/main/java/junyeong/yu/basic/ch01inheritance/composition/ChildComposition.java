package junyeong.yu.basic.ch01inheritance.composition;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class ChildComposition {
    public ParentComposition parentComposition;
    public void setParentComposition(ParentComposition parentComposition) {
        this.parentComposition = parentComposition;
    }

    public void printParent() {
        this.parentComposition.printParent();
    }
    public void printChild() {
        printParent();
        System.out.println("call printChild() in ChildComposition");
    }
}
