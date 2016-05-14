package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Queue {

    private Entity queue[];
    private int first;
    private int last;
    private int count;

    public Queue() {

    }

    public Queue(int length) {
        queue = new Entity[length];
    }

    public void toQueue(Entity entity) {

        if (!isFull()) {
            queue[last] = entity;
            last++;
            count++;

            if (last >= queue.length) {
                last = 0;
            }
        }
    }

    public void dequeue() {

        if (!isEmpty()) {
            queue[first] = null;
            first++;
            count--;

            if (first >= queue.length) {
                first = 0;
            }
        }
    }

    public String showFirst() {

        String firstName = "";

        if (!isEmpty()) {
            firstName = queue[first].getId();
        }

        return firstName;
    }

    public String showQueue() {

        String fullQueue = "";
        int temp = first;

        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                fullQueue += queue[temp].getId() + " ";
                temp++;

                if (temp >= queue.length) {
                    temp = 0;
                }
            }
        }

        return fullQueue;
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == queue.length;
    }
    
    public Entity search(String id) {
       
        Entity entityX = null;
        int temp = first;
        
         if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (id.equalsIgnoreCase(queue[temp].getId())) {
                    entityX = queue[temp];
                }
                temp++;

                if (temp >= queue.length) {
                    temp = 0;
                }
            }
        }
        
        return entityX;
    }
    
    public void update(Entity entity) {
        
         int temp = first;
        
         if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (entity.getId().equalsIgnoreCase(queue[temp].getId())) {
                    queue[temp] = entity;
                }
                temp++;

                if (temp >= queue.length) {
                    temp = 0;
                }
            }
        }
    }
}
