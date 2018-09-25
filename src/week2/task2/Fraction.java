package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int tu;
    int mau;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.tu=numerator;
        this.mau=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.tu * other.mau + other.tu * this.mau;
        int ms = this.mau * other.mau;
        Fraction phanSoTong = new Fraction(ts, ms);
        return Fraction(ts, ms);
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }
}
