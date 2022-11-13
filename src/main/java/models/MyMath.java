package models;

/*
 *
 * @author Roman Netesa
 *
 */
public class MyMath {

    //--------------------------MAX MIN-------------------------
    public static double min(double a, double b) {
        return a > b ? b : a;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static long min(long a, long b) {
        return a > b ? b : a;
    }

    public static long max(long a, long b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static byte min(byte a, byte b) {
        return a > b ? b : a;
    }

    public static byte max(byte a, byte b) {
        return a > b ? a : b;
    }

    public static float min(float a, float b) {
        return a > b ? b : a;
    }

    public static float max(float a, float b) {
        return a > b ? a : b;
    }

    //----------------------------Power--------------------------

    public static int pow(int num, int power) {
        int sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static byte pow(byte num, int power) {
        byte sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static float pow(float num, int power) {
        float sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static double pow(double num, int power) {
        double sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static long pow(long num, int power) {
        long sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static int pow(int num, float power) {
        int sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static byte pow(byte num, float power) {
        byte sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static float pow(float num, float power) {
        float sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static double pow(double num, float power) {
        double sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    public static long pow(long num, float power) {
        long sum = num;
        for (int i = 1; i < power; i++) {
            sum *= num;
        }
        return sum;
    }

    //-----------------------INCREMENT DECREMENT----------------------------
    public static int incrementExact(int a) {
        return a + 1;
    }

    public static long incrementExact(long a) {
        return a + 1;
    }

    public static int decrementExact(int a) {
        return a - 1;
    }

    public static long decrementExact(long a) {
        return a - 1;
    }

    //-----------------------------ABSOLUTE------------------------------
    public static int abs(int a) { return a > 0 ? a : a * -1; }

    public static long abs(long a) {
        return a > 0 ? a : a * -1;
    }

    public static float abs(float a) {
        return a > 0 ? a : a * -1;
    }

    public static double abs(double a) {
        return a > 0 ? a : a * -1;
    }

}
