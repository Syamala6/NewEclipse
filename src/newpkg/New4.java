package newpkg;

public class New4 {
	
public static void main(String[] args) {
	New4 m4=new New4();
	int a=10;int b=a;
int c=	m4.m6(a,b);
System.out.println(c);
}
/*public void m6() {
	int a=10;int b= a;int c;
	c=a+b;
	System.out.println(c);
}*/
public int m6( int a,int b) {
	int c=a+b;
	//System.out.println(c);
	return c;
}
}
