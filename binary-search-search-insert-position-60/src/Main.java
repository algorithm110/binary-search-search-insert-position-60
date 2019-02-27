
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data1[] = {1,3,5,6};
		int target1 = 5;
		
		int data2[] = {1,3,5,6};
		int target2 = 2;
		
		int data3[] = {1,3,5,6};
		int target3 = 7;
		
		int data4[] = {1,3,5,6};
		int target4 = 0;
		
		int ans1 = BSSearchInsertPosition.searchInsert(data1, target1);
		System.out.println("ans1 = " + ans1 +" VS answer is 2");
		
		int ans2 = BSSearchInsertPosition.searchInsert(data2, target2);
		System.out.println("ans2 = " + ans2 +" VS answer is 1");
		
		int ans3 = BSSearchInsertPosition.searchInsert(data3, target3);
		System.out.println("ans3 = " + ans3 +" VS answer is 4");
		
		int ans4= BSSearchInsertPosition.searchInsert(data4, target4);
		System.out.println("ans4 = " + ans4 +" VS answer is 0");
	}

}
