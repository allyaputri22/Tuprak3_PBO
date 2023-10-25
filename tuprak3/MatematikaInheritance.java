package tuprak3;

public class MatematikaInheritance {

    public static void main(String[] args) {
     
        Matematika mtk = new Matematika();
        mtk.pertambahan(20, 10);
        mtk.pengurangan(10, 5);
        mtk.perkalian(10, 3);
        mtk.pembagian(21, 2);
        mtk.info();
        
        Matematika2 mtk2 = new Matematika2();
        mtk2.modulus(10,4);
        mtk2.disp();
    }
    
}
