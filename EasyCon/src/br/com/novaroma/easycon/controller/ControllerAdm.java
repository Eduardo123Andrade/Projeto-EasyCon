package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.exception.BlankSpacesException;
import br.com.novaroma.easycon.exception.InvalidUserExveption;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.*;
import java.util.Date;

public class ControllerAdm implements IControllerAdm{ 

    private IDao dao = Factory.getDao();

    @Override
    public boolean verifySingInAdm(String login, String password) throws BlankSpacesException, InvalidUserExveption{ 

        if (login.equals("") || password.equals("")) {
            throw new BlankSpacesException();
        }
        /* boolean permition = false;

        if (login.equals("123") && password.equals("123")) {
            permition = true;
        } else {
            throw new InvalidUserExveption();
        }
        */
        return true;
    }

    @Override
    public boolean verifySingInResident(String id, String password) throws BlankSpacesException, InvalidUserExveption{ 

        if (id.equals("") || password.equals("")) {
            throw new BlankSpacesException();
        }
        
        boolean permition = false;
        Resident tempResident = (Resident) dao.search(id, Structures.getTree());

        if (tempResident != null && tempResident.getPassword().equals(password)) {
            permition = true;
            Resident.setCurrentResident(tempResident);
        } else {
            throw new InvalidUserExveption();
        }

        return permition;
    }

  
    @Override
    public void registerResident(String block, String building, String number, String gender, String login, String password, String phoneNumber, String name, String lastName, String age, String cpf) { 

        Address address = new Address(block, building, number);
        Resident resident = new Resident(address, gender, login, password, phoneNumber, name, lastName, age, cpf, false);

        dao.insert(resident, Structures.getTree());
        createReceipt(resident, "Mensalidade do condominio", 880.0);
    }

    @Override
    public void removeResident(String id) {
        dao.remove(id, Structures.getTree());
    }

    @Override
    public void sendMessage(String cpf, String title, String text) {

        Resident tempResident = (Resident) dao.search(cpf, Structures.getTree());
        Message message = new Message(Maneger.getCurrentManeger(), tempResident, new Date(), Structures.generateCodeOnStack(Structures.getStack()), title, text);

        dao.insert(message, Structures.getStack());
    }

    @Override
    public void sendMessageToAll(AvlLink temp, String title, String text) { 

        int code = Structures.generateCodeOnStack(Structures.getStack()); 

        if (temp != null) {
            sendMessageToAll(temp.getLeft(), title, text);

            Resident tempResident = (Resident) temp.getEntity();
            Message message = new Message(Maneger.getCurrentManeger(), tempResident, new Date(), code, title, text);
            dao.insert(message, Structures.getStack());

            sendMessageToAll(temp.getRight(), title, text);
        }
    }


    @Override
    public void registerSurvey(String question,String[] alternatives) {
        Survey survey = new Survey(question, Structures.generateCodeOnList(Structures.getList()), alternatives);
        dao.insert(survey, Structures.getList());
    }
    
    @Override
    public void createReceipt(Resident resident, String description, double value) {
        Receipt receipt = new Receipt(Structures.generateCodeOnHash(Structures.getHashReceipt()), resident, description, value);
        dao.insert(receipt, Structures.getHashReceipt());
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
