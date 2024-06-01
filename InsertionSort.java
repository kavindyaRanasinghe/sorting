package Algorithms;

public class InsertionSort {
	 public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            
	            
	           
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int j : arr) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {56, 23, 89, 45, 67, 22, 10};
	        System.out.println("Original array:");
	        printArray(arr);
	        insertionSort(arr);
	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	}


