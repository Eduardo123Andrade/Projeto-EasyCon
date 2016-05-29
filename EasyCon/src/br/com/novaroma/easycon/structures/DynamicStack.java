package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;

public class DynamicStack { //90% TESTADO!

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
    
    public static void main(String[] args) {
        
        DynamicStack stack = new DynamicStack();
        
        Resident a = new Resident(null, null, null, null, null, "Felipe", null, null, "1", true);
        Resident b = new Resident(null, null, null, null, null, "Catarina", null, null, "2", true);
        Resident c = new Resident(null, null, null, null, null, "Lucas", null, null, "3", true);
        Resident d = new Resident(null, null, null, null, null, "Marina", null, null, "4", true);
        
        stack.stackUp(a);
        stack.stackUp(b);
        stack.stackUp(c);
        System.out.println(stack.showStack());
        
        stack.unstack();
        System.out.println(stack.showStack());
        
    }
}
