

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        this.elements = elements;
    }

    @Override
    public void add(int e) {
        if (count == elements.length) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean contains(int value) {
        for (int e : elements) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == index) {
                for (int j = 0; j < elements.length - 1; j++) {
                    elements[i] = elements[i + 1];
                }
            }
        }
        count--;

    }

    @Override
    public void sort() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > elements[i + 1]) {
                swap(i + 1, i);
            }
        }
    }

    private void swap(int a, int i) {
        a = elements[i];
        elements[i] = elements[i + 1];
        elements[i + 1] = a;
    }

    @Override
    public int[] toArray() {
        int[] newArray = new int[size()];
        for (int i = 0; i < size(); i++) {
            newArray[i] = elements[i];
        }
        return newArray;
    }

    @Override
    public void addAll(IntList list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public void addAll(IntList list, int index) {
        int size = elements.length;
        for (int i = index; i < size; i++) {
            list.add(get(index));
            remove(index);
        }
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }



    class Iterator implements java.util.Iterator{
        int currentIndex;

        public Iterator(int currentIndex) {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex< count;
        }

        @Override
        public Object next() {
            return get(currentIndex++);
        }
    }
}
