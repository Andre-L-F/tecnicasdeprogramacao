package models;

public class Model {

    private double x;
    private double y;
    private double result;
    private String operator;

    public Model() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double addOperator(double x, double y) {
        return this.result = x + y;
    }

    public double splitOperator(double x, double y) {
        return this.result = x / y;
    }

    public double multOperator(double x, double y) {
        return this.result = x * y;
    }

    public double subOperator(double x, double y) {
        return this.result = x - y;
    }

    public double sqrt(double x) {
        return result = Math.sqrt(x);
    }

    public double exp(double x) {
        return result = Math.pow(x, 2);
    }

    public double percentage(double x){
        return result = x/100;
    }
    
}
