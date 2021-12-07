import java.math.BigInteger;

public class Driver {
    public static int lcmOfArray(int[] arr){
        int max = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int holder = max * arr[0];
        boolean status = false;
        while(!status){
            for(int i = 0;i<arr.length;i++){
                if(holder%arr[i]!=0){
                    break;
                }
                else if(i==arr.length-1){
                    status=true;
                    return holder;
                }
            }
            holder += max;
        }
        return holder;
    }

    public static BigInteger lookAndSay(BigInteger num){
        String number = num.toString();
        String newNum = "";
        if(number.length()%2==1){
            return BigInteger.valueOf(-1);
        }
        for(int i = 0;i<number.length()-1;i+=2){
            for(int j = Integer.parseInt(Character.toString(number.charAt(i)));j>0;j--){
                newNum += Character.toString(number.charAt(i+1));
            }
        }
        return new BigInteger(newNum);
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 6, 46, 54, 12, 13, 17};
        System.out.println(lcmOfArray(arr));
        int[] arr2 = {46, 54, 466, 544};
        System.out.println(lcmOfArray(arr2));
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(lcmOfArray(arr3));
        int[] arr4 = {13, 6, 17, 18, 19, 20, 37};
        System.out.println(lcmOfArray(arr4));


        System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));
        System.out.println(lookAndSay(BigInteger.valueOf(54544666)));
        System.out.println(lookAndSay(BigInteger.valueOf(95)));
        lookAndSay(BigInteger.valueOf(Long.parseLong("1213141516171819")));
        System.out.println(lookAndSay(BigInteger.valueOf(120520)));
        System.out.println(lookAndSay(BigInteger.valueOf(231)));
    }
}
