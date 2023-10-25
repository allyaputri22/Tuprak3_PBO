package tuprak3;

public class KonversiSuhu {
    double rumus;
    
    double celciusToFahrenheit(double celcius){
        rumus = (1.8 * celcius) + 32;
        System.out.println("Hasil 90 Celcius     = " + rumus + " Fahrenheit");
        return rumus;
    }
    
    double celciusToReamur(double celcius){
        rumus = 0.8 * celcius;
        System.out.println("Hasil 21 Celcius     = " + rumus + " Reamur");
        return rumus;
    }
}
