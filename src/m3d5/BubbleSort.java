package m3d5;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,3,6,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
//		Date d1=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//		String s1=sdf.format(d1);
//		System.out.println(s1);
	}
	
	public static void bubbleSort(int[] arr) {
		int temp=0;//用于交换
		boolean flag=false;
		int sortCount=0;
		int changeCount=0;
		//时间复杂度o（n^2）
		for(int j=0;j<arr.length-1;j++) {//趟数
			sortCount++;
			for(int i=0;i<arr.length-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					flag=true;
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					changeCount++;
				}
			}
			if(!flag) {
				//在一趟排序中没有发生交换
				break;
			}else {
				flag=false;
			}
		}
		System.out.println(sortCount);
		System.out.println(changeCount);
		return;
	}
}


