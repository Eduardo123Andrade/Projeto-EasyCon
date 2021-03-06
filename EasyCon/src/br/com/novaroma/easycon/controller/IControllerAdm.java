package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.exception.BlankSpacesException;
import br.com.novaroma.easycon.exception.InvalidUserExveption;
import br.com.novaroma.easycon.structures.AvlLink;
import br.com.novaroma.easycon.structures.AvlTree;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.LinkedList;
import br.com.novaroma.easycon.structures.Stack;

public interface IControllerAdm {

    boolean verifySingInAdm(String login, String password) throws BlankSpacesException, InvalidUserExveption;

    boolean verifySingInResident(String id, String password) throws BlankSpacesException, InvalidUserExveption;

    void registerResident(String block, String building, String number, String gender, String login, String password, String phoneNumber, String name,
            String lastName, String age, String cpf);
    
    void removeResident(String id);
    
    void sendMessage(String cpf, String title, String text);
    
    void sendMessageToAll(AvlLink temp, String title, String text);
    
    void registerSurvey(String question,String[] alternatives);
    
    void createReceipt(Resident resident, String description, double value);
    
    Entity returnEntityTree(String id, AvlTree tree);
    
    Entity returnEntityStack(String id, Stack stack);
    
    Entity returnEntityList(String id, LinkedList list);
    
    Entity returnEntityHash(String id, Hash hash);  
}
