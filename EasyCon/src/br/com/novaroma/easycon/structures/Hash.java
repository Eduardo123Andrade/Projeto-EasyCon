package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Hash { 

    private LinkedList[] hash;

    public Hash() {
        this.hash = new LinkedList[3];
        this.hash[0] = new LinkedList();
        this.hash[1] = new LinkedList();
        this.hash[2] = new LinkedList();
    }

    public void addFirst(Entity entity) {
        int id = Integer.parseInt(entity.getId());
        getHash()[hashFunction(id)].addFirst(entity);
    }

    public void removeFirst(int index) {
        getHash()[index].removeFirst();
    }

    public void addLast(Entity entity) {
        int id = Integer.parseInt(entity.getId());
        getHash()[hashFunction(id)].addLast(entity);
    }

    public void removeLast(int index) {
        getHash()[index].removeLast();
    }

    public void addBetween(Entity entity, int position) {
        int id = Integer.parseInt(entity.getId());
        getHash()[hashFunction(id)].addBetween(entity, position);
    }

    public void removeBetween(int index, int position) {
        getHash()[index].removeBetween(position);
    }

    public String showHash(int index) {
        return getHash()[index].showList();
    }

    public Entity search(String id) {
        return getHash()[hashFunction(Integer.parseInt(id))].search(id);
    }

    public void update(Entity entity) {
        int id = Integer.parseInt(entity.getId());
        getHash()[hashFunction(id)].update(entity);
    }

    public void remove(String id) {
        getHash()[Integer.parseInt(id)].removeBetween(getHash()[Integer.parseInt(id)].searchPosition(id));
    }
    
    public boolean contains(String id) {
        boolean boo = false;

        for (int i = 0; i < getHash().length; i++) {
            if (getHash()[i].contains(id)) {
                boo = true;
            }
        }

        return boo;
    }

    public LinkedList getHashOnIndex(int index) {
        return getHash()[index];
    }

    private int hashFunction(int id) {
        return id % getHash().length;
    }

    public LinkedList[] getHash() {
        return hash;
    }

    public void setHash(LinkedList[] hash) {
        this.hash = hash;
    }
    
}
