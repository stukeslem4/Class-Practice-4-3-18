import java.util.Scanner;
public class add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]X=new int[3];

int[]Y=new int[3];

	Scanner D=	new Scanner(System.in);
	System.out.println("Type three numbers");	
	X[0]=D.nextInt();	
	X[1]=D.nextInt();	
	X[2]=D.nextInt();	
		
	System.out.println("Type three numbers");	
	Y[0]=D.nextInt();	
	Y[1]=D.nextInt();	
	Y[2]=D.nextInt();	
		
	
	int[]Z=new int[3];
	
	for(int i=0;i<=X.length-1;i++){
		
		Z[i] = X[i]+Y[i];
			
			System.out.println(Z[i]);	
		}
		
	}

}
