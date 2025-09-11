package rajeevsir;

import java.util.Arrays;

public class Rookies{

    public void Array1() {
        int rollNo[] = {101,102,103,104};
        System.out.println(rollNo.length);
        System.out.println(Arrays.toString(rollNo));
        System.out.println("***********************");

        for(int i =0;i<=rollNo.length-1;i++){
            System.out.println(rollNo[i]+" ");
        }
        System.out.println("************************");

        int i = 0 ;
        while(i<rollNo.length){
            System.out.println(rollNo[i]);
            i = i + 1;
        }
        System.out.println("*******************************");
        i = 0 ;
        do{
            System.out.println(rollNo[i]);
            i = i + 1;
        }while(i<rollNo.length);

        }
    }
