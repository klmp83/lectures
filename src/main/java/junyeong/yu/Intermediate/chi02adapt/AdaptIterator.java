package junyeong.yu.Intermediate.chi02adapt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by yujun-yeong on 16-07-17.
 */
public class AdaptIterator implements Iterator {

    private Enumeration enumeration;

    public AdaptIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException("forEachRemaining() is not supported");
    }
}
