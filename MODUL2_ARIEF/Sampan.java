public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air Jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    
    
}
