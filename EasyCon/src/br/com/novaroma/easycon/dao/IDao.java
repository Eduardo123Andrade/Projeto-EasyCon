
package br.com.novaroma.easycon.dao;

import br.com.novaroma.easycon.entities.Entity;

public interface IDao <T extends Entity>{
    
    void insert(T entity);
    void remove(String id);
    void update(T entity);
    T search(String id);
}
