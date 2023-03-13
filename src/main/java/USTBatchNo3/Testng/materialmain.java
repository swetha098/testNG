package USTBatchNo3.Testng;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class materialmain {

	public static void main(String[] args) {

		material tvm=new material("TVM",1600,800);
		material chennai=new material("chennai",1800,1000);
		material hyder=new material("hyderabad",2000,900);
		material mumbai=new material("mumbai",2500,1200);
		material kochi=new material("kochin",1800,1200);
	List<material>l1=Arrays.asList(tvm,chennai,hyder,mumbai,kochi);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the city");
		
		String entered=sc.next();
		System.out.println("choice 1 : with material-enter 1:"+"\n"+"choice 2 : without material-enter 0:");
		int choice=sc.nextInt();
		System.out.println("sqft");
		int sqft=sc.nextInt();
		int p=city_function(entered,choice,sqft,l1);
		System.out.println("Total Price : "+p);
	}
		public static  int city_function( String cityen,int choicen,int sqftn, List<material>l3) {

		List<material>l2=l3.stream().filter(k->((k.city).equals(cityen))).toList();
		//System.out.println(l2);
		int totprice=0;
		if(choicen==1) {
		for(material k:l2) {
			
			totprice+=(k.price)*sqftn;
			}
		}
		else {
			for(material k:l2) {
			totprice+=(k.pricemate)*sqftn;
		
		}
			}
		return totprice;}
		
			
	}


		
	


