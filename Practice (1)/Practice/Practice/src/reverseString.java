public class reverseString {
    public static void main (String [] args) {
        String str = "POT";
        String nstr = "";

        for(int i = str.length()-1;i >= 0;i--){
            char temp = str.charAt(i);
            nstr = nstr +temp;
            System.out.println(nstr);
        }

    }

}
