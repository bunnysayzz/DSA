
//split into half to find the word it rduces time complexity to log(n)
//condition is array should be sorted
public class Binary {
    static void main (String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        int result = binarySearch(arr, x);
        if (result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+result);
        }

        
    }
}