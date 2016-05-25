
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;

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
    
    public static void main(String[] args) {
        
        DynamicQueue queue = new DynamicQueue();
        
        Resident a = new Resident(null, null, null, null, null, "Felipe", null, null, "1", true);
        Resident b = new Resident(null, null, null, null, null, "Catarina", null, null, "2", true);
        Resident c = new Resident(null, null, null, null, null, "Lucas", null, null, "3", true);
        Resident d = new Resident(null, null, null, null, null, "Marina", null, null, "4", true);
        
        queue.toQueue(a);
        queue.toQueue(b);
        queue.toQueue(c);
        
        System.out.println(queue.showQueue());
        
        
    }
}
