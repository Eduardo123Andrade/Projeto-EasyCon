package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class DynamicStack {

    private LinkedList stack;

    public DynamicStack() {
        stack = new LinkedList();
    }

    public void stackUp(Entity entity) {
        stack.addLast(entity);
    }

    public void unstack() {
        stack.removeLast();
    }

    public String showStack() {
        return stack.showReverseList();
    }

    public Entity search(String id) {
        return stack.returnLink(stack.searchPosition(id)).getEntity();
    }

    public void update(Entity entity) {
        stack.update(entity);
    }
}
