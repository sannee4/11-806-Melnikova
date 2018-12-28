public interface ArrayList<T> {
    void add(T element);

    void add(T element, int position);

    T get(int position);

    int size();

    boolean contains(T element);

    void remove(int position);

    T[] toArray();

    void addAll(ArrayList<T> elements);

    void addAll(ArrayList<T> elements, int position);

    Iterator iterator();
}
