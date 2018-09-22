package week2.task3;

import week2.task1.Task1;
import week2.task2.Fraction;

public class Task3 {
    public static void main(String[] args){
        System.out.println(Task1.gcd(10,18));
        System.out.println(Task1.fibonacci(10));
        Fraction Ps = new Fraction(3,4);
        Fraction Ps2 = new Fraction(5,7);
        Fraction Ps3 = Ps.add(Ps2);
        Ps3.print();
        Ps3 = Ps.subtract(Ps2);
        Ps3.print();
        Ps3 = Ps.divide(Ps2);
        Ps3.print();
        Ps3 = Ps.multiply(Ps2);
        Ps3.print();

    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
