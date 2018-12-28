
public interface IntList {
    void add(int element);

    void add(int element, int position);

    int get(int position);

    int size();

    boolean contains(int element);

    void remove(int position);

    void sort();

    int[] toArray();

    void addAll(IntList elements);

    void addAll(IntList elements, int position);

    Iterator iterator();
}
