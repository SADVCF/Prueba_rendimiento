import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        long tInicial, tFinal;

        List<Double>numeros=new ArrayList<>();

        tInicial=System.currentTimeMillis();

        for(int i=0; i<200000; i++)
        {
            numeros.add(0,Math.random());
        }

        tFinal=System.currentTimeMillis();


        System.out.println("Tiempo total inserciones ArrayList: "+(tFinal-tInicial));

        tInicial=System.currentTimeMillis();

        for(int i=0; i<200000; i++)
        {
            numeros.get((int)(Math.random()*numeros.size()));
        }

        tFinal=System.currentTimeMillis();

        System.out.println("Tiempo total búsquedas ArrayList: "+(tFinal-tInicial));



        LinkedList<Double> numeros2=new LinkedList<>();

        tInicial=System.currentTimeMillis();

        for(int i=0; i<200000; i++)
        {
            numeros2.add(0,Math.random());
        }
        tFinal=System.currentTimeMillis();

        System.out.println("Tiempo total inserciones LinkedList: "+(tFinal-tInicial));

        tInicial=System.currentTimeMillis();

        for(int i=0; i<200000; i++)
        {
            numeros2.get((int)(Math.random()*numeros2.size()));
        }

        tFinal= System.currentTimeMillis();

        System.out.println("Tiempo total búsqueda LinkedList: "+(tFinal-tInicial));
        
    }
}
