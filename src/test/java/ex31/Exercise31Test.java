package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise31Test {
    public static float CKarvonen(int age, float resting, int intensity){
        float dintensity = intensity;
        dintensity = dintensity/100;
        float target = (((220-age)-resting)*(dintensity))+resting;
        return target;
    }

    @Test
    void CKarvonen() {
        int actual = (int) CKarvonen(22,65,55); //I changed it to int to round down.
        assertEquals(138,actual);
    }
}