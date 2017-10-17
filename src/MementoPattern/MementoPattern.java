package MementoPattern;

public class MementoPattern{

    public static void main(String[] args){
        CalculatorOriginator calculator = new CalculatorOriginator();

        calculator.addExpression("( 20 + 2 - 5  - 2) * 2");

        calculator.showExpression();
        calculator.undoOperation();
        calculator.showExpression();
        calculator.undoOperation();
        calculator.showExpression();
        calculator.calculate();
    }

}
