package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Captcha {
    private Operand leftOperand;
    private Operand rightOperand;
    private Operator operator;

    public Captcha(int pattern,int leftOperand,int operator,int rightOperand){
        this.leftOperand = Operand.createLeft(pattern, leftOperand);
        this.rightOperand = Operand.createRight(pattern, rightOperand);
        this.operator = new Operator(operator);
    }


    public Operand getLeft() {
        return leftOperand;
    }

    public Operand getRight() {
        return rightOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return this.leftOperand.toString() + " " + this.operator.toString() + " " + this.rightOperand.toString();
    }
}
