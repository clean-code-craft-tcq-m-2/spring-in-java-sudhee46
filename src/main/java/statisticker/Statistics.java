package statisticker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Statistics 
{
    static class Stats{
        public Float min=Float.NaN;
        public Float max=Float.NaN;
        public Float average=Float.NaN;
    }
    public static Stats getStatistics(List<Float> numbers) {
        Statistics.Stats s=new Stats();
        if(!numbers.isEmpty())
        {
            s.min= Collections.min(numbers);
            s.max= Collections.max(numbers);
            Float sum=0.0f;
            for(Float number:numbers){
                sum+=number;
            }
            s.average=(Float)sum/numbers.size();

        }
        return s;

    }
}
