import java.util.List;

public class Manager extends Pegawai{
    private Pegawai sekretaris;
    private List<Pegawai> anakBuah;
    private String ruangan;

    public Pegawai getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Pegawai sekretaris) {
        this.sekretaris = sekretaris;
    }

    public void setSekretaris(String nip, String nama, String gender) {
        Pegawai p = new Pegawai(nama, nip, getGender());
        this.sekretaris = p;
    }

    public List<Pegawai> getAnakBuah() {
        return anakBuah;
    }

    public void setAnakBuah(List<Pegawai> anakBuah) {
        this.anakBuah = anakBuah;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    @Override
    public int getThr(){
        return super.getGaji()*2;
    }

    public Manager(String nama, String nip, String gender) {
        super(nama, nip, gender);
    }

    public void setNip(String nip) {
        if (nip.startsWith("M")){
            this.nip = nip;
        }
    }

    public void setNip(int urutanMasuk) {
        String temp = ("M000" + urutanMasuk);
        this.nip = temp;
    }
}
