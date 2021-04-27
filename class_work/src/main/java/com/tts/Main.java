package com.tts;

public class Main {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        int[] Nodes = {3,2,4,10,2,1};

        for (int n : Nodes) {
            bt.add(n);
        }

        System.out.println(bt);

        BinaryHeap bh = new BinaryHeap();

        int[] NodesHeap = {1, 12, 3, 24, 7, 19, 1, 50, 16};

        for (int n : NodesHeap) {
            bh.heap.add(n);
        }


        System.out.print(bh.heap);
    }


}
