
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;
import javax.swing.JOptionPane;

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
        
        queue.update(new Resident(null, null, null, null, null, "Tiao bocapreta", null, null, "1", true));
        System.out.println(queue.showQueue());
        
        Resident x = (Resident)queue.search("3");
        JOptionPane.showMessageDialog(null, x.getName());
    }
}
