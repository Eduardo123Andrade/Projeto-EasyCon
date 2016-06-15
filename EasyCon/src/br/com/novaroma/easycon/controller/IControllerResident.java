
package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.entities.Survey;
import br.com.novaroma.easycon.exception.BlankSpacesException;
import br.com.novaroma.easycon.structures.AvlTree;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.LinkedList;
import br.com.novaroma.easycon.structures.Stack;

public interface IControllerResident {
    
    void sendMessage(String title, String text, Resident currentResident) throws BlankSpacesException;
    
    void makeComplaint(String category, String title, String text);
    
    void registerVote(int alternative, Survey survey);
    
    boolean verifyVote(Survey survey, LinkedList list);
    
    Entity returnEntityTree(String id, AvlTree tree);
    
    Entity returnEntityStack(String id, Stack stack);
    
    Entity returnEntityList(String id, LinkedList list);
    
    Entity returnEntityHash(String id, Hash hash);
}
