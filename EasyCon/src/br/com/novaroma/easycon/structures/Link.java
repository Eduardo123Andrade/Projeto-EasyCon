package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class Link {

    private Link next;
    private Link previous;
    private Entity entity;

    public Link() {

    }

    public Link(Entity entity) {
        this.entity = entity;
    }

    public Link(Link next, Link previous, Entity entity) {
        this.next = next;
        this.previous = previous;
        this.entity = entity;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
