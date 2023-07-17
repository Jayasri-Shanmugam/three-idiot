package Jayasrijavapractice;
import java.util.Scanner;
public class threeidiot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              int x1=sc.nextInt();
              int y1=sc.nextInt();
              int x2=sc.nextInt();
              int y2=sc.nextInt();
              float mid1=(float)((x1+x2)/2);
              float mid2=(float)((y1+y2)/2);
              System.out.printf("%.1f,%.1f",mid1,mid2);
              sc.close();
	}

}

