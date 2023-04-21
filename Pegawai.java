public class Pegawai {
    private String nama;
    private String gender;
    String nip;
    private String departemen;
    private int gaji;
    private int thr;
    private int cuti = 12;

    public String getNama() {
        return nama;
    }

    public Pegawai(String nama, String nip, String gender) {
        this.nama = nama;
        this.nip = nip;
        this.gender = gender;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setGaji(int gaji, int tunjangan) {
        this.gaji = gaji + tunjangan;
    }

    public void setGaji(int gaji, int tunjangan, int potongan) {
        this.gaji = gaji+tunjangan-potongan;
    }

    public void setGaji(int gaji, double potongan) {
        this.gaji = gaji-(int)potongan;
    }

    public void setGaji(double potongan, int gaji) {

    }

    public int getThr() {
        return getGaji();
    }

    public void setThr(int thr) {
        this.thr = thr;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public void setNip(String nip) {
        if (nip.startsWith("P")){
            this.nip = nip;
        }
    }

    public void setNip(int urutanMasuk) {
        this.nip = "P000" + urutanMasuk;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCuti(int cuti) {
        this.cuti = cuti;
    }

    public int getCuti(){
        return this.cuti;
    }

    public void getCuti(String alasan){
        if (alasan.equalsIgnoreCase("pernikahan")){
            System.out.println(getNama() + "Mendapat cuti selama " + (getCuti()+2) +" hari");

        } else if (alasan.equalsIgnoreCase("Persalinan")) {
            if (getGender().equalsIgnoreCase("perempuan")){
                System.out.println(getNama() + "Mendapat cuti selama " + (getCuti()+90) +" hari");
            }
            else {
                System.out.println(getNama() + "Mendapat cuti selama " + (getCuti()+3) +" hari");
            }
        } else {
            System.out.println(getNama() + "Mendapat cuti selama " + (getCuti()) +" hari");
        }
    }

    public void getCuti( int hari ) {
        System.out.println(getNama() + "Mendapat cuti selama " + (getCuti()+hari) +" hari");
    }


}
