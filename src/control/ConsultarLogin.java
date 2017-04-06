/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import view.Menu;
import model.Funcionario;
/**
 *
 * @author csouza
 */
public class ConsultarLogin {
    public boolean logar(String usr, String pwd){
        boolean resultado = true;
        Funcionario func = new Funcionario();
        Menu men = new Menu();
        if(usr.equalsIgnoreCase("clem") && pwd.equals("123")){
            func.setNome("Clemilton");
            resultado = true;
            men.nomeFuncionario(func);
            men.setVisible(true);
        }else{
            resultado = false;
        }        
        return resultado;
    }
}
