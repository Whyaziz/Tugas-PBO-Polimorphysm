public class Salesman extends Pegawai {

    private int target;
    private int penjualan;
    private int bonus;

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public int getGaji() {
        return super.getGaji()+getBonus();
    }

    @Override
    public int getThr(){
        if (getPenjualan()>=getTarget()){
            return super.getGaji()*2;
        }
        else {
            return super.getGaji();
        }

    }

    public Salesman(String nama, String nip, String gender, int target) {
        super(nama, nip, gender);
        this.target = target;
    }

    public void setNip(String nip) {
        if (nip.startsWith("S")){
            this.nip = nip;
        }
    }

    public void setNip(int urutanMasuk) {
        String temp = ("S000" + urutanMasuk);
        this.nip = temp;
    }
}
