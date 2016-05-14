
package br.com.novaroma.easycon.controller;

public class ControllerAdm {
    
    public boolean verifySingIn(String login, String password) {

        boolean permition = false;

        if (login.equals("123") && password.equals("123")) {
            permition = true;
        }

        return permition;
    }
}
