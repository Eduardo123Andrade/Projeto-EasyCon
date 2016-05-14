/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Maneger;
import br.com.novaroma.easycon.entities.Resident;

/**
 *
 * @author Felipe
 */
public class TestTree {
    
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
        
        System.out.println(tree.getRootNode().getEntity().getId());
        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
     
    }
}
