
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class DynamicQueue {
    
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
       return queue.showReverseList();
    }
    
    public Entity search(String id) {
        return queue.returnLink(queue.searchPosition(id)).getEntity();
    }
    
    public void update(Entity entity) {
        queue.update(entity);
    }
}
