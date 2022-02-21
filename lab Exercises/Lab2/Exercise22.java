import java.util.*;
public class Exercise22 {
    public static String[] sortStrings(String[] arr){
        int convertLength, n=arr.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(n%2==0)
            convertLength = n/2;
        else
            convertLength = (n/2)+1;
        for(int i = 0;i<convertLength;i++)
            arr[i] = arr[i].toUpperCase();
     for (int i=convertLength; i<n; i++)
           arr[i] = arr[i].toLowerCase();
        return arr;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String names[] = { "Ram", "Rahul", "Arjun", "Sam" };
      String res[] = sortStrings(names);
      for(int j=0;j<res.length; j++)
            System.out.println(res[j]+" ");
    }
}
