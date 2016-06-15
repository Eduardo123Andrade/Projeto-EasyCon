package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.*;


public class AvlTree {

    private AvlLink root = null;
    private String dataTree = "";
    private int quantity;

    public AvlTree() {
        root = null;
    }
    
     public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public AvlLink getRoot() {
        return root;
    }

    public void setRoot(AvlLink root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }

    public AvlLink getRootNode() {
        return getRoot();
    }

    private static int height(AvlLink link) {  //Retorna altura do no.

        if (link == null) {
            return -1;
        } else {
            return link.getHeight();
        }
    }

    private static int max(int lhs, int rhs) { //Retorna o maior valor ente lhs e rhs.

        if (lhs > rhs) {
            return lhs;
        } else {
            return rhs;
        }
    }

    private int getFactor(AvlLink link) { //Retorna o fator de balanceamento da árvore com raiz passada como parametro.
        return height(link.getLeft()) - height(link.getRight());
    }

    public boolean insert(Entity entity) {
        setRoot(insert(entity, getRoot()));
        
        return true;
    }

    private AvlLink insert(Entity entity, AvlLink link) {

        if (link == null) {
            link = new AvlLink(entity);
            quantity++;
        } 
        else if (entity.getId().compareTo(link.getEntity().getId()) < 0) {
            link.setLeft(insert(entity, link.getLeft()));
        } 
        else if (entity.getId().compareTo(link.getEntity().getId()) > 0) {
            link.setRight(insert(entity, link.getRight()));
        }
       
        link = balance(link);

        return link;
    }

    public AvlLink balance(AvlLink link) {

        if (getFactor(link) == 2) {
            if (getFactor(link.getLeft()) > 0) 
                link = doRightRotation(link);
            else 
                link = doDoubleRightRotation(link);
        } 
        else if (getFactor(link) == -2) {
            if (getFactor(link.getRight()) < 0) 
                link = doLeftRotation(link);
            else 
                link = doDoubleLeftRotation(link);
        }

        link.setHeight(max(height(link.getLeft()), height(link.getRight())) + 1);

        return link;
    }

    private static AvlLink doRightRotation(AvlLink link2) {

        AvlLink link1 = link2.getLeft();
        
        link2.setLeft(link1.getRight());
        link1.setRight(link2);
        
        link2.setHeight(max(height(link2.getLeft()), height(link2.getRight())) + 1);
        link1.setHeight(max(height(link1.getLeft()), link2.getHeight()) + 1);

        return link1;
    }

    private static AvlLink doLeftRotation(AvlLink link1) {

        AvlLink link2 = link1.getRight();
        
        link1.setRight(link2.getLeft());
        link2.setLeft(link1);
        
        link1.setHeight(max(height(link1.getLeft()), height(link1.getRight())) + 1);
        link2.setHeight(max(height(link2.getRight()), link1.getHeight()) + 1);

        return link2;
    }

    private static AvlLink doDoubleRightRotation(AvlLink link) {
        link.setLeft(doLeftRotation(link.getLeft()));

        return doRightRotation(link);
    }

    private static AvlLink doDoubleLeftRotation(AvlLink link) {
        link.setRight(doRightRotation(link.getRight()));

        return doLeftRotation(link);
    }

    public AvlLink search(String id) {
        return search(getRoot(), id);
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
        return inorder(getRoot());
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
        preorder(getRoot());
    }

    private void preorder(AvlLink temp) {

        if (temp != null) {
            System.out.print(temp.getEntity().getId() + " ");
            preorder(temp.getLeft());
            preorder(temp.getRight());
        }
    }

    public void postorder() {
        postorder(getRoot());
    }

    private void postorder(AvlLink temp) {

        if (temp != null) {
            postorder(temp.getLeft());
            postorder(temp.getRight());
            System.out.print(temp.getEntity().getId() + " ");
        }
    }

    public void update(Entity entity) {

        AvlLink temp = getRoot();

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
    
    public void delete(String id) {
        Entity entity = search(id).getEntity();
        deleteLink(getRoot(), entity);
    }
    
    private AvlLink deleteLink(AvlLink root, Entity entity) {
		
        if (root == null) {
            return root;
        }
        
        if (quantity == 1) {
            this.root = null;
            quantity--;
        }
        else if (entity.getId().compareTo(root.getEntity().getId()) < 0) {
            root.setLeft(deleteLink(root.getLeft(), entity));
        } 

        else if (entity.getId().compareTo(root.getEntity().getId()) > 0) {
            root.setRight(deleteLink(root.getRight(), entity));
        } 
        else {
            // Nó com apenas um filho.
            if ((root.getLeft() == null) || (root.getRight() == null)) {
                AvlLink temp = null;
                
                if (temp == root.getLeft()) {
                    temp = root.getRight();
                } 
                else {
                    temp = root.getLeft();
                }
 
                // Sem filhos.
                if (temp == null) {
                    temp = root;
                    root = null;
                } 
                // One child case
                else {
                    root = temp; // Copy the contents of the non-empty child
                }
            } 
            else {
 
                //Nó com dois filhos.
            	AvlLink temp = lowerValue(root.getRight());
 
                // Copy the inorder successor's data to this node
                root.setEntity(temp.getEntity()); //MODIFIQUEI E NAO SEI SE ESTA CORRETO
 
                // Delete the inorder successor
                root.setRight(deleteLink(root.getRight(), temp.getEntity()));
            }
            quantity--;
        }
 
       
        if (root == null) {
            return root;
        }
 
        // Atualiza a altura do nó atual.
        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
 
        // Verifica o fator de balanceamento.
        int balance = getFactor(root);
 
        // Caso esquerda-esquerda.
        if (balance > 1 && getFactor(root.getLeft()) >= 0) {
            return doRightRotation(root);
        }
 
        //Esquerda-direita.
        if (balance > 1 && getFactor(root.getLeft()) < 0) {
            root.setLeft(doLeftRotation(root.getLeft()));
            return doRightRotation(root);
        }
 
        //Direita-direita.
        if (balance < -1 && getFactor(root.getRight()) <= 0) {
            return doLeftRotation(root);
        }
 
        // Direita-esquerda.
        if (balance < -1 && getFactor(root.getRight()) > 0) {
            root.setRight(doRightRotation(root.getRight()));
            return doLeftRotation(root);
        }
 
        return root;
    }
	
   private AvlLink lowerValue(AvlLink link) {
	   AvlLink current = link;

       //Loop para achar a folha "mais baixa".
       while (current.getLeft() != null) {
           current = current.getLeft();
       }

       return current;
   }
}
