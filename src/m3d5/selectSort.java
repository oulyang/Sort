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
		//ʱ�临�Ӷ�o(n^2)
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			int min=arr[i];
			//��õ�ǰ������Сֵ
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					//min��������С
					min=arr[j];
					minIndex=j;

				}
			}			
			//����Сֵ���������һ��λ��
			if(minIndex!=i) {
				arr[minIndex]=arr[i];
				arr[i]=min;
			}	
		}

	}
}
