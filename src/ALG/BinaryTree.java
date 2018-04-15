package ALG;

import java.util.concurrent.ArrayBlockingQueue;

public class BinaryTree {

    private static Tree root;

    private static class Tree {
        int data;
        Tree leftTree;
        Tree rightTree;
        Tree(int data) {
            this.data = data;
            this.leftTree = null;
            this.rightTree = null;
        }
        Tree(){}
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 12, 45, 21, 6, 111};
        for (int b : a) {
            createTree(root, b);
        }
//        preOrder(root);
//        endOrder(root);
//        inOrder(root);
        levelSort(root, a.length);
    }

    private static void levelSort(Tree root, int length) {
        if (root == null)
            return;
        ArrayBlockingQueue<Tree> trees = new ArrayBlockingQueue<>(length);
        trees.offer(root);
        while (!trees.isEmpty()) {
            Tree tree = trees.poll();
            System.out.print(tree.data + " ");
            if (tree.leftTree != null) {
                trees.offer(tree.leftTree);
            }
            if (tree.rightTree != null) {
                trees.offer(tree.rightTree);
            }
        }
    }

    private static void preOrder (Tree tree) {
        if (tree != null) {
            System.out.print(tree.data + " ");
            preOrder(tree.leftTree);
            preOrder(tree.rightTree);
        }
    }

    private static void inOrder (Tree tree) {
        if (tree != null) {
            inOrder(tree.leftTree);
            System.out.print(tree.data + " ");
            inOrder(tree.rightTree);
        }
    }

    private static void endOrder (Tree tree) {
        if (tree != null) {
            endOrder(tree.leftTree);
            endOrder(tree.rightTree);
            System.out.println(tree.data + "");
        }
    }

    private static void createTree(Tree node, int data) {
        if (root == null) {
            root = new Tree(data);
        } else {
            if (data < node.data) {
                if (node.leftTree == null) {
                    node.leftTree = new Tree(data);
                } else {
                    createTree(node.leftTree, data);
                }
            } else {
                if (node.rightTree == null) {
                    node.rightTree = new Tree(data);
                } else {
                    createTree(node.rightTree, data);
                }
            }
        }
    }
}
