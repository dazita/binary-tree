package co.edu.uptc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * DoubleList
 */
public class DoubleList<T> implements List<T>{
    
    private Node<T> header;
    private Node<T> last;
    

    public Node<T> getLast(){
        return last;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> tempNode = header;
        while(tempNode != null){
            if(tempNode.getValue() == o){
                return true;
            } else {
                tempNode = tempNode.getGreater();
            }
        }
        return false;
    }
    
    @Override
    public boolean add(T o) {
        Node<T> newNode = new Node<T>(o);
        newNode.setGreater(null);
        if(header == null){
            newNode.setMinor(null);
            header = newNode;
            last = newNode;
        } else {
            last.setGreater(newNode);
            newNode.setMinor(last);
            last = newNode;
        }
        return true;
    }

    @Override
    public int size() {
        int counter = 0;
        Node<T> tempNode = header;
        while(tempNode != null){
            counter++;
            tempNode = tempNode.getGreater();
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        if (header == null) {
            return true;
        } else {
            return false;
        }
    }

    
    // TODO: refactorizar.
    @Override
    public boolean remove(Object o) {
        if (header.getValue() == o){
            header.getGreater().setMinor(null);
            header = header.getGreater();
            return true;
        } else {   
            Node<T> tempNode = header.getGreater();
            while (tempNode != null) {
                if(tempNode.getValue() == o){
                    tempNode.getGreater().setGreater(tempNode.getMinor());
                    tempNode.getGreater().setMinor(tempNode.getMinor());
                    return true;
                } else {
                    tempNode = tempNode.getGreater();
                }
            }
            return false;
        }
    }

    public String showList(){
        String list = "";
        Node<T> actualNode = header;
        while (actualNode != null){
            list += (actualNode.getValue() + " ");
            actualNode = actualNode.getGreater();
        }
        return list;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    @SuppressWarnings("unchecked")
    public <U> U[] toArray(U[] a) {
        // Implementa la conversión de la lista a un array del tipo U
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public T set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}