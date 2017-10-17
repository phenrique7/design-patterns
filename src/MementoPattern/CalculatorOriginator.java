package MementoPattern;

import javax.script.*;

public class CalculatorOriginator{
    private String expression;
    private CalculatorCareTaker careTaker;

    public CalculatorOriginator(){
        careTaker = new CalculatorCareTaker();
        expression = "";
    }

    public void addExpression(String expression){
        String[] mementos = splitExpression(expression);
        for(String memento : mementos){
            this.expression += memento;
            if(!this.expression.equals(expression)){
                careTaker.addMemento(new CalculatorMemento(this.expression));
            }
        }
    }

    public void undoOperation(){
        expression = careTaker.getLastMemento().getState();
    }

    public void showExpression(){
        System.out.println("Expression: " + expression);
    }

    public void calculate(){
        try{
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            System.out.println("Result: " + engine.eval(expression));
        }
        catch(ScriptException e) {
            System.out.println("Error: invalid operation!");
            System.out.println(e.getMessage());
        }
    }

    private String[] splitExpression(String expression){
        String expressionNoBlankSpaces = expression.replaceAll("\\s", "");
        String[] result = expressionNoBlankSpaces.split("(?<=[-+*/])|(?=[-+*/])");
        return result;
    }
}
