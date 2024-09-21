package level13;

import java.util.Objects;

public class BinaryTree {
    Integer value = null;
    BinaryTree left = null;
    BinaryTree right = null;


    public BinaryTree(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void insert(Integer value) {
        if (this.value == null) {
            this.value = value;
        } else if (value < this.value) {
            if (this.left == null) {
                this.left = new BinaryTree(value);
            } else {
                this.left.insert(value);
            }
        } else if (value > this.value) {
            if (this.right == null) {
                this.right = new BinaryTree(value);
            } else {
                this.right.insert(value);
            }

        }
    }

    public void print() {
        if (this.left != null) {
            this.left.print();
        }
        System.out.print(this.value + " ");
        if (this.right != null) {
            this.right.print();
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(12);
        tree.insert(17);
        tree.insert(1);
        tree.insert(11);
        tree.insert(16);
        tree.insert(20);
        tree.print();
    }
}