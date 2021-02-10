import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> returnLst = new ArrayList<>();
        int counter = 0;
        int place = 0;

        while(list.size() > returnLst.size())
        {
            if(counter>returnLst.size()-1)
            {
                returnLst.add(list.get(place));
                
                counter = 0;
                place++;
            }
            else if(list.get(place)<=returnLst.get(counter))
            {
                returnLst.add(counter,returnLst.get(place));
                
                place++;
                counter = 0;
            }
            else
            {
                counter++;
            }
        }
        return returnLst;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] returnArr = new int[arr1.length+arr2.length];
        for(int i = 0; i<arr1.length; i++)
        {
            returnArr[i*2] = arr1[i];
            returnArr[i*2 +1] = arr2[i];
        }
        Arrays.sort(returnArr);
        return returnArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(7);
        
        int[] arr1 = new int[]{ 1,3,5,7,9 }; 
        int[] arr2 = new int[]{ 2,4,6,8,10 }; 

        System.out.println(insertionSort(list));
        System.out.println(merge(arr1, arr2));
    }
}