package tuprak3;

public class Matematika{
    public int angka1, angka2;
    public int jumlah, kurang, kali, bagi, modulus;

    public int pertambahan(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPenjumlahan();
        return 0;
    }

    public int pengurangan(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPengurangan();
        return 0;
    }

    public int perkalian(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPerkalian();
        return 0;
    }

    public int pembagian(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        hitungPembagian();
        return 0;
    }
    
    void hitungPenjumlahan() {
        jumlah = angka1 + angka2; 
    }

    void hitungPengurangan() {
        kurang = angka1 - angka2;
    }

    void hitungPerkalian() {
        kali = angka1 * angka2;   
    }

    void hitungPembagian() {
        if (angka2 != 0) {
            bagi = angka1 / angka2; 
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            bagi = 0;
        }
    }
    
        public void info() {
        System.out.println("Hasil penjumlahan  20 + 10 : " + jumlah);
        System.out.println("Hasil pengurangan  10 - 5  : " + kurang);
        System.out.println("Hasil perkalian    10 * 3  : " + kali);
        System.out.println("Hasil pembagian    21 / 2  : " + bagi);
      
    }
}
