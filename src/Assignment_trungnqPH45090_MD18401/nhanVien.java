package Assignment_trungnqPH45090_MD18401;

public class nhanVien {
    protected String MaNV;
    protected String HoTen;
    protected double luong;
    public double getThuNhap(){
        return this.luong;
    }

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, double luong) {
        MaNV = maNV;
        HoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThueNT(){
        if (this.getThuNhap() <9){
            return 0;
        }else if(this.getThuNhap() < 15){
            return this.getThuNhap() *0.1;
        }else{
            return this.getThuNhap() *0.12;
        }
    }

    public void inThongTin(){
        if (this.getClass().getSimpleName().equals("nhanVien")) {
            System.out.println("NV hanh chinh.");
        } else if (this.getClass().getSimpleName().equals("TruongPhong")) {
            System.out.println("Truong Phong.");
        } else if (this.getClass().getSimpleName().equals("TiepThi")) {
            System.out.println("NV Tiep Thi.");
        }
        System.out.println("Ten nhan vien:" + this.HoTen);
        System.out.println("Ma NV:" + this.MaNV);
        System.out.println("Luong hanh chinh:" + this.luong);
    }
}
