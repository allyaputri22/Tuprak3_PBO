package tuprak3;

public class Matematika2 extends Matematika {
    
     public void modulus(int a, int b) {
     this.angka1 = a;
     this.angka2 = b;
     modulus = angka1 % angka2;
    }
     
     public int hitungModulus() {
        return modulus;
    }
     
     public void disp(){
         System.out.println("Hasil modulus      10 % 4  : " + hitungModulus());
     }

}
