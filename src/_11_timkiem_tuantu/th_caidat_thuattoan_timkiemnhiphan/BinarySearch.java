package _11_timkiem_tuantu.th_caidat_thuattoan_timkiemnhiphan;

public class BinarySearch {
    static int[]  list  = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int binarySearch(int  [] arr,int key){
        int low=  0;
        int high = arr.length-1;
        while (low <=  high){
            int mid = (low +  high)/2;
            if (arr[mid]  == key){
                return mid;
            }else if (arr[mid] >  key){
                high = mid - 1;
            }else {
                low  = mid  + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,7));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,59));
        System.out.println(binarySearch(list,69));
        System.out.println(binarySearch(list,100));
    }
        }

