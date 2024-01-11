public class Siswa {
    public static void main(String[] args){
        System.out.println("Semangat Beajar");
        Siswa s = new Siswa();
        s.tampilNama();
        System.out.println(s.usia(2007));
    }   
        
        
    public void tampilNama(){
        String nama= "Alia";
        System.out.println("Nama Siswa: "+nama);

        
}
    public int usia(int tahunLahir){
        int usia=2023-tahunLahir;
        return usia;
    }
    }
