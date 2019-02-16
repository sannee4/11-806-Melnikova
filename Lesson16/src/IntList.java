public interface IntList {
    //добавдение элемента в конец списка
    void add(int e);

    // получение элемента по индексу
    int get(int index);

    //число элементов в списке
    int size();

    //есть ли такой элемент в списке
    boolean contains(int value);

    //удаление элемента по индексу(со смещением элемента влево
    void remove(int index);

    //сортирует элементы по возрастанию
    void sort();

    //возвращает все элементы из списка в виде массива
    int[] toArray();

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(IntList list);

    //добавление всех элементов из списка list в данный список
    // начиная с позиции index
    void addAll(IntList list, int index);
}
