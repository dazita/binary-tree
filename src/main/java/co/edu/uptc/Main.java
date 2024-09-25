package co.edu.uptc;

public class Main {
    public static void main(String[] args) {

        IntBinaryTree bt = new IntBinaryTree();

        bt.add(1);
        bt.add(3);
        bt.add(4);
        bt.add(20);
        bt.add(18);
        bt.add(15);
        
        bt.showOrdered();

        BinaryTree<Person> pbt = new BinaryTree<>(MyComparator.comparator);

        pbt.add(new Person(15, "Andres"));
        pbt.add(new Person(24, "Barón"));
        pbt.add(new Person(32, "David"));
        pbt.add(new Person(18, "Camilo"));

        pbt.showOrdered();
    }
}