package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise36Test {
    public static float average(float num[],int size){
        float total=0;
        for(int i=0;i<size;i++)
        {
            total += num[i];

        }
        total = total / size;
        return total;
    }
    public static float min(float num[],int size)
    {
        float min=num[0];
        for(int i=0;i<size;i++)
        {
            if(min>num[i]){min = num[i];}
        }
        return min;
    }
    public static float max(float num[],int size)
    {
        float max = num[0];
        for(int i=0;i<size;i++){
            if(max<num[i]){max = num[i];}
        }
        return max;
    }
    public static float std(float num[],int size,float average){
        float total =0;
        for(int i=0;i<size;i++){
            total += Math.pow((num[i]-average),2);
        }
        total = total /size;
        total = (float) Math.sqrt(total);
        return total;

    }

    @Test

    void average()
    {
        float a[]={1,2,3,4,5};
        float actual = average(a,5); float expected = 5;
        assertEquals(3,actual);
    }

    @Test
    void min()
    {
        float a[]={1,2,3,4,5};
        float actual = min(a,5);
        assertEquals(1,actual);
    }

    @Test
    void max()
    {
        float a[]={1,2,3,4,5};
        float actual = max(a,5);
        assertEquals(5,actual);
    }

    @Test
    void std()
    {
        float a[]={1,2,3,4,5};
        int actual = (int) std(a,5,3); //cast to int to round down to 1
        assertEquals(1,actual);
    }
}