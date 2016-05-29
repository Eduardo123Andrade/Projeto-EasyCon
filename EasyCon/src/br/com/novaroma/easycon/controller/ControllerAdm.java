
package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.*;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.*;
import java.util.Calendar;
import java.util.Random;

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
        Resident tempResident = (Resident)dao.search(id, Structures.getTree());
        
        if (tempResident != null && tempResident.getPassword().equals(password)) {
            permition = true;
            Resident.setCurrentResident(tempResident);
        }
        
        return permition;
}
    
    public void registerResident(String block, String building, String number,String gender, String login, String password, String phoneNumber, String name, String lastName, String age, String cpf) { //OK
        
        Address address = new Address(block, building, number);
        Resident resident = new Resident(address, gender, login, password, phoneNumber, name, lastName, age, cpf, false);
        
        dao.insert(resident, Structures.getTree());
    }
    
    public void removeResident(String id) { //OK
        dao.remove(id, Structures.getTree());
    }
    
   public void sendMessage(String cpf, String title, String text) { //INACABADO *PEGAR DATA E TESTAR*
      
       Resident tempResident = (Resident)dao.search(cpf, Structures.getTree());
       Message message = new Message(tempResident, date, generateCodeOnList(Structures.getList()), title, text);
       
       dao.insert(message, Structures.getList());
   }
    
    private int generateCodeOnList(LinkedList list) {
        
        Random random = new Random();

        int codeRandom;
        boolean boo = true;

        do {
            codeRandom = random.nextInt(99999) + 1;
            boo = verifyCodeOnList(codeRandom, list);
        } while (boo);

        return codeRandom;
    }
    
    private boolean verifyCodeOnList(int codeRandom, LinkedList list) {
        return list.contains(String.valueOf(codeRandom));
    }
    
}
