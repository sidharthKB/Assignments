package generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class q3 {
	public static <T> void swap(T[] a,int i,int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main (String[] args) {
		String [] a = {"1","2"};
		System.out.println("Before Swap: "+Arrays.toString(a));
		swap(a,0,1);
		System.out.println("After Swap: "+Arrays.toString(a));
	}
		}
