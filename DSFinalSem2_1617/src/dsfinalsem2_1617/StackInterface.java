
package dsfinalsem2_1617;

import java.util.ArrayList;

public interface StackInterface<T> {
    ArrayList list = new ArrayList<>();
    GenericStack constructor();
    public int getSize();
    public T peek();
    public T pop();
    public void push(T a);
    public boolean isEmpty();
}
