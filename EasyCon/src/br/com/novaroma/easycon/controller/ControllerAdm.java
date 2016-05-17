
package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.*;
import java.util.Calendar;
import java.util.Random;

public class ControllerAdm { //COLOCAR TODAS AS EXCECOES DEPOIS!
    
    private IDao dao = Factory.getDao();
    
    public boolean verifySingIn(String login, String password) {

        boolean permition = false;

        if (login.equals("123") && password.equals("123")) {
            permition = true;
        }

        return permition;
    }
    
    public void registerResident(AvlTree tree, String block, String building, String number,String gender, String login, String password, String phoneNumber, String name, String lastName, String age, String cpf) {
        
        Address address = new Address(block, building, number);
        Resident resident = new Resident(address, gender, login, password, phoneNumber, name, lastName, age, cpf, false);
        
        dao.insert(resident, tree);
    }
    
    public void removeResident(String id, AvlTree tree) {
        dao.remove(id, tree);
    }
    
    public void insertSurvey(String question, LinkedList list) {
        
        Survey survey = new Survey(question, generateCodeOnList(list));
        dao.insert(survey, list);
    }
    
    public void insertMessage(Person sender, Calendar date, String text, LinkedList list) { //MUDAR: PEGAR DATE DENTRO DO METODO!
       
        Message message = new Message(sender, date, generateCodeOnList(list), text);
        dao.insert(message, list);
    }
    
    public String listResidents(AvlTree tree) { //ADICIONAR: METODO DE ORDENACAO PARA ALFABETICA
        return tree.inorder();
    }
    
    public String listMessages(LinkedList list) {
        return list.showReverseList();
    }
    
    public int generateCodeOnList(LinkedList list) {
        
        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnList(codeRandom, list);
        } while (boo);

        return codeRandom;
    }
    
    public boolean verifyCodeOnList(int codeRandom, LinkedList list) {
        return list.contains(String.valueOf(codeRandom));
    }
    
}
