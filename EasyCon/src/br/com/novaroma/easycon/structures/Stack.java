package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Stack {

    private int top;
    private Entity stack[];

    public Stack() {
        top = -1;
    }

    public Stack(int length) {
        stack = new Entity[length];
        top = -1;
    }

    public void stackUp(Entity entity) {

        if (!isFull()) {
            stack[top + 1] = entity;
            top++;
        }
    }

    public void unstack() {

        if (!isEmpty()) {
            stack[top] = null;
            top--;
        }
    }

    public String showTop() {

        String topName = "";

        if (!isEmpty()) {
            topName = stack[top].getId();
        }

        return topName;
    }

    public String showStack() {

        String fullStack = "";

        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                fullStack += stack[i].getId() + " ";
            }
        }

        return fullStack;
    }

    private boolean isFull() {
        return top == stack.length;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
