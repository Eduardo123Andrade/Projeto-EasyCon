package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.*; // <--- APENAS PARA TESTE

public class AvlTree {

    private AvlLink root = null;
    private String dataTree = "";

    public AvlTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public AvlLink getRootNode() {
        return root;
    }

    private static int height(AvlLink t) {  //Retorna altura do no.

        if (t == null) {
            return -1;
        } else {
            return t.getHeight();
        }
    }

    private static int max(int lhs, int rhs) { //Retorna o maior valor ente lhs e rhs.

        if (lhs > rhs) {
            return lhs;
        } else {
            return rhs;
        }
    }

    private int getFactor(AvlLink t) { //Retorna o fator de balanceamento da árvore com raiz passada como parametro.
        return height(t.getLeft()) - height(t.getRight());
    }

    public boolean insert(Entity entity) {
        root = insert(entity, root);
        return true;
    }

    private AvlLink insert(Entity entity, AvlLink t) {

        if (t == null) {
            t = new AvlLink(entity);
        } else if (entity.getId().compareTo(t.getEntity().getId()) < 0) {
            t.setLeft(insert(entity, t.getLeft()));
        } else if (entity.getId().compareTo(t.getEntity().getId()) > 0) {
            t.setRight(insert(entity, t.getRight()));
        }
        t = balance(t);

        return t;
    }

    public AvlLink balance(AvlLink t) {

        if (getFactor(t) == 2) {
            if (getFactor(t.getLeft()) > 0) {
                t = doRightRotation(t);
            } else {
                t = doDoubleRightRotation(t);
            }
        } else if (getFactor(t) == -2) {
            if (getFactor(t.getRight()) < 0) {
                t = doLeftRotation(t);
            } else {
                t = doDoubleLeftRotation(t);
            }
        }

        t.setHeight(max(height(t.getLeft()), height(t.getRight())) + 1);

        return t;
    }

    private static AvlLink doRightRotation(AvlLink k2) {

        AvlLink k1 = k2.getLeft();
        k2.setLeft(k1.getRight());
        k1.setRight(k2);
        k2.setHeight(max(height(k2.getLeft()), height(k2.getRight())) + 1);
        k1.setHeight(max(height(k1.getLeft()), k2.getHeight()) + 1);

        return k1;
    }

    private static AvlLink doLeftRotation(AvlLink k1) {

        AvlLink k2 = k1.getRight();
        k1.setRight(k2.getLeft());
        k2.setLeft(k1);
        k1.setHeight(max(height(k1.getLeft()), height(k1.getRight())) + 1);
        k2.setHeight(max(height(k2.getRight()), k1.getHeight()) + 1);

        return k2;
    }

    private static AvlLink doDoubleRightRotation(AvlLink k3) {
        k3.setLeft(doLeftRotation(k3.getLeft()));

        return doRightRotation(k3);
    }

    private static AvlLink doDoubleLeftRotation(AvlLink k1) {
        k1.setRight(doRightRotation(k1.getRight()));

        return doLeftRotation(k1);
    }

    public AvlLink search(String id) {
        return search(root, id);
    }

    private AvlLink search(AvlLink temp, String id) {

        while (temp != null) {
            if (id.equalsIgnoreCase(temp.getEntity().getId())) {
                return temp;
            } else if (id.compareToIgnoreCase(temp.getEntity().getId()) < 0) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        //Caso nao encontre, retona null.
        return null;
    }

    public String inorder() {
        return inorder(root);
    }

    private String inorder(AvlLink temp) {

        if (temp != null) {
            inorder(temp.getLeft());
            dataTree += temp.getEntity().getId() + " ";
            inorder(temp.getRight());
        }

        return dataTree;
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(AvlLink temp) {

        if (temp != null) {
            System.out.print(temp.getEntity().getId() + " ");
            preorder(temp.getLeft());
            preorder(temp.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(AvlLink temp) {

        if (temp != null) {
            postorder(temp.getLeft());
            postorder(temp.getRight());
            System.out.print(temp.getEntity().getId() + " ");
        }
    }

    public void update(Entity entity) {

        AvlLink temp = root;

        while (temp != null) {
            if (entity.getId().equalsIgnoreCase(temp.getEntity().getId())) {
                temp.setEntity(entity);
            } else if (entity.getId().compareToIgnoreCase(temp.getEntity().getId()) < 0) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
    }

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        Resident x = new Resident();
        x.setCpf("1");
        Resident y = new Resident();
        y.setCpf("3");
        Resident z = new Resident();
        z.setCpf("2");
        Resident w = new Resident();
        w.setCpf("5");

        Maneger man = new Maneger();
        man.setCpf("dsgsd");

        tree.insert(x);
        tree.insert(y);
        tree.insert(z);
        tree.insert(w);
        tree.insert(man);

        //System.out.println(tree.getRootNode().getEntity().getId());
        System.out.println(tree.inorder());
        // System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
    }
}
