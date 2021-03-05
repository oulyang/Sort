package m3d5;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,3,6,5};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectSort(int[] arr) {
		//时间复杂度o(n^2)
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			int min=arr[i];
			//获得当前数组最小值
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					//min并不是最小
					min=arr[j];
					minIndex=j;

				}
			}			
			//把最小值放在数组第一个位置
			if(minIndex!=i) {
				arr[minIndex]=arr[i];
				arr[i]=min;
			}	
		}

	}
}
