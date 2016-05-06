package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class DLink {

    private DLink next;
    private DLink previous;
    private Entity entity;

    public DLink() {

    }

    public DLink(Entity entity) {
        this.entity = entity;
    }

    public DLink(DLink next, DLink previous, Entity entity) {
        this.next = next;
        this.previous = previous;
        this.entity = entity;
    }

    public DLink getNext() {
        return next;
    }

    public void setNext(DLink next) {
        this.next = next;
    }

    public DLink getPrevious() {
        return previous;
    }

    public void setPrevious(DLink previous) {
        this.previous = previous;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
