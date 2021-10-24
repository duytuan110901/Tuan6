import org.junit.Assert;
import org.junit.Test;

public class test_tuoi_tho {

    @Test
    public void test_tuoi_tho1() {
        namsinh namsinh = new namsinh("A B C", 12, 5, -1);
        namsinh nammat = new namsinh("A B C", 25, 9, 2022);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh không hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }

    @Test
    public void test_tuoi_tho2() {
        namsinh namsinh = new namsinh("A C D", 24, 4, 1921);
        namsinh nammat = new namsinh("A C D", 28, 3, 1996);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:74 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho3() {
        namsinh namsinh = new namsinh("X Y Z", 13, 4, 1971);
        namsinh nammat = new namsinh("X Y Z", 12, 11, 2020);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:49 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho4() {
        namsinh namsinh = new namsinh("X Y T", 13, 2, 1952);
        namsinh nammat = new namsinh("X Y T", 12, 2, 2013);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:61 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho5() {
        namsinh namsinh = new namsinh("A A B", 15, 0, 1952);
        namsinh nammat = new namsinh("A A B", 12, 14, 2013);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh không hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }

    @Test
    public void test_tuoi_tho6() {
        namsinh namsinh = new namsinh("A B D", 29, 3, 1940);
        namsinh nammat = new namsinh("A B D", 29, 5, 2010);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:70 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho7() {
        namsinh namsinh = new namsinh("B C B", 29, 4, 1940);
        namsinh nammat = new namsinh("B C B", 29, 11, 2010);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:70 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho8() {
        namsinh namsinh = new namsinh("B C D", 29, 2, 1944);
        namsinh nammat = new namsinh("B C D", 29, 2, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }

    @Test
    public void test_tuoi_tho9() {
        namsinh namsinh = new namsinh("A V D", 30, 7, 1944);
        namsinh nammat = new namsinh("A V D", 30, 9, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:67 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho10() {
        namsinh namsinh = new namsinh("D C V", 30, 2, 1944);
        namsinh nammat = new namsinh("D C V", 30, 2, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh không hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }

    @Test
    public void test_tuoi_tho11() {
        namsinh namsinh = new namsinh("S V N", 31, 1, 1944);
        namsinh nammat = new namsinh("S V N", 30, 7, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:67 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho12() {
        namsinh namsinh = new namsinh("S V A", 30, 4, 1944);
        namsinh nammat = new namsinh("S V A", 31, 7, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh hợp lệ" + "\n" + "Ngày mất hợp lệ" + "\n"
                + "Thọ:67 tuổi", kq);
    }

    @Test
    public void test_tuoi_tho13() {
        namsinh namsinh = new namsinh("S V X", 31, 2, 1944);
        namsinh nammat = new namsinh("A B C", 31, 2, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh không hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }

    @Test
    public void test_tuoi_tho14() {
        namsinh namsinh = new namsinh("S A N", 32, 3, 1944);
        namsinh nammat = new namsinh("A B C", -4, 7, 2011);
        tuoitho tuoitho = new tuoitho(namsinh, nammat);
        String kq = tuoitho.tinh_tuoi_tho();
        Assert.assertEquals("Ngày sinh không hợp lệ" + "\n" + "Ngày mất không hợp lệ" + "\n"
                + "Không thể tính tuổi thọ", kq);
    }
}

