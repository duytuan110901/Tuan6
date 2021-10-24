public class tuoitho {
    private namsinh namsinh;
    private namsinh nammat;

    public tuoitho() {};

    public tuoitho(namsinh namsinh, namsinh nammat) {
        this.namsinh = namsinh;
        this.nammat = nammat;
    }

    public int tinhtoan() {
        if (namsinh.getNam() <= nammat.getNam()) {
            if (namsinh.getThang() < nammat.getThang()) {
                return nammat.getNam() - namsinh.getNam();
            } else if (namsinh.getThang() == nammat.getThang()) {
                if (namsinh.getNgay() >= nammat.getNgay()) {
                    return nammat.getNam() - namsinh.getNam();
                }
            } else {
                return nammat.getNam() - namsinh.getNam() - 1;
            }
            return nammat.getNam() - namsinh.getNam() - 1;
        }
        return nammat.getNam() - namsinh.getNam();
    }

    public String tinh_tuoi_tho() {
        String kq = "";
        if (!namsinh.ngayhople()) {
            kq += "Ngày sinh không hợp lệ" + "\n";
        } else {
            kq += "Ngày sinh hợp lệ" + "\n";
        }
        if (!nammat.ngayhople()) {
            kq += "Ngày mất không hợp lệ" + "\n";
        } else {
            kq += "Ngày mất hợp lệ" + "\n";
        }
        if (!namsinh.ngayhople() || !nammat.ngayhople()) {
            kq += "Không thể tính tuổi thọ";
        } else {
            kq += "Thọ:" + tinhtoan() +" tuổi";
        }
        return kq;
    }

}
