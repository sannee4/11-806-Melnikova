import java.util.Arrays;

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;
    private int[] elements = new int[DEFAULT_CAPACITY];
    private int count = 0;

    class IteratorImpl implements Iterator {
        private int currentIndex;

        public IteratorImpl() {
            currentIndex = 0;
        }

        @Override
        public int next() {
            return get(currentIndex++);
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }
    }

    public void add(int element) {
        if (count >= elements.length) {
            grow();
        }

        elements[count++] = element;
    }

    public void add(int element, int position) {
        int from = position;
        if (position >= count) {
            from = size();
        }

        int[] lastElements = Arrays.copyOfRange(elements, from, count);

        while (position > elements.length) {
            grow();
        }

        count = position;
        add(element);

        for (int i = 0; i < lastElements.length; ++i) {
            add(lastElements[i]);
        }
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) ((double) oldCapacity * EXTENSION_COEF);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public int get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        } else {
            throw new IllegalArgumentException("Index invalid");
        }
    }

    public int size() {
        return count;
    }

    public boolean contains(int value) {
        boolean isFind = false;

        for (int i = 0; i < count; ++i) {
            if (get(i) == value) {
                isFind = true;
            }
        }

        return isFind;
    }

    public void remove(int index) {
        int[] lastElements = Arrays.copyOfRange(elements, index + 1, count);
        elements = Arrays.copyOfRange(elements, 0, size() - 1);
        count = index;

        for (int i = 0; i < lastElements.length; i++) {
            add(lastElements[i]);
        }
    }

    public void sort() {
        for (int i = 0; i < size(); ++i) {
            int min = elements[i];

            for (int j = 0; j < size(); ++j) {
                if (min > elements[j]) {
                    int a = elements[i];
                    elements[i] = elements[j];
                    elements[j] = a;
                    min = a;
                }
            }
        }

    }

    public int[] toArray() {
        return Arrays.copyOf(elements, size());
    }

    public void addAll(IntList list) {
        for (int i = 0; i < list.size(); ++i) {
            add(list.get(i));
        }
    }

    public void addAll(IntList list, int index) {
        for (int i = 0; i < list.size(); ++i) {
            add(list.get(i), index + i);
        }
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl();
    }

}