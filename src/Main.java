import Figures.*;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Figura> figures = new ArrayList<Figura>();

    public  static void suma(){
        double areaTotal = 0;
        int i;
        for (i=0; i<figures.size(); i++) {
            areaTotal= areaTotal + figures.get(i).calculArea();
        }
    }
    public static void main(String[] args) {

        Triangle a = new Triangle(3,4);
        figures.add(a);
        Quadrat b = new Quadrat(3);
        figures.add(b);

        suma();

    }

}

