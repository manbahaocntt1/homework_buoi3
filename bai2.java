package buoi_3;

import java.util.Scanner;

public class bai2 {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		String a;
		System.out.print("Nhap vao chuoi can chuan hoa: ");
		a=sc.nextLine();
		System.out.println("Chuoi: "+a);
		a=a.trim();
		a = a.replaceAll("\\s+"," ");
		a = a.replaceAll("[0-9]","");
		a=a.toLowerCase();
		String s[]=a.split(" ");
		String s1="";
		for(int i=0; i<s.length; i++)
		{
		s1 += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
		}
        System.out.println("Chuoi sau khi chuan hoa: "+s1);
	}

}
