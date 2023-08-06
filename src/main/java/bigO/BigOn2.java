package bigO;

public class BigOn2 {
    public static void main(String[] args) {
        //add each element to other element, including itself
        int [] arr = {2, 5, 7, 9}; //2+2, 2+5, 2+7, 5+2, 5+5, 5+7, 7+2, 7+5, 7+5

        int count = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.println(arr[i]+ arr[j]);
                count++;
            }
        }
        System.out.println("Number of execution: "+count);
    }
}