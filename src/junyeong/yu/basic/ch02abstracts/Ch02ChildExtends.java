package junyeong.yu.basic.ch02abstracts;

/**
 * Created by yujun-yeong on 16-07-15.
 */
public class Ch02ChildExtends extends Ch02ParentExtends {
    public void printChild() {
        System.out.println("call printChild() in Ch02ChildExtends");
    }

    @Override
    public void printParent() {
        System.out.println("call printParent() in Ch02ChildExtends");
    }

    @Override
    public void printAbstractParent() {
        System.out.println("call printAbstractParent() in Ch02ChildExtends");
    }
}
