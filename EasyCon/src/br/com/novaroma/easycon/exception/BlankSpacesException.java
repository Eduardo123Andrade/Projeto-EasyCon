
package br.com.novaroma.easycon.exception;

public class BlankSpacesException extends Throwable{

    @Override
    public String toString() {
        return "Todos os campos devem ser preenchidos.";
    }
    
    
}
