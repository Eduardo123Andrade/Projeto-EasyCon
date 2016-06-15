package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;

public class AvlLink {

    private AvlLink left;
    private AvlLink right;
    private int height;
    private Entity entity;
    
    public AvlLink (Entity entity) {
        this.entity = entity;
    }
    public AvlLink (Entity entity, AvlLink left, AvlLink right) {
        this.entity = entity;
        this.left = left;
        this.right = right;
    }

    public AvlLink getLeft() {
        return left;
    }

    public void setLeft(AvlLink left) {
        this.left = left;
    }

    public AvlLink getRight() {
        return right;
    }

    public void setRight(AvlLink right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
