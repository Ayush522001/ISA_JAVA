package Lec_13;

public class Arrays_demo {
    public static void main(String[] args) {
        int arr[]=new int[5];

        System.out.println(arr);

        //INDEXING

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        System.out.println("==========>");
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);


        System.out.println(arr.length+"  ");
        for(int i=0;i< arr.length;i++){
            arr[i]=100*(i+1);
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);;
        }
    }

}
