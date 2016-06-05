
package br.com.novaroma.easycon.structures;

import java.util.Random;

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
    
    public static int generateCodeOnStack() {
        
        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnStack(codeRandom, stack);
        } while (boo);

        return codeRandom;
    }
    
    public static boolean verifyCodeOnStack(int code, Stack stack) {
        return stack.contanis(String.valueOf(code));
    }
    
    public static int generateCodeOnList() {
        
        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnList(codeRandom, list);
        } while (boo);

        return codeRandom;
    }
    
    public static boolean verifyCodeOnList(int code, LinkedList list) {
        return list.contains(String.valueOf(code));
    }
}
