import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Country> countries = new ArrayList<>();
        int countryCount = scanner.nextInt();
        for(int i=0; i<countryCount; i++){
            String name = scanner.next();
            int gCount = scanner.nextInt();
            int sCount = scanner.nextInt();
            int bCount = scanner.nextInt();
            Country country = new Country(name, gCount, sCount, bCount);
            countries.add(country);
        }
        countries.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if(o1.gCount != o2.gCount){
                    return o2.gCount - o1.gCount;
                }else if (o1.sCount != o2.sCount){
                    return o2.sCount - o2.sCount;
                }else if(o1.bCount != o2.bCount){
                    return o2.bCount - o1.bCount;
                }else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });

        for(Country c : countries){
            System.out.println(c);
        }
    }
}


class Country {
    String name;
    int gCount;
    int sCount;
    int bCount;

    public Country(String name, int gCount, int sCount, int bCount){
        this.name = name;
        this.gCount = gCount;
        this.sCount = sCount;
        this.bCount = bCount;
    }

    @Override
    public String toString() {
        return name;

    }
}

