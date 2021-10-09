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
public class AndExpression implements Expression{
Expression expr1;
    Expression expr2;
  
    public AndExpression(Expression expr1, Expression expr2) 
    { 
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    @Override
    public boolean interpreter(String con) {
        return expr1.interpreter(con) && expr2.interpreter(con);
    }
    
}
