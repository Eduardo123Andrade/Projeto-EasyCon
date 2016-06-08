package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.*;
import java.util.Date;

public class ControllerAdm { //COLOCAR TODAS AS EXCECOES DEPOIS!

    private IDao dao = Factory.getDao();

    public boolean verifySingInAdm(String login, String password) { //OK

        /* boolean permition = false;

        if (login.equals("123") && password.equals("123")) {
            permition = true;
        }*/
        return true;
    }

    public boolean verifySingInResident(String id, String password) { //OK

        boolean permition = false;
        Resident tempResident = (Resident) dao.search(id, Structures.getTree());

        if (tempResident != null && tempResident.getPassword().equals(password)) {
            permition = true;
            Resident.setCurrentResident(tempResident);
        }

        return permition;
    }

    public void registerResident(String block, String building, String number, String gender, String login, String password, String phoneNumber, String name, String lastName, String age, String cpf) { //OK

        Address address = new Address(block, building, number);
        Resident resident = new Resident(address, gender, login, password, phoneNumber, name, lastName, age, cpf, false);

        dao.insert(resident, Structures.getTree());
    }

    public void removeResident(String id) { //OK
        dao.remove(id, Structures.getTree());
    }

    public void sendMessage(String cpf, String title, String text) { //TRAVANDO

        Resident tempResident = (Resident) dao.search(cpf, Structures.getTree());
        Message message = new Message(Maneger.getCurrentManeger(), tempResident, new Date(), Structures.generateCodeOnStack(), title, text);

        dao.insert(message, Structures.getStack());
    }

    public void sendMessageToAll(AvlLink temp, String title, String text) { //TESTAR

        int code = Structures.generateCodeOnStack(); //CONSERTAR PRA TER APENAS UM CODIGO

        if (temp != null) {
            sendMessageToAll(temp.getLeft(), title, text);

            Resident tempResident = (Resident) temp.getEntity();
            Message message = new Message(Maneger.getCurrentManeger(), tempResident, new Date(), code, title, text);
            dao.insert(message, Structures.getStack());

            sendMessageToAll(temp.getRight(), title, text);
        }
    }

    public void registerSurvey(String question,String[] alternatives) {

        Survey survey = new Survey(question, Structures.generateCodeOnList(), alternatives);
        dao.insert(survey, Structures.getList());
    }
    
    public Entity returnEntityTree(String id, AvlTree tree) {
        return dao.search(id, tree);
    }
    
    public Entity returnEntityStack(String id, Stack stack) {
        return dao.search(id, stack);
    }
    
    public Entity returnEntityList(String id, LinkedList list) {
        return dao.search(id, list);
    }
    
    public Entity returnEntityHash(String id, Hash hash, int index) {
        return dao.search(id, hash, index);
    }
}
