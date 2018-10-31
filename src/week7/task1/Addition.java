package week7.task1;

public class Addition extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return this.left.toString() + " + " + this.right.toString();
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }

}
12121212