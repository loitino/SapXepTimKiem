package basic.dev;

import java.util.Arrays;

public class SapXepTimKiem {
	public static int[] reverse(int[] x) {
		int[] rs = new  int [x.length];
		int index= 0;
		for (int i=x.length-1; i>=0; i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
	  int [] a = new int[] {1,3,5,7,2,4,6,8 };
	  int [] b = new int[14];
	  
	  //
	  System.out.println("a ban đầu: " + Arrays.toString(a));
	  
	  //Hàm sắp xếp tăng dần
	  Arrays.sort(a);
	  System.out.println("a sau khi sắp xếp tăng dần: " + Arrays.toString(a));
	  
	  //Hàm sắp xếp giảm dần
	  Arrays.sort(a);
	  a = SapXepTimKiem.reverse(a);
	 System.out.println("a sau khi săp xếp giảm dần: " + Arrays.toString(a));
	  //Hàm tìm kiếm 
	   System.out.println(Arrays.binarySearch(a, 4 ));
	   System.out.println(Arrays.binarySearch(a, -1));  
	  //Hàm điền giá trị 
	   Arrays.fill(b, 5);
	   System.out.println("b sau khi điền giá trị: " + Arrays.toString(b));
	  }

}
