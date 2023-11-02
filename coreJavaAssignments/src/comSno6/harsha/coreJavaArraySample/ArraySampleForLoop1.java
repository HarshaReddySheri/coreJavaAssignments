package comSno6.harsha.coreJavaArraySample;
public class ArraySampleForLoop1
{
    public static void main(String[] args) {
        int[] j = { 5, 8, 4, 34, 85 };
        System.out.println(j[2]);
        System.out.println();
        for (int i = 0; i < j.length; ++i) {
            System.out.println(j[i]);
        }
    }
}
