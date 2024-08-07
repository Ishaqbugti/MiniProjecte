import java.util.*;
class MiniProject{
	public static void main (String arg[]){
		Scanner obj = new Scanner (System.in);
		System.out.println( " Enter Any Number From 1 to 10 : ");
		System.out.println( " 1 : Calculater ");
		System.out.println( " 2 : Atm ");
		System.out.println( " 3 :Unit Convertor ");
		System.out.println( " 4 :Marks Sheet ");
		System.out.println( " 5 :Troly Load ");
		System.out.println( " 6 :Employes Salary ");
		System.out.println( " 7 : Positive / Negative");
		System.out.println( " 8: Age Comparing " );
		System.out.println( " 9 : About Developer " );
		System.out.println( " 10:Exit " );
		int selection = obj.nextInt();
		if( selection == 1 ){
			System.out.println(" 1: Addition " );
			System.out.println( " 2: Subtraction " );
			System.out.println( " 3: Multiplication " );
			System.out.println( " 4: Devision ");
			System.out.println( " 5: Reminder " );
			System.out.println(  " Enter Your Selection : " );
			int SelecteOption = obj.nextInt();
			if(SelecteOption == 1){
				System.out.print(" Enter Your Values : ");
				int value1 = obj.nextInt();
				int value2 = obj.nextInt();
				System.out.print(" Addition is : " + (value1 + value2));
			}
			if(SelecteOption == 2){
				System.out.print(" Enter Your Values : ");
				int value1 = obj.nextInt();
				int value2 = obj.nextInt();
				System.out.print(" Subtraction is : " + (value1 - value2));
			}
			if(SelecteOption == 3){
				System.out.print(" Enter Your Values : ");
				int value1 = obj.nextInt();
				int value2 = obj.nextInt();
				System.out.print(" Multiplication is : " + (value1 * value2));
			}
			if(SelecteOption == 4){
				System.out.print(" Enter Your Values : ");
				int value1 = obj.nextInt();
				int value2 = obj.nextInt();
				System.out.print(" Devision is : " + (value1 / value2));
			}
			if(SelecteOption == 5){
				System.out.print(" Enter Your Values : ");
				int value1 = obj.nextInt();
				int value2 = obj.nextInt();
				System.out.print(" Reminder is : " + (value1 % value2));
			}
		}
		if(selection == 2){
			System.out.print(" ATM : Enter Your Rupees : ");
			int rupees = obj.nextInt();
			int fiveThousand = rupees / 5000;
			int rem = rupees % 5000;
			int oneThousand = rem / 1000;
			rem = rem % 1000;
			int fiveHundrad = rem / 500; 
			rem = rem % 500;
			int oneHunderad = rem / 100; 
			rem = rem % 100;
			int fiftyRupees = rem / 50;
			rem = rem % 50;
			int towentyRupees = rem / 20;
			rem = rem % 20;
			int tenRupees = rem / 10;
			rem = rem % 10;
			int fiveRupees = rem / 5;
			rem = rem % 5;
			int twoRupees = rem / 2;
			rem = rem % 2;
			int oneRupees = rem / 1;
			rem = rem % 1;
			System.out.println( " Five Thousands is : " + fiveThousand);
			System.out.println( " One Thousands is : " + oneThousand);
			System.out.println( " Five Hundrads is : " + fiveHundrad);
			System.out.println( " One Hundrads is : " + oneHunderad);
			System.out.println( " Fifty Rupees is  : " + fiftyRupees);
			System.out.println( " Towenty Rupees is : " + towentyRupees);
			System.out.println( " Ten Rupees is : " + tenRupees);
			System.out.println( " Five Rupees is : " + fiveRupees);
			System.out.println( " Two Rupees is : " + twoRupees);
			System.out.println( " One Rupees is : " + oneRupees);
		}
		
		if(selection == 3){
			System.out.println( " Unit Convertor : ");
			System.out.println( " 1 :Grame To Kilo ");
			System.out.println( " 2 : Kilo To Grame ");
			System.out.println( " 3 :Inch To Feet ");
			System.out.println( " 4 :Feet  To Inch ");
			System.out.println( " 5 : Centi Meter To Meter ");
			System.out.println( " 6 :Meter To Centi Meter ");
			System.out.print( " Enter Selection Which You Want : ");
			int selectchoice = obj.nextInt();
			if( selectchoice == 1){
				System.out.print(" Enter Your Grame : " );
				int gram = obj.nextInt();
				int kilo = gram / 1000;
				System.out.print(" Kilo will be : " + kilo);
			}
			if( selectchoice == 2){
				System.out.print(" Enter Your kilo : " );
				int kilo = obj.nextInt();
				int gram = kilo *  1000;
				System.out.print(" Grame will be : " + gram);
			}
			if( selectchoice == 3){
				System.out.print(" Enter Your Inch : " );
				int inch = obj.nextInt();
				int feet = inch / 12;
				System.out.print(" Feet will be : " + feet);
			}
			if( selectchoice == 4){
				System.out.print(" Enter Your Feet : " );
				int feet = obj.nextInt();
				int inch = feet * 12;
				System.out.print(" Inch will be : " + inch);
			}
			if( selectchoice == 5){
				System.out.print(" Enter Your Centi Meter : " );
				int centiMeter = obj.nextInt();
				int meter = centiMeter / 100;
				System.out.print(" Meter will be : " + meter);
			}
			if( selectchoice == 6){
				System.out.print(" Enter Your Meter : " );
				int meter = obj.nextInt();
				int centiMeter = meter * 100;
				System.out.print(" Centi Meter will be : " + centiMeter);
			}
		}
		if(selection == 4){
			System.out.println(" Marks Sheet : ");
			System.out.print( " Enter Your Marks of English : ");
			int eng = obj.nextInt();
			System.out.print(" Enter Your Marks of  Physics :  ");
			int phy = obj.nextInt();
			System.out.print(" Enter Your Marks of Biology : ");
			int bio = obj.nextInt();
			System.out.print(" Enter Your Marks of Chemistry : ");
			int che = obj.nextInt();
			int obtainMarks = ( eng + phy + bio + che);
			int totalMarks = 400;
			int percentage = (obtainMarks*100/totalMarks);
			System.out.println( " Total Marks is : " + totalMarks);
			System.out.println( " Obtain Marks is : " + obtainMarks);
			System.out.println( " Percentage is : " + percentage +"%");
		}
		if(selection == 5){
			System.out.println(" Troly Load : " );
			System.out.print(" Enter Your Load : ");
			int load = obj.nextInt();
			int totalIncome = load * 800;
			System.out.println(" Total Income is : " + totalIncome);
			int driverCharges = load * 150;
			System.out.println( " Driver Charges is : " + driverCharges);
			int tax = 5*totalIncome/100;
			System.out.println(" 5% Tax is : " + tax);
			int disel = load * 200;
			System.out.println(" Disel Charges is : " + disel);
			int expance = ( driverCharges + tax + disel);
			int netIncome = totalIncome - expance;
			System.out.println(" Net Income is : " + netIncome);
		}
		if(selection == 6){
			System.out.println(" Employes Salary : " );
			System.out.print(" Enter Your Basic Pay : ");
			int basicPay = obj.nextInt();
			int houseRent = basicPay * 45/100;
			int medicalAllowaince = basicPay * 15/ 100;
			int bonius = basicPay * 5/100;
			int grossPay = (basicPay + houseRent + medicalAllowaince + bonius);
			int incomeTax = basicPay * 5/100;
			int convenceAllowaince = basicPay * 8 / 100;
			double zakat = basicPay * 10/4/100;
			double totalTaxes = (incomeTax + convenceAllowaince + zakat);
			double netSalary = (grossPay - totalTaxes);
			System.out.println(" Basic Pay is : " + basicPay);
			System.out.println(" House Rent  is : " + houseRent);
			System.out.println(" Medical Allowiance   is : " + medicalAllowaince);
			System.out.println(" Bonius  is : " + bonius);
			System.out.println(" Gross Pay is : " + grossPay);
			System.out.println(" Income Tax  is : " + incomeTax);
			System.out.println(" Convence Allowaince is : " + convenceAllowaince);
			System.out.println(" Zakat  is : " + zakat);
			System.out.println(" Net  Salary is : " + netSalary);
		}
		if(selection == 7){
			System.out.println( " Check Number is Positive / Negative : " );
			System.out.print(" Enter Your Number : " );
			int num = obj.nextInt();
			if(num > 0){
				System.out.print( " Number Is Positive : " + num);
			}else{
				System.out.print( " Number Is Negative : " + num);
			}
		}
		if( selection == 8){
			System.out.println(" Age Comparing : " );
			System.out.print(" Enter 1st Age : ");
			int age1 = obj.nextInt();
			System.out.print(" Enter 2st Age : ");
			int age2 = obj.nextInt();
			if(age1 > age2){
				System.out.println(" First Age Is Greater Than Second " );
			}
			else{
				System.out.println(" Second Age Is Greater Than First " );
			}
		}
		if(selection == 9){
			System.out.println(" Developer Introduction : ");
			javax.swing.JOptionPane.showMessageDialog(null, " My Name is M Ishaque " + "\n My Father Name is Jaffar Khan " + "\n I am Study In S U " +  " Now Learning Java ");
		}
		if(selection == 10){
			System.exit(0);
		}
	}
}