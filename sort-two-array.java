//arr1=[1,2,3,4]   arr=2=[4,7,6,7,8]
//output
//arr3 = [1,2,3,4,4,6,7,7,8]

import java.util.Scanner;  

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the firtst array:");
        int size1=sc.nextInt();
        int[] array1=new int[size1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<size1;i++){
            System.out.println("Element"+(i+1)+":");
            array1[i]=sc.nextInt();
        }
        
        
        System.out.println("Enter the size of the secondarray:");
        int size2=sc.nextInt();
        int[] array2=new int[size1];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<size2;i++){
            System.out.println("Element"+(i+1)+":");
            array2[i]=sc.nextInt();
        }
        
        
        int[] mergedArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        
        
       for(int i=0;i<mergedArray.length-1;i++){
            for (int j=0;j<mergedArray.length-i-1;j++){
                if(mergedArray[j] > mergedArray[j+1]){
                    int temp=mergedArray[j];
                    mergedArray[j]=mergedArray[j+1];
                    mergedArray[j+1]=temp;
                }
            }
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i] );
        }
        
        
        }
}
