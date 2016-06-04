
package br.com.novaroma.easycon.controller;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.Maneger;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.entities.Message;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.Structures;
import java.util.Date;

public class ControllerResident {
    
    private IDao dao = Factory.getDao();
    
    public void sendMessage(String title, String text, Resident currentResident) {
        
        Message message = new Message(currentResident, Maneger.getCurrentManeger(), new Date(), Structures.generateCodeOnStack(), title, text);
        dao.insert(message, Structures.getStack());
    }
}
