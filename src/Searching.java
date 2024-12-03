public class Searching {
    public static void main(String[] args) {
        int [] arr = {-18,-4 , -1,0,2, 3 , 4, 15 ,18 ,21,65,89};
        System.out.println(binarySearch(arr , 4));

    }

    static int linearSearch(int [] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i=0;i< arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        return -1;
    }

    static int[] searchIn2DArray(int [][] arr , int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static  int binarySearch(int [] arr , int target){
        int start =0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end-start) /2 ;
            if(target < arr[mid]){
                end = mid-1;

            }
            if(target > arr[mid]){
                start = mid +1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }


        return -1;
    }

    //Q: Ceiling of a Number : Smallest number greater or equal to target element
         //Floot of a Number : Greatest number lesser or equal to target element;

    static int ceiling(int [] arr , int target){

        return -1;
    }

    // Searching in a Matrix with every Row and Col Sorted

    static int [] RowColSearch (int [] [] matrix , int target){

        int row = 0;
        int col = matrix.length -1 ;



        return new int []{-1 ,-1};
    }
}

