import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biodata biodata = new Biodata();
        Pendidikan pendidikan = new Pendidikan();
        int var, tahun, usia;
        char lanjut, input;
        do {
            System.out.println("Siapa Nama Depan Anda= ");
            biodata.setFname(sc.nextLine());
            System.out.println("Siapa Nama Belakang Anda= ");
            biodata.setLname(sc.nextLine());
            System.out.println("Dimana Domisili anda= ");
            biodata.setDomisili(sc.nextLine());
            System.out.println("Tahun berapa anda lahir? = ");
            biodata.setTahun(sc.nextInt());
            sc.nextLine();
            System.out.println("Riwayat Pendidikan (SD)= ");
            pendidikan.setSd(sc.nextLine());
            System.out.println("Riwayat Pendidikan (SMP)= ");
            pendidikan.setSmp(sc.nextLine());
            System.out.println("Riwayat Pendidikan (SMA)= ");
            pendidikan.setSma(sc.nextLine());
            System.out.println("Riwayat Pendidikan (Kuliah)= ");
            pendidikan.setUniv(sc.nextLine());
            do{
                System.out.flush();
                System.out.println("Pilih Menu = ");
                System.out.println("1. Biodata = ");
                System.out.println("2. Riwayat Pendidikan = ");
                System.out.println("Pilih angka = ");
                var=sc.nextInt();
                switch (var)
                {
                    case 1:
                        biodata.Judul();
                        biodata.Tahun();
                        biodata.Umur();
                        biodata.Domisili();
                        break;
                    case 2:
                        System.out.println("Ini adalah riwayat pendidikan anda");
                        pendidikan.Sd();
                        pendidikan.Smp();
                        pendidikan.Sma();
                        pendidikan.Kuliah();
                        break;
                    default:
                        System.out.println("tidak ada pilihan");
                        break;
                }
                System.out.println("Ingin Mengulang Opsi? (y/n) = ");
                lanjut=sc.next().charAt(0);
                System.out.println();
            }
            while (lanjut == 'y');
            System.out.println("Ingin Mengulang Input? (y/n) = ");
            input=sc.next().charAt(0);
            sc.nextLine();
        }while (input == 'y');

        System.out.println("Sampai Jumpa");

    }
}