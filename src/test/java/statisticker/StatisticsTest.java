package statisticker;

import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import jdk.nashorn.internal.AssertsEnabled;

import static org.junit.Assert.assertEquals;

public class StatisticsTest 
{
    @Test
    public void reportsAverageMinMaxx()
    {
        Float[] numbers = {1.5f, 8.9f, 3.2f, 4.5f};
        List<Float> numberList = Arrays.asList(numbers);

        Statistics.Stats s = Statistics.getStatistics(numberList);

        float epsilon = 0.001f;
        assertEquals(s.average, 4.525f, epsilon);
        assertEquals(s.min, 1.5f, epsilon);
        assertEquals(s.max, 8.9f, epsilon);
    }
    @Test
    public void reportsNaNForEmptyInput()
    {
        List<Float> emptyList = new ArrayList<>();

        Statistics.Stats s = Statistics.getStatistics(emptyList);

        Assert.assertTrue(s.average.isNaN());
        Assert.assertTrue(s.min.isNaN());
        Assert.assertTrue(s.max.isNaN());
          assertEquals(s.average, Float.NaN, 0.0);
        assertEquals(s.min, Float.NaN, 0.0);
        assertEquals(s.max, Float.NaN, 0.0);
    }
}
