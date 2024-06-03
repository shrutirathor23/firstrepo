package in.coBookExercises;

public class LargestNumInArray {
	public static void main(String[] args) {
		int arr[]= {1,34,67,27};
		LargestNumInArray obj=new LargestNumInArray();
		int a=obj.large(arr);
		System.out.println(a);

	}
	public int large(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}

}
