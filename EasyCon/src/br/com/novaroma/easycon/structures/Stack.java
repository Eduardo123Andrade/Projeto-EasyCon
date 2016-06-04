package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Stack {

    private int top;
    private Entity stack[];

    public Stack() {
        top = -1;
        stack = new Entity[50];
    }

    public Stack(int length) {
        stack = new Entity[length];
        top = -1;
    }

    public void stackUp(Entity entity) {

        if (!isFull()) {
            getStack()[getTop() + 1] = entity;
            setTop(getTop() + 1);
        }
    }

    public void unstack() {

        if (!isEmpty()) {
            getStack()[getTop()] = null;
            setTop(getTop() - 1);
        }
    }

    public String showTop() {

        String topName = "";

        if (!isEmpty()) {
            topName = getStack()[getTop()].getId();
        }

        return topName;
    }

    public String showStack() {

        String fullStack = "";

        if (!isEmpty()) {
            for (int i = 0; i <= getTop(); i++) {
                fullStack += getStack()[i].getId() + " ";
            }
        }

        return fullStack;
    }

    private boolean isFull() {
        return getTop() == getStack().length;
    }

    private boolean isEmpty() {
        return getTop() == -1;
    }
    
    public Entity search(String id) {
       
        Entity entityX = null;
        
        if (!isEmpty()) {
            for (int i = 0; i <= getTop(); i++) {
                if (id.equals(getStack()[i].getId())) {
                   entityX = getStack()[i]; 
                }
            }
        }
        
        return entityX;
    }
    
    public void update(Entity entity) {
        
        if (!isEmpty()) {
            for (int i = 0; i <= getTop(); i++) {
                if (entity.getId().equals(getStack()[i].getId())) {
                    getStack()[i] = entity; 
                }
            }
        }
    }
    
    public boolean contanis(String id) {
        
        if(search(id) == null)
            return false;
        else
            return true;
    }
    
    public Entity returnInIndex(int index) {
        return stack[index];
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Entity[] getStack() {
        return stack;
    }

    public void setStack(Entity[] stack) {
        this.stack = stack;
    }
    
    
}
