/* 
 * COP3330 Spring 2022
 * Programming Assignment 4
 */




class WorkerRunner
{
	
	public static void main(String [] args)
	{
		
		//testing parent class
		System.out.println("Begin Testing the Worker Class.");
		
		Worker worker1 = new Worker("John", 35);
		worker1.whoAreYou();
		worker1.work();
		
		System.out.println("*************************************************************************");
		//testing child class
		System.out.println("Begin Testing the Teacher Class.");
		
		Teacher worker2 = new Teacher("Hannah", 40, 35);
		worker2.whoAreYou();
		worker2.work();
		worker2.grade();
		
		System.out.println("*************************************************************************");
		//testing child class
		System.out.println("Begin Testing the Doctor Class.");
		
		Doctor worker3 = new Doctor("Jane", 40, "Gastroenterologist");
		worker3.whoAreYou();
		worker3.work();
		worker3.checkUp();
		
		System.out.println("*************************************************************************");
		//testing child class
		System.out.println("Begin Testing the CampCounselor Class.");
		
		CampCounselor worker4 = new CampCounselor("Peter", 10, 13.52);
		worker4.whoAreYou();
		worker4.work();
		worker4.activity();
		
		System.out.println("*************************************************************************");
		worker1.updateHours(38);
		worker4.updateHours(20);
		
		System.out.println("*************************************************************************");
		worker1.whoAreYou();
		worker4.whoAreYou();
		
		System.out.println("End of testing...");
		
	}
}
