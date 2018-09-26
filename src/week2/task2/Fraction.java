package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int tu;
    int mau;
    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b==0) return a;
        return gcd(b;a%b);
        
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.tu=numerator;
        this.mau=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.tu * other.mau + other.tu * this.mau;
        int ms = this.mau * other.mau;
        int u = gcd(ts, ms);
        ts = ts/u;
        ms = mau/u;
        Fraction phanSoTong = new Fraction(ts, ms);
        return phanSoTong;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.tu * other.mau - other.tu * this.mau;
        int ms = this.mau * other.mau;
        int u = gcd(ts, ms);
        ts = ts/u;
        ms = mau/u;
        Fraction phanSoHieu = new Fraction(ts, ms);
        return phanSoHieu;
        
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.tu * other.tu;
        int ms = this.mau * other.mau;
        int u = gcd(ts, ms);
        ts = ts/u;
        ms = mau/u;
        Fraction phanSoTich = new Fraction(ts, ms);
        return phanSoTich;
        
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.tu * other.mau;
        int ms = this.mau * other.tu;
        int u = gcd(ts, ms);
        ts = ts/u;
        ms = mau/u;
        Fraction phanSoThuong = new Fraction(ts, ms);
        return phanSoThuong;
        
    }
    public boolean equals(Object object){
        if (object instanceof Fraction){
            Fraction other = (Fraction) object;
            if (other.mau*this.tu == other.tu*this.mau)
                return true;
            else return false;
        }
        return false;
    }
}
