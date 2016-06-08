
package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.Maneger;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.entities.Message;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.entities.Complaint;
import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.structures.AvlTree;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.LinkedList;
import br.com.novaroma.easycon.structures.Stack;
import br.com.novaroma.easycon.structures.Structures;
import java.util.Date;

public class ControllerResident implements IControllerResident{
    
    private IDao dao = Factory.getDao();
    
    @Override
    public void sendMessage(String title, String text, Resident currentResident) {
        Message message = new Message(currentResident, Maneger.getCurrentManeger(), new Date(), Structures.generateCodeOnStack(), title, text);
        dao.insert(message, Structures.getStack());
    }
    
    @Override
    public void answerSurvey() {
        
    }
    
    @Override
    public void makeComplaint(String category, String title, String text, int index) {
        
        Complaint complaint = new Complaint(Structures.generateCodeOnHash(), category, title, text, Resident.getCurrentResident());
        dao.insert(complaint, Structures.getHash(), index);
    }
    
    @Override
    public Entity returnEntityTree(String id, AvlTree tree) {
        return dao.search(id, tree);
    }
    
    @Override
    public Entity returnEntityStack(String id, Stack stack) {
        return dao.search(id, stack);
    }
    
    @Override
    public Entity returnEntityList(String id, LinkedList list) {
        return dao.search(id, list);
    }
    
    @Override
    public Entity returnEntityHash(String id, Hash hash, int index) {
        return dao.search(id, hash, index);
    }
}
