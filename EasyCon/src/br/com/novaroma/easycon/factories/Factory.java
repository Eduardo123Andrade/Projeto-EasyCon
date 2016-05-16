
package br.com.novaroma.easycon.factories;

import br.com.novaroma.easycon.dao.Dao;
import br.com.novaroma.easycon.dao.IDao;

public class Factory {
    
    public static IDao getDao() {
        return new Dao();
    }
}
