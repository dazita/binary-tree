package co.edu.uptc;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree<Person>(new MyComparator("name"));

        bt.add(30);
        bt.add(50);
        bt.add(20);
        bt.add(15);
        bt.add(32);
        bt.add(38);
        bt.add(7);
        bt.add(5);

        bt.showOrdered();
    }
}