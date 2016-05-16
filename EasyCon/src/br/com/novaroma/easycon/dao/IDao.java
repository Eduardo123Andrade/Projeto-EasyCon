
package br.com.novaroma.easycon.dao;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.structures.*;


public interface IDao {
    
    void insert(Entity entity, AvlTree tree);
    void insert(Entity entity, Hash hash);
    void insert(Entity entity, LinkedList list);
    void insert(Entity entity, DynamicQueue queue);
    void insert(Entity entity, DynamicStack stack);
    
    void remove(String id, AvlTree tree);
    void remove(String id, Hash hash);
    void remove(String id, LinkedList list);
    void remove(DynamicQueue queue);
    void remove(DynamicStack stack);
    
    void update(Entity entity, AvlTree tree);
    void update(Entity entity, Hash hash);
    void update(Entity entity, LinkedList list);
    void update(Entity entity, DynamicQueue queue);
    void update(Entity entity, DynamicStack stack);
    
    Entity search(String id, AvlTree tree);
    Entity search(String id, Hash hash);
    Entity search(String id, LinkedList list);
    Entity search(String id, DynamicQueue queue);
    Entity search(String id, DynamicStack stack);
}
