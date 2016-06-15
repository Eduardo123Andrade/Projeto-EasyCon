
package br.com.novaroma.easycon.exception;

public class InvalidUserExveption extends Throwable{

    @Override
    public String toString() {
        return "Senha e/ou Login inválidos.";
    }   
}
