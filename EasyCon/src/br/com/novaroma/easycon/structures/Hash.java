
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Hash {
    
    private DynamicQueue[] hash;

    public Hash() {
        this.hash = new DynamicQueue[3];
        this.hash[0] = new DynamicQueue();
        this.hash[1] = new DynamicQueue();
        this.hash[2] = new DynamicQueue();
    }
    
    public void add(Entity entity, int index) {
        hash[index].toQueue(entity);
    }
    
    public void remove(int index) {
        hash[index].dequeue();
    }
    
    public String showHash(int index) {
        return hash[index].showQueue();
    }
    
    public Entity search(String id, int index) {
        return hash[index].search(id);
    }
   
    public void update(Entity entity, int index) {
        hash[index].update(entity);
    }
    
    public boolean contains(String id) {
        boolean boo = false;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i].contains(id)) {
               boo = true;
            }
        }
        
        return boo;
    }
    
    public DynamicQueue getHashOnIndex(int index) {
        return hash[index];
    }
}
