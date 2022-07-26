package buoi_3;

import java.util.Scanner;

public class bai1 {
	public static Scanner sc= new Scanner (System.in);
	
	public static void nhap(int []a, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.printf("a[%d]= ", i);
			a[i]=sc.nextInt();
			
		}
	}
	public static void xuat(int []a)
	{
		for(int i:a)
		{
			System.out.print(i +"  ");
			
		}
		System.out.println();
	}
	public static double tbc(int []a, int n)
	{
		int tong=0, dem=0;
		double tbc;
		for(int i=1; i<n; i+=2)
		{
			if(a[i]%2==1)
			{
				tong+=a[i];
				dem++;
			}
		}
		tbc=1.0*tong/dem;
		return tbc;
		
	}
	public static int min(int []a, int n)
	{
		int min=a[0];
		for(int i=1; i<n; i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	public static void vitri(int []a, int n)
	{
		System.out.print("vi tri cac so nho nhat: ");
		for(int i=0; i<n; i++)
		{
			if(a[i]==min(a,n))
			{
				System.out.print((i+1)+"  ");
			}
		}
	}
	public static boolean scp(int a)
	{
		if(Math.sqrt(a)==(int)Math.sqrt(a))
		return true;
		else return false;
	}
	public static void kiemtraSCP(int []a, int n)
	{
		int demcp=0;
		System.out.println("Cac so chinh phuong trong mang la:");
		for(int i=0; i<n; i++)
		{
			if(scp(a[i]))
			{
				System.out.print(a[i]+"  ");
				demcp++;
				
			}
			
		}
		if(demcp==0)
			System.out.println(" Mang khong co so chinh phuong");
	}
	public static boolean snt (int a)
	{
		int dem=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				dem++;
			}
		}
		if(dem==2)
			return true;
		else return false;
		
	}
	public static void kiemtraSNT(int []a, int n)
	{
		int dem=0;
		System.out.println("Cac so nguyen to trong mang la:");
		for(int i=0; i<n; i++)
		{
			if(snt(a[i]))
			{
				System.out.print(a[i]+"  ");
				dem++;
				
			}
			
		}
		if(dem==0)
			System.out.println(" Mang khong co so nguyen to");
	}
	public static void sapxep(int []a, int n)
	{
		int temp;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		xuat(a);
	}
	public static void main(String[] args) {
		System.out.print("Nhap vao so luong phan tu: ");
		int n;
		n=sc.nextInt();
		int a[]=new int [n];
		nhap(a,n);
		System.out.println("Mang vua nhap : ");
		xuat(a);
		System.out.println("Trung binh cong can tim la: "+tbc(a,n));
		vitri(a,n);
		System.out.println();
		kiemtraSCP(a,n);
		System.out.println();
		kiemtraSNT(a,n);
		System.out.println();
		System.out.println("Mang sau khi sap xep la: ");
		sapxep(a,n);
		
		
		
		
	}
	

}
