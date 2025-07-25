package 정처기;

import java.lang.Number;

public class NaturalNumber implements Number {

    @Override
    public int add(int[] v,boolean odd){
        int sum=0;
        for(int i=0; i<v.length; i++){
            if((odd && v[i] % 2 != 0) && (!odd && v[i] % 2 ==0)){
                sum += v[i];
            }
        }

        return sum;
    }
}
