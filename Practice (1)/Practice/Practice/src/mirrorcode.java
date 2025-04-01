public class mirrorcode {
    public static void main(String[] args) {
       String str = "abxyzba",nstr = "";
       int count= 0;
       for (int i =0;i<=(str.length())/2;i++)
       {
          // for (int j=str.length()-1;j>(str.length())/2;j--)
           //{
               char temp = str.charAt(i);
              // char temp1 = str.charAt(j);
           char temp1 = str.charAt(str.length()-1-i);
               if (temp == temp1)
               {
                   nstr = nstr+temp;
                 //  break;
               }
               else
               {
                   System.out.println("loop check completed");
                   count++;
               }
         //  }
           if (count == 1)
           {
               System.out.println("the mirror characters are---"+nstr);
               break;
           };
       }
    }
}
