package specialforce.string;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class TestSort {

	public static void main(String[] args) {

		int[] arr1 = getData(10000000, 10000000);
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		
		long start1 = Calendar.getInstance().getTimeInMillis();
		Arrays.sort(arr1);
		long end1 = Calendar.getInstance().getTimeInMillis();
		System.out.println(end1 - start1);
		
		int[] min1 = Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(min1));

		System.out.println("=========================");
		
		
		long start2 = Calendar.getInstance().getTimeInMillis();
		int[] min2 = returnMinArr(arr2,10);
		long end2 = Calendar.getInstance().getTimeInMillis();
		System.out.println(end2 - start2);
		System.out.println(Arrays.toString(min2));

	}

	private static int[] returnMinArr(int[] arr,int count) {
		int[] min = new int[count];
		boolean sorted = false;
		for (int i = 0; i < arr.length; i++) {
			if (i < count) {//初始化最初的10个数据
				min[i] = arr[i];
				continue;
			}
			if (!sorted) {//对最初的10个先排序
				Arrays.sort(min);
				sorted = true;
			}
			if (arr[i] < min[count-1]) {//如果有比10个数据中最大的还小的，插入到最小数组中
				insertMin(min,arr[i]);
			}
		}
		return min;
	}

	private static void insertMin(int[] min,int a){
		for(int i=0;i<min.length;i++){
			if(a<min[i]){
				for(int j=min.length-1;j>i;j--){
					min[j]=min[j-1];
				}
				min[i]=a;
				break;
			}
		}
		
	}
	
	
	private static int[] getData(int size, int range) {
		Random r = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = r.nextInt(range);
		}
		return arr;
	}

}
