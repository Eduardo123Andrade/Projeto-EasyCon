
package br.com.novaroma.easycon.exception;

public class DontExistException extends Throwable {

    @Override
    public String toString() {
        return "não existente no sistema";
    }
}
