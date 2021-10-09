/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interactor;

/**
 *
 * @author Samreen
 */
public class TerminalExpression implements Expression {
String data;
  
    public TerminalExpression(String data)
    {
        this.data = data; 
    }
  
    @Override
    public boolean interpreter(String con) {
        if(con.contains(data))
        {
            return true;
        }
        else
        {
            return false;  
        }
    }
    
}
