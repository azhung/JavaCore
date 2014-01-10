package demo_java_util;


import java.util.Arrays;


public class ArraysDemo {
    
    public ArraysDemo() {
    }
    public static void main(String[] args) {
        Integer[] A = {1,5,4,3,2};
        Integer[] B = {1,2,3,4,5};
        String[] C = {"a","b","c"};
        String[] D = {"a","b","c"};

        //tim 1 phan tu trong mang
        int i = Arrays.binarySearch(C, "b");
        System.out.println("i = "+i);
        
        //So sanh 2 mang co bang nhau hay khong?
        if (Arrays.equals(C,D)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        //Sap xep mang
        Arrays.sort(A);
        System.out.println("Cac phan tu cua mang A sau khi sap xep:");
        for (i = 0; i < A.length; i++){
            System.out.print(A[i]+"\t");
        }
        
        //Gan gia tri cho tat ca cac phan tu cua mang
        Arrays.fill(B,10);
        
        System.out.println("Cac phan tu cua mang B sau khi gan la:");
        for ( i = 0; i < B.length; i++){
            System.out.print(B[i]+"\t");
        }
        
    }
    
}
