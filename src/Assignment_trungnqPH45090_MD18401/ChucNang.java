package Assignment_trungnqPH45090_MD18401;

import java.util.*;

public class ChucNang {
    public static Scanner input = new Scanner(System.in);

    public void NhapDanhSachNV(ArrayList<nhanVien> ListNV) {
        int userChoose;
        String MaNV;
        String name;
        double luong;
        double doanhSo;
        double hoaHong;
        double trachNghiem;
        while (true) {
            System.out.println("1.Nhap danh sach nhan vien tu ban phim");
            System.out.println("+---------------------------------------+");
            System.out.println("Chon loai nhan vien muon thêm");
            System.out.println("1.NV");
            System.out.println("2.NV tiep thi");
            System.out.println("3.Truong Phong");
            System.out.println("+-----------Moi ban chon----------------+");
            userChoose = input.nextInt();
            switch (userChoose) {

                case 1:
                    System.out.println("+----Nhap Nhan vien hanh chinh----+");
                    input.nextLine();
                    System.out.println("Ma NV:");
                    MaNV = input.nextLine();
                    System.out.println("Nhap ten NV:");
                    name = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    nhanVien nv = new nhanVien(MaNV, name, luong);
                    ListNV.add(nv);
                    break;
                case 2:
                    System.out.println("+----Nhap nhan vien tiep thi----+");
                    input.nextLine();
                    System.out.println("Ma NV:");
                    MaNV = input.nextLine();
                    System.out.println("Nhap ten NV:");
                    name = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    System.out.println("Nhap doanh So :");
                    doanhSo = input.nextDouble();
                    System.out.println("Nhap hoa hong:");
                    hoaHong = input.nextDouble();
                    TiepThi nvTiepThi = new TiepThi(MaNV, name, luong, doanhSo, hoaHong);
                    ListNV.add(nvTiepThi);
                    break;
                case 3:
                    System.out.println("+----Nhap Truong phong ----+");
                    input.nextLine();
                    System.out.println("Ma NV:");
                    MaNV = input.nextLine();
                    System.out.println("Nhap ten NV:");
                    name = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    System.out.println("Nhap Trach nghiem");
                    trachNghiem = input.nextDouble();
                    TruongPhong tp = new TruongPhong(MaNV, name, luong, trachNghiem);
                    ListNV.add(tp);
                    break;
                default:
                    System.out.println("Vui long chọn 1,2 hoặc 3!!!!");
                    break;
            }
            input.nextLine();
            System.out.println("Ban co muon tiep tuc (Y/N)");
            String exitLoop = input.nextLine();
            if (exitLoop.equals("N")) {
                break;
            }
        }
        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void XuatDanhSachNV(ArrayList<nhanVien> ListNV) {
        System.out.println("2.Xuat danh sach nhan vien tu ban phim");

        for (int i = 0; i < ListNV.size(); i++) {
            System.out.println("+-------------------------------------+");
            System.out.println("Nhan vien so :" + (i + 1));
            ListNV.get(i).inThongTin();
            System.out.println("+-------------------------------------+");
        }
        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void TimVaHienThiTheoMaNV(ArrayList<nhanVien> ListNV) {
        System.out.println("3.Tim va hien thi nhan vien theo ma nhap tu ban phim");
        boolean check = true;
        System.out.println("Nhap ma nv muon tim :");
        String maTk = input.nextLine();
        System.out.println("+-------------------------------------+");
        for (nhanVien listFind :
                ListNV) {
            if (listFind.getMaNV().compareToIgnoreCase(maTk) == 0) {
                listFind.inThongTin();
                check = false;
            }
        }
        if (check) {
            System.out.println("Ko tim thay nhan vien !!!!");
        }
        System.out.println("+-------------------------------------+");
        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void XoaNVTheoMa(ArrayList<nhanVien> ListNV) {
        System.out.println("4.Xoa nhan vien theo mã nhập tu ban phim");
        boolean check = true;
        System.out.println("Nhap ma nv muon tim :");
        String maXoa = input.nextLine();
        System.out.println("+-------------------------------------+");
        for (int i = 0; i < ListNV.size(); i++) {
            if (ListNV.get(i).getMaNV().compareToIgnoreCase(maXoa) == 0) {
                ListNV.remove(i);
                check = false;
                System.out.println("Da xoa nhan vien ma :" + maXoa);
            }
        }
        if (check) {
            System.out.println("Ko tim thay nhan vien !!!!");
        }
        System.out.println("+-------------------------------------+");


        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void CapNhatThongTinNVTheoMa(ArrayList<nhanVien> ListNV) {
        System.out.println("5.Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
        System.out.println("+-------------------------------+");
        System.out.println("Nhap Ma Tim Kiem ");
        String maCn = input.nextLine();
        boolean check = true;
        for (int i = 0; i < ListNV.size(); i++) {
            if (ListNV.get(i).getMaNV().compareToIgnoreCase(maCn) == 0){
                check = false;
                String name;
                String maNV;
                double luong;

                System.out.println("Cap nhat thong tin ");
                System.out.println("+-------------------------------+");
                if (ListNV.get(i) instanceof TiepThi){
                    input.nextLine();
                    System.out.println("Nhap ten :");
                    name =input.nextLine();
                    System.out.println("Nhap MaNV:");
                    maNV = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    System.out.println("Nhap hoa hong:");
                    double hoaHong = input.nextDouble();
                    System.out.println("Nhap doanh so:");
                    double doanhSo = input.nextDouble();
                    TiepThi nvtt = new TiepThi(maNV,name,luong,doanhSo,hoaHong);
                    ListNV.set(i,nvtt);
                }
                else if (ListNV.get(i) instanceof TruongPhong){
                    input.nextLine();
                    System.out.println("Nhap ten :");
                    name =input.nextLine();
                    System.out.println("Nhap MaNV:");
                    maNV = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    System.out.println("Nhap trach Nghiem");
                    double trachNghiem = input.nextDouble();
                    TruongPhong nvTp = new TruongPhong(maNV,name,luong,trachNghiem);
                    ListNV.set(i , nvTp);

                }
                else {
                    input.nextLine();
                    System.out.println("Nhap ten :");
                    name =input.nextLine();
                    System.out.println("Nhap MaNV:");
                    maNV = input.nextLine();
                    System.out.println("Nhap luong:");
                    luong = input.nextDouble();
                    nhanVien nv = new nhanVien(maNV , name , luong);
                    ListNV.set(i , nv);
                }
            }
        }
        if (check){
            System.out.println("+-------------------------------+");
            System.out.println("Ko tim thấy NV");
            System.out.println("+-------------------------------+");
        }
        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void TimCacNhanVienTheoLuong(ArrayList<nhanVien> ListNV) {
        System.out.println("6.Tim cac nhan vien theo khoang luong nhap tu ban phim");
        System.out.println("Nhap khoang lương muon tim ");
        System.out.println("Tu:");
        double luongTu = input.nextDouble();
        System.out.println("Den:");
        double luongDen = input.nextDouble();
        boolean check = true;
        for (nhanVien nhaVien:
             ListNV) {
            if (nhaVien.getThuNhap() > luongTu && luongDen  > nhaVien.getThuNhap()){
                System.out.println("+-------------------------------------+");
                nhaVien.inThongTin();
                System.out.println("+-------------------------------------+");
                check = false;
            }
        }
        if (check){
            System.out.println("Ko tim thay nhan vien!!!");
        }
        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }
    //TODO : Làm xong trước T2/5/6/2023
    public void SapXepNVTheoHoTen(ArrayList<nhanVien> ListNV) {
        System.out.println("7.Sap xep nhan vien theo ho va ten");
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };

        Collections.sort(ListNV , comp);
        for (nhanVien nv:
             ListNV) {
            System.out.println("+-------------------------------------+");
            nv.inThongTin();
            System.out.println("+-------------------------------------+");
        }

        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void SapXepNVTheoLuong(ArrayList<nhanVien> ListNV) {
        System.out.println("8.Sap xep nhan vien theo thu nhap");
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                return Double.compare(o1.getLuong() ,o2.getLuong());
            }
        };
        Collections.sort(ListNV,comp);

        for (nhanVien nv:
                ListNV) {
            System.out.println("+-------------------------------------+");
            nv.inThongTin();
            System.out.println("+-------------------------------------+");
        }

        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }

    public void Top5NVThuNhaoCao(ArrayList<nhanVien> ListNV) {
        System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                return (int) (o1.getThuNhap() - o2.getThuNhap());
            }
        };

        Collections.sort(ListNV , comp);


            for (int i = 0; i < 5; i++) {
                try {

                    System.out.println("+-------------------------------------+");
                    System.out.println("Nhan Vien so : " + i);
                    ListNV.get(i).inThongTin();
                    System.out.println("+-------------------------------------+");
                }catch (Exception e){
                    System.out.println("het danh sach !!!!");
                    System.out.println("+-------------------------------------+");
                    break;
                }
            }

        System.out.println("An de tiep tuc !!!!");
        input.nextLine();
    }
}
