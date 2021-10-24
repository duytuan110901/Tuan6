public class namsinh {
    private String ten;
    private int ngay;
    private int thang;
    private int nam;

    public namsinh() {
    }

    public namsinh(String ten, int ngay, int thang, int nam) {
        this.ten = ten;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String getTen() {
        return ten;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public boolean check_ngay() {
        if (ngay > 31 || ngay < 1) {
            return false;
        }
        return true;
    }

    public boolean check_thang() {
        if (thang > 12 || thang < 1) {
            return false;
        }
        return true;
    }

    public boolean check_nam() {
        if (nam > 2021 || nam < 0) {
            return false;
        }
        return true;
    }

    public boolean check_namnhuan() {
        if (nam % 400 == 0) {
            return true;
        }
        if (nam % 4 == 0 && nam % 100 != 0) {
            return true;
        }
        return false;
    }

    public boolean ngayhople() {
        if (!check_ngay() || !check_thang() || !check_nam()) {
            return false;
        }
        if (ngay < 29) {
            return true;
        }
        if (ngay == 29) {
            if (thang == 2 && !check_namnhuan()) {
                return false;
            }
            return true;
        }
        if (ngay == 30 && thang != 2) {
            return true;
        }
        if (ngay == 31 && thang != 2 && thang != 4 && thang != 6 && thang != 9 && thang != 11) {
            return true;
        }
        return false;
    }
}
