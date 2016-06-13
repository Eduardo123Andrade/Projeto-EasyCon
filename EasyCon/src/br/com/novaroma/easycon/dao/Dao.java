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
    public void insert(Entity entity, Hash hash) {
        hash.addLast(entity);
    }

    @Override
    public void insert(Entity entity, LinkedList list) {
        list.addLast(entity);
    }

    @Override
    public void insert(Entity entity, Queue queue) {
        queue.toQueue(entity);
    }

    @Override
    public void insert(Entity entity, Stack stack) {
        stack.stackUp(entity);
    }

    @Override
    public void remove(String id, AvlTree tree) {
        tree.delete(id);
    }

    @Override
    public void remove(Hash hash, String id) {
        hash.remove(id);
    }

    @Override
    public void remove(String id, LinkedList list) {
        list.removeBetween(list.searchPosition(id));
    }

    @Override
    public void remove(Queue queue) {
        queue.dequeue();
    }

    @Override
    public void remove(Stack stack) {
        stack.unstack();
    }

    @Override
    public void update(Entity entity, AvlTree tree) {
        tree.update(entity);
    }

    @Override
    public void update(Entity entity, Hash hash) {
        hash.update(entity);
    }

    @Override
    public void update(Entity entity, LinkedList list) {
        list.update(entity);
    }

    @Override
    public void update(Entity entity, Queue queue) {
        queue.update(entity);
    }

    @Override
    public void update(Entity entity, Stack stack) {
        stack.update(entity);
    }

    @Override
    public Entity search(String id, AvlTree tree) {
        return tree.search(id).getEntity();
    }

    @Override
    public Entity search(String id, Hash hash) {
        return hash.search(id);
    }

    @Override
    public Entity search(String id, LinkedList list) {
        return list.search(id);
    }

    @Override
    public Entity search(String id, Queue queue) {
        return queue.search(id);
    }

    @Override
    public Entity search(String id, Stack stack) {
        return stack.search(id);
    }
}
