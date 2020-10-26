package newpkg;

public class newLinearSe {

	public static void main(String[] args) {
		
int a[]= {1,2,3,4,5,6};

int size = a.length;
System.out.println(size);

int valu=6;


for(int i=0;i<size;i++) {
	if(a[i]==valu) {
		System.out.println("Element is found at Index is :"+i);
	}else
	{
		System.out.println("Element not found at index "+i);
	}
}
	}

}
