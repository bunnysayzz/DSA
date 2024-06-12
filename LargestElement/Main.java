import java.util.*;

//Brute force Approch
// public class Main {
//     public static void main(String[] args){
//         int arr[] = {1,4,3,2,6,7,8};
//         System.out.println(sort(arr));

//     }
//     static int sort(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length - 1];
//     }
// }

//Recursive Approach
public class Main{
public static void main (String[] args){
    int arr[] = {1,4,3,2,6,7,5};
    System.out.println(Largest(arr));
}
static int Largest(int arr[]){
    int max = arr[0];
    for (int i=0; i<arr.length; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
}
