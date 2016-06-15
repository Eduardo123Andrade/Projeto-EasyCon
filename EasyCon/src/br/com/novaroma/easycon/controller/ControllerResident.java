package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.Maneger;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.entities.Message;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.entities.Complaint;
import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Survey;
import br.com.novaroma.easycon.entities.Vote;
import br.com.novaroma.easycon.exception.BlankSpacesException;
import br.com.novaroma.easycon.structures.AvlTree;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.LinkedList;
import br.com.novaroma.easycon.structures.Stack;
import br.com.novaroma.easycon.structures.Structures;
import java.util.Date;

public class ControllerResident implements IControllerResident {
    
    private IDao dao = Factory.getDao();
    
    @Override //AJEITAR
    public void sendMessage(String title, String text, Resident currentResident) throws BlankSpacesException{
        
        if (title.equals("") || text.equals("")) {
            throw new BlankSpacesException();
        }
        Message message = new Message(currentResident, Maneger.getCurrentManeger(), new Date(), Structures.generateCodeOnStack(Structures.getStack()), title, text);
        dao.insert(message, Structures.getStack());
    }
    
    @Override
    public void makeComplaint(String category, String title, String text) {
        
        Complaint complaint = new Complaint(Structures.generateCodeOnHash(Structures.getHash()), category, title, text, Resident.getCurrentResident());
        dao.insert(complaint, Structures.getHash());
    }
    
    @Override
    public void registerVote(int alternative, Survey survey) {
        Vote vote = new Vote(survey, Resident.getCurrentResident(), alternative);
        dao.insert(vote, Structures.getListVotes());
    }
    
    @Override
    public boolean verifyVote(Survey survey, LinkedList list) {
        boolean permition = true;
        Link temp = list.getFirst();
        
        while (temp != null) {
            
            Vote voteX = (Vote)temp.getEntity();
            int code = Integer.parseInt(temp.getEntity().getId()) / 10;
            String sCode = String.valueOf(code);
            
            if (survey.getId().equals(sCode) && voteX.getResident().equals(Resident.getCurrentResident())) {
                permition = false;
            }
            
            temp = temp.getNext();
        }
        
        return permition;
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
    public Entity returnEntityHash(String id, Hash hash) {
        return dao.search(id, hash);
    }
}
