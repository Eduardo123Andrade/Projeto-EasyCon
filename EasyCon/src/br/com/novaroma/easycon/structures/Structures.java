
package br.com.novaroma.easycon.structures;

public class Structures {
   
    private static AvlTree tree = new AvlTree();
    private static Hash hash = new Hash();
    private static LinkedList list = new LinkedList();
    private static DynamicQueue queue = new DynamicQueue();
    private static DynamicStack stack = new DynamicStack();

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

    public static DynamicQueue getQueue() {
        return queue;
    }

    public static void setQueue(DynamicQueue aQueue) {
        queue = aQueue;
    }

    public static DynamicStack getStack() {
        return stack;
    }

    public static void setStack(DynamicStack aStack) {
        stack = aStack;
    }
    
    
}
