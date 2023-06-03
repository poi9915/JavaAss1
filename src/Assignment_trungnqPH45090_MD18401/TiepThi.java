package Assignment_trungnqPH45090_MD18401;

public class TiepThi extends nhanVien{
    protected double doanhSo;
    protected double hoaHong;

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    public void setHoaHong(double hoaHong){
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public double getThunhap(){
        return super.luong + this.doanhSo + this.hoaHong;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Doanh so :" + this.doanhSo);
        System.out.println("Luong hoa hong:" + this.hoaHong);
    }
}
