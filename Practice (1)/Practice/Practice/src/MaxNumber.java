import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        long[] intArray = new long[]{ 12,3,8,5,6,7,6,15,9,10 };
        long minNo = intArray[0];
        long maxNo=intArray[0] ;
        for (int i = 0;i<intArray.length;i++)
        {
            if (intArray[i]< minNo){
                minNo= intArray[i];
            }
            if (intArray[i]> maxNo){
                maxNo= intArray[i];
        }
      }
        System.out.println("min and max    "+minNo+ "   and   "+ maxNo);
    }
}

