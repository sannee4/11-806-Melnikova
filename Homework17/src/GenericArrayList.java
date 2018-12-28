import java.util.Arrays;

public class GenericArrayList<T> implements ArrayList<T> {
    private T[] elements;
    private int count = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;

    public GenericArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (count >= elements.length) {
            grow();
        }

        elements[count++] = element;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) ((double) oldCapacity * EXTENSION_COEF);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public void add(T element, int position) {
        int from = position;
        if (position >= count) {
            from = size();
        }

        T[] lastElements = Arrays.copyOfRange(elements, from, count);

        while (position > elements.length) {
            grow();
        }

        count = position;
        add(element);

        for (int i = 0; i < lastElements.length; ++i) {
            add(lastElements[i]);
        }
    }

    public T get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        } else {
            throw new IllegalArgumentException("Index invalid");
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T element) {
        boolean isFind = false;

        for (int i = 0; i < count; ++i) {
            if (get(i) == element) {
                isFind = true;
            }
        }

        return isFind;
    }

    @Override
    public void remove(int position) {
        T[] lastElements = Arrays.copyOfRange(elements, position + 1, count);
        elements = Arrays.copyOfRange(elements, 0, size() - 1);
        count = position;

        for (int i = 0; i < lastElements.length; i++) {
            add(lastElements[i]);
        }
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(elements, size());
    }

    @Override
    public void addAll(ArrayList<T> elements) {
        for (int i = 0; i < elements.size(); i++) {
            add(elements.get(i));
        }
    }

    @Override
    public void addAll(ArrayList<T> elements, int position) {
        for (int i = 0; i < elements.size(); i++) {
            add(elements.get(i), position + i);
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

}