package br.com.novaroma.easycon.dao;

import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.structures.*;

public class Dao<T extends Entity> implements IDao<T> {

    @Override
    public void insert(T entity) {

    }

    public void insert(T entity, AvlTree tree) {
        tree.insert(entity);
    }

    public void insert(T entity, Hash hash) {
        //hash.add(entity); 
    }

    public void insert(T entity, LinkedList list) {
        list.addLast(entity);
    }

    public void insert(T entity, DynamicQueue queue) {
        queue.toQueue(entity);
    }

    public void insert(T entity, DynamicStack stack) {
        stack.stackUp(entity);
    }

    @Override
    public void remove(String id) {

    }

    public void remove(String id, AvlTree tree) {
        //tree.remove(id);
    }

    public void remove(String id, Hash hash) {
        //hash.remove(id);
    }

    public void remove(String id, LinkedList list) {
        list.removeBetween(list.searchPosition(id));
    }

    public void remove(DynamicQueue queue) {
        queue.dequeue();
    }

    public void remove(DynamicStack stack) {
        stack.unstack();
    }

    @Override
    public void update(T entity) {
        
    }
    
    public void update(T entity, AvlTree tree) {
        tree.update(entity);
    }
    
    public void update(T entity, Hash hash) {
        //hash.update(entity);
    }
    
    public void update(T entity, LinkedList list) {
        list.update(entity);
    }
    
    public void update(T entity, DynamicQueue queue) {
        queue.update(entity);
    }
    
    public void update(T entity, DynamicStack stack) {
        stack.update(entity);
    }
    

    @Override
    public T search(String id) {
        return null;
    }

     public Entity search(String id, AvlTree tree) {
        return tree.search(id).getEntity();
    }
    
    public Entity search(String id, Hash hash) {
        return null; //hash.search(id);
    }
    
    public Entity search(String id, LinkedList list) {
        return list.returnLink(list.searchPosition(id)).getEntity();
    }
    
    public Entity search(String id, DynamicQueue queue) {
        return queue.search(id);
    }
    
    public Entity search(String id, DynamicStack stack) {
        return stack.search(id);
    }
}
