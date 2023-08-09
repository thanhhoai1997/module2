package _08_DSA_danh_sach.bt_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
   private int size = 0;
    private  static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

    public MyArrayList() {
        System.out.println("khoi tao thanh cong");
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity){
        if (capacity > 0){
            System.out.println("da khoi tao thanh cong voi kich thuoc la : " + capacity);
            elements = new Object[capacity];
        }else {
            System.out.println("khoi tao k thanh cong");
        }

    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity > 0){
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
            System.out.println("khoi tao thanh cong voi kich thuoc la : " + elements.length);
        }
    }
    public int size(){
        return size;
    }
    public int length(){
        return elements.length;
    }
    public E get(int index){
        return (E) elements[index];
    }
    public boolean add(E e){
       if (size == elements.length){
           ensureCapacity(1);
       }
       elements[size] = e;
       size++;
       return true;
    }
    public void add(E e,int index){
        if (index > elements.length){
            System.out.println("vi tri lon hon do dai mang");
        }else if (elements.length == index+1){
            ensureCapacity(1);
        }
        if (elements[index] == null){
            size++;
            elements[index] = e;
        }else {
            if (size == elements.length){
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index+1,size- index);
            elements[index] = e;
            size++;
        }

    }
    public E remove(int index){
        E element = (E) elements[index];
        for (int i = index ; i < size -1;i++ ){
        elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = size;
        return v;
    }
    public int indexOf(E e){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(e)){
                index = i;
                break;
            }
        }
        return index;
    }
    public boolean contains(E e){
        return this.indexOf(e) >= 0;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }
}
