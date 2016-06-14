package br.com.novaroma.easycon.structures;

import java.util.Random;

public class Structures {

    private static AvlTree tree = new AvlTree();
    private static Hash hash = new Hash();
    private static Hash hashReceipt = new Hash();
    private static LinkedList list = new LinkedList();
    private static LinkedList listVotes = new LinkedList();
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

    public static LinkedList getListVotes() {
        return listVotes;
    }

    public static void setListVotes(LinkedList aListVotes) {
        listVotes = aListVotes;
    }

    public static Hash getHashReceipt() {
        return hashReceipt;
    }

    public static void setHashReceipt(Hash aHashReceipt) {
        hashReceipt = aHashReceipt;
    }

    public static int generateCodeOnStack(Stack stack) {

        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnStack(codeRandom, stack);
        } while (boo);

        return codeRandom;
    }

    private static boolean verifyCodeOnStack(int code, Stack stack) {
        return stack.contanis(String.valueOf(code));
    }

    public static int generateCodeOnList(LinkedList list) {

        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnList(codeRandom, list);
        } while (boo);

        return codeRandom;
    }

    private static boolean verifyCodeOnList(int code, LinkedList list) {
        return list.contains(String.valueOf(code));
    }

    public static int generateCodeOnHash(Hash hash) {

        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnHash(codeRandom, hash);
        } while (boo);

        return codeRandom;
    }

    private static boolean verifyCodeOnHash(int code, Hash hash) {
        return hash.contains(String.valueOf(code));
    }
}
