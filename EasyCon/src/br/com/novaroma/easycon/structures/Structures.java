
package br.com.novaroma.easycon.structures;

public class Structures {
   
    private static AvlTree tree = new AvlTree();
    private static Hash hash = new Hash();
    private static LinkedList list = new LinkedList();
    private static Queue queue = new Queue();
    private static Stack stack = new Stack();

    public static AvlTree getTree() {
        return tree;
    }

    public static void setTree(AvlTree aTree) {
        tree = aTree;
    }

    public static Hash getHash() {
        return hash;
    }

    public static void setHash(Hash aHash) {
        hash = aHash;
    }

    public static LinkedList getList() {
        return list;
    }

    public static void setList(LinkedList aList) {
        list = aList;
    }

    public static Queue getQueue() {
        return queue;
    }

    public static void setQueue(Queue aQueue) {
        queue = aQueue;
    }

    public static Stack getStack() {
        return stack;
    }

    public static void setStack(Stack aStack) {
        stack = aStack;
    }
    
    
}
