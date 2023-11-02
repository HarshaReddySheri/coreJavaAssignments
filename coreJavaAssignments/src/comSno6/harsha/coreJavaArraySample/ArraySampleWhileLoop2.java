package comSno6.harsha.coreJavaArraySample;

public class ArraySampleWhileLoop2
{
    public static void main(final String[] args) {
        int[] j = { 5, 8, 4, 34, 85 };
        System.out.println(j[2]);
        System.out.println();
        int i = 0;
        while(i < j.length) {
        	System.out.println(j[i]);
        	i++;
        }
    }
}
