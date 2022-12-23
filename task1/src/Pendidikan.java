public class Pendidikan extends Main{
    String sd, smp, sma, univ;

    public void setSd(String sd) {
        this.sd = sd;
    }

    public void setSmp(String smp) {
        this.smp = smp;
    }

    public void setSma(String sma) {
        this.sma = sma;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public void Sd() {
        System.out.println("Ini adalah riwayat pendidikan anda");
    }

    public void Smp() {
        System.out.println("Pendidikan SD anda adalah : " + sd);
    }

    public void Sma() {
        System.out.println("Pendidikan SMP anda adalah : " + smp);
    }

    public void Kuliah() {
        System.out.println("Pendidikan SMA anda adalah : " + sma);
    }

    public void Domisili() {
        System.out.println("Pendidikan KULIAH anda adalah : " + univ);
    }
}
