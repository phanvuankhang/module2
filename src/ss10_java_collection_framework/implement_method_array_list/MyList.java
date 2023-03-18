package ss10_java_collection_framework.implement_method_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public void add(int index, int element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index :" + index);
        } else if (elements.length == size) {
            ensureCapacity(5);
        }
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public Object[] remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        return elements;
    }

    public int size() {
        return this.size;
    }


    public boolean contains(int o) {
        return this.indexOf(o) >= 0;
    }

    public int indexOf(int o) {
        for (int i = 0; i <= size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public MyList<Object> clone() {
        MyList<Object> objectMyList = new MyList<>();
        objectMyList.elements = Arrays.copyOf(this.elements, this.size);
        objectMyList.size = this.size;
        return objectMyList;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public int get(int index) {
        return (int) elements[index];
    }

    public boolean add(int e) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size++] = e;
        return true;
    }
}
