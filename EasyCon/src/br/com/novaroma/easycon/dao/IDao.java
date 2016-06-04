
package br.com.novaroma.easycon.dao;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.structures.*;


public interface IDao {
    
    void insert(Entity entity, AvlTree tree);
    void insert(Entity entity, Hash hash, int index);
    void insert(Entity entity, LinkedList list);
    void insert(Entity entity, Queue queue);
    void insert(Entity entity, Stack stack);
    
    void remove(String id, AvlTree tree);
    void remove(Hash hash, int index);
    void remove(String id, LinkedList list);
    void remove(Queue queue);
    void remove(Stack stack);
    
    void update(Entity entity, AvlTree tree);
    void update(Entity entity, Hash hash, int index);
    void update(Entity entity, LinkedList list);
    void update(Entity entity, Queue queue);
    void update(Entity entity, Stack stack);
    
    Entity search(String id, AvlTree tree);
    Entity search(String id, Hash hash, int index);
    Entity search(String id, LinkedList list);
    Entity search(String id, Queue queue);
    Entity search(String id, Stack stack);
}
