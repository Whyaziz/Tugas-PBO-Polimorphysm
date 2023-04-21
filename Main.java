public class Main {
    public static void main(String[] args) {

        Salesman doni = new Salesman("Doni Wahyudi", "S0001","NonBinary", 50);
        doni.setGaji(1_500_000);
        doni.setPenjualan(52);
        doni.getCuti("persalinan");
        doni.getCuti("pernikahan");
        System.out.println(doni.getNama()+" Mendapatkan THR sebesar : " + doni.getThr() + "Rupiah");

        System.out.println("============================================================================================");

        Salesman rahma = new Salesman("Rahma indriwati", "S0002","Perempuan", 50);
        rahma.setGaji(1_500_000);
        rahma.setPenjualan(27);
        rahma.getCuti("persalinan");
        rahma.getCuti("pernikahan");
        System.out.println(rahma.getNama()+" Mendapatkan THR sebesar : " + rahma.getThr() + "Rupiah");

        System.out.println("============================================================================================");

        Manager mia = new Manager("Mia Nurul Jannah", "M0001", "Perempuan");
        mia.setGaji(5_000_000);
        mia.getCuti("Pernikahan");
        mia.getCuti("Persalinan");
        System.out.println(mia.getNama()+" Mendapatkan THR sebesar : " + mia.getThr() + "Rupiah");
        System.out.println(mia.nip);
        mia.setNip("K0005");
        System.out.println(mia.nip);
        mia.setNip("M0005");
        System.out.println(mia.nip);

        System.out.println("============================================================================================");

        Manager aziz = new Manager("Muhammad Rizky Aziz", "M0002", "Laki-Laki");
        aziz.setGaji(5_200_000);
        aziz.getCuti("Pernikahan");
        aziz.getCuti("Persalinan");
        aziz.getCuti("sakit");
        System.out.println(aziz.getNama()+" Mendapatkan THR sebesar : " + aziz.getThr() + "Rupiah");
        System.out.println(aziz.nip);
        aziz.setNip(8);
        System.out.println(aziz.nip);

    }
}
