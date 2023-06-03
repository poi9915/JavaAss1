package Assignment_trungnqPH45090_MD18401;

public class TruongPhong extends nhanVien {
    protected double trachNghiem;

    public TruongPhong(String maNV, String hoTen, double luong, double trachNghiem) {
        super(maNV, hoTen, luong);
        this.trachNghiem = trachNghiem;
    }

    public double getTrachNghiem() {
        return trachNghiem;
    }

    public void setTrachNghiem(double trachNghiem) {
        this.trachNghiem = trachNghiem;
    }

    public double getThuNhap(){
        return super.luong + trachNghiem;
    }
    public void inThongTin(){

        super.inThongTin();
        System.out.println("Luong Trach nghiem :" + this.trachNghiem);
    }
}
