package week2.task2;

import java.sql.SQLOutput;

public class Fraction {

    public int tuSo;
    public int mauSo;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số).
        tuSo = numerator;
        mauSo = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        return new Fraction(other.tuSo*this.mauSo+this.tuSo*other.mauSo,other.mauSo*this.mauSo);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.tuSo*other.mauSo-other.tuSo*this.mauSo,other.mauSo*this.mauSo);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.tuSo*other.tuSo,this.mauSo*other.mauSo);
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.tuSo*other.mauSo,this.mauSo*other.tuSo);
    }
    public void print(){
        System.out.println(tuSo + "/" + mauSo);
    }
}
