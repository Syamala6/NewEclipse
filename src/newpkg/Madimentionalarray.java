package newpkg;

public class Madimentionalarray {

	public static void main(String[] args) {
int a[][]= {{1,2,3,4},{6,8,9,7}};
int size1 = a.length;

System.out.println("Row Size is :"+size1);
int size2=a[0].length;
System.out.println("Column size is : "+size2);
int valu=6;
for(int i=0;i<size1;i++) {
for(int j=0;j<size2;j++) {
	System.out.println(a[i][j]);
	if(a[i][j]==6) {
		System.out.println("Element found at index :"+i+j);
	}else
		System.out.println("Element Not Found at Index :"+i+j);
}
}

	}

}
