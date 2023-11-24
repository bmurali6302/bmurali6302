
public class FinMinAndMax {

	public static void main(String[] args) {
		int arr[]= {5,53,72,98,4,67,98};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);


	}

}
/*
 * int[] array ={2,3,4,5};
 * int max=array[0];
 * int min=array[0];
 * for(int i=0;i<array.length;i++){
 * if(array[i]>max){
 * max=array[i];
 * }
 * if(array[i]<min){
 * min=array[i];
 * }
 * }syso(max);
 * syso(min);
 */

