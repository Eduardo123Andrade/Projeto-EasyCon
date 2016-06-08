
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;


public class DynamicQueue { //90% TESTADO!
    
    private LinkedList queue;
    
    public DynamicQueue() {
        queue = new LinkedList();
    }
    
    public void toQueue(Entity entity) {
        queue.addLast(entity);
    }
    
    public void dequeue() {
        queue.removeLast();
    }
    
    public String showQueue() {
       return queue.showList();
    }
    
    public Entity search(String id) {
        return queue.returnLink(queue.searchPosition(id)).getEntity();
    }
    
    public void update(Entity entity) {
        queue.update(entity);
    }
    
    public boolean contains(String id) {
        return queue.contains(id);
    }
    
    public Link getFirst() {
        return queue.getFirst();
    }
}
