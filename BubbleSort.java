package Algorithms;

public class BubbleSort {
	 public static void bubbleSort(int[] arr) {
	        int a = arr.length;
	        boolean swapped;
	        for (int i = 0; i < a - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < a - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            
	            if (!swapped) break;
	        }
	    }

	   
	    public static void main(String[] args) {
	        int[] arr = {60, 24, 45, 12, 32, 11, 80};
	        System.out.println("Original array:");
	        printArray(arr);
	        
	        bubbleSort(arr);
	        
	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

	  
	    public static void printArray(int[] arr) {
	        for (int j : arr) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	}


