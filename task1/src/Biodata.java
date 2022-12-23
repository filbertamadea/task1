public class Biodata extends Main{
    public static Object setFname;
    String fname, lname, domisili;
    int tahun;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void Judul() {
        System.out.println("Ini adalah biodata anda");
    }

    public void Nama() {
        System.out.println("Nama anda adalah : " + fname + " " + lname);
    }

    public void Tahun() {
        System.out.println("Tahun anda lahir adalah : " + tahun);
    }

    public void Umur() {
        int usia = 2022 - tahun;
        System.out.println("Umur anda adalah : " + usia);
    }

    public void Domisili() {
        System.out.println("Domisili anda adalah : " + domisili);
    }
}
