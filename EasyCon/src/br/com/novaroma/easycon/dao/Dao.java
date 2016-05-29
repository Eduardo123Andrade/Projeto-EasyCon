package br.com.novaroma.easycon.dao;

import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.structures.*;

//EU PODERIA TRANSFORMAR TODAS AS ESTRUTURAS EM UM ARRAY E ASSIM UTILIZAR APENAS UM METODO PARA A PERSISTENCIA.

public class Dao implements IDao {

    @Override
    public void insert(Entity entity, AvlTree tree) {
        tree.insert(entity);
    }

    @Override
    public void insert(Entity entity, Hash hash, int index) {
        hash.add(entity, index); 
    }

    @Override
    public void insert(Entity entity, LinkedList list) {
        list.addLast(entity);
    }

    @Override
    public void insert(Entity entity, DynamicQueue queue) {
        queue.toQueue(entity);
    }

    @Override
    public void insert(Entity entity, DynamicStack stack) {
        stack.stackUp(entity);
    }

    @Override
    public void remove(String id, AvlTree tree) {
        tree.delete(id);
    }

    @Override
    public void remove(Hash hash, int index) {
        hash.remove(index);
    }

    @Override
    public void remove(String id, LinkedList list) {
        list.removeBetween(list.searchPosition(id));
    }

    @Override
    public void remove(DynamicQueue queue) {
        queue.dequeue();
    }

    @Override
    public void remove(DynamicStack stack) {
        stack.unstack();
    }

    @Override
    public void update(Entity entity, AvlTree tree) {
        tree.update(entity);
    }

    @Override
    public void update(Entity entity, Hash hash, int index) {
        hash.update(entity, index);
    }

    @Override
    public void update(Entity entity, LinkedList list) {
        list.update(entity);
    }

    @Override
    public void update(Entity entity, DynamicQueue queue) {
        queue.update(entity);
    }

    @Override
    public void update(Entity entity, DynamicStack stack) {
        stack.update(entity);
    }

    @Override
    public Entity search(String id, AvlTree tree) {
        return tree.search(id).getEntity();
    }

    @Override
    public Entity search(String id, Hash hash, int index) {
        return hash.search(id, index);
    }

    @Override
    public Entity search(String id, LinkedList list) {
        return list.returnLink(list.searchPosition(id)).getEntity();
    }

    @Override
    public Entity search(String id, DynamicQueue queue) {
        return queue.search(id);
    }

    @Override
    public Entity search(String id, DynamicStack stack) {
        return stack.search(id);
    }
}
