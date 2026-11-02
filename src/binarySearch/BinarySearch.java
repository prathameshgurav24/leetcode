package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,8,9,11,12,14,16,20,45};
        int target=17;
        int result=binarySearch(arr,target);

        if (result>-1) {
            System.out.println(target+" at position "+result);
        } else{
            System.out.println(target+" is not in given input");
        }
        
    }
    public static int binarySearch(int arr[],int target){

        int start=0;
        int end=arr.length;
        int mid;

        while (end!=start) {

            mid=(start+end)/2;
            if (arr[mid]==target) {
                return mid;
            }else if (target>arr[mid]) {
                start=mid+1;
            } else {
                end=mid-1;
            }

        }
        return -1;
    }
}
