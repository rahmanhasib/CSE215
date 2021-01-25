import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("First Name : ");
        String firstName = s.next();
        //Using Regex.
        while (firstName.matches(".*\\d.*")) {
            System.out.println("Please enter a valid First Name !");
            firstName = s.next();
        }
        System.out.println("Last Name : ");
        String lastName = s.next();
        if ((lastName.matches(".*\\d.*"))) {
            System.out.println("Please enter a valid Last Name !");
            lastName = s.next();
        }
        
        int age = 0;
        do{ 
            System.out.println("Date of Birth(dd-mm-yyyy) : ");
            String dateOfBirth = s.next();
            String[] dob = dateOfBirth.split("-");
            int day,month, year;
            try 
            {
            day = Integer.parseInt(dob[0]);
            month = Integer.parseInt(dob[1]);
            year = Integer.parseInt(dob[2]);
            age = 2021 - year;
            } 
            catch (Exception e) 
            {
            System.out.println("Invalid Date of Birth");
            }
            if(age<18)System.out.println("Please Enter valid date of Birth.");
        }while(age<18);
        
        int totalFamilymember=0;
	    int memberUnder18=0,memberAbove18=0;
	    do{
	        System.out.println("Number of family members above age 18 : ");
	        String adultMem = s.next();
	        try{
	            memberAbove18 = Integer.parseInt(adultMem);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	            
	        }
	        System.out.println("Number of family members below age 18 : ");
	        String childMem =s.next();
            try{
	            memberUnder18 = Integer.parseInt(childMem);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	        totalFamilymember = memberUnder18+memberAbove18;
	        if(totalFamilymember>15){
	            System.out.println("family members should not exceed 15.");
	        }
	        
	        
	    }while(totalFamilymember>15);
	    
	    int avgMonthlyPersonal=1000000;
	    do{
	        System.out.println("Average Monthly Personal Income : ");
            String avgMPI = s.next();
            try{
	            avgMonthlyPersonal = Integer.parseInt(avgMPI);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	        if(avgMonthlyPersonal>999999) {
	            System.out.println("Average Income should not exceed 999999.");
	        }
	    }while(avgMonthlyPersonal>999999);
	    
	    int avgMonthlyFamily=1000000;
	    do{
	        System.out.println("Average Monthly Family Income : ");
            String avgMFI = s.next();
            try{
	            avgMonthlyFamily = Integer.parseInt(avgMFI);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	        if(avgMonthlyFamily>999999) {
	            System.out.println("Average Income should not exceed 999999.");
	        }
	    }while(avgMonthlyFamily>999999);
	    
	    int avgMonthlyExpense=1000000;
	    do{
	        System.out.println("Average Monthly Family Expense : ");
            String avgMPI = s.next();
            try{
	            avgMonthlyExpense = Integer.parseInt(avgMPI);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	        if(avgMonthlyExpense>999999) {
	            System.out.println("Average Income should not exceed 999999.");
	        }
	    }while(avgMonthlyExpense>999999);
	    
	    int avgMonthlyFarmingExpense=1000000;
	    do{
	        System.out.println("Average Monthly Farming Expense : ");
            String avgMPI = s.next();
            try{
	            avgMonthlyFarmingExpense = Integer.parseInt(avgMPI);
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	        if(avgMonthlyFarmingExpense>999999) {
	            System.out.println("Average Income should not exceed 999999.");
	        }
	        Double legitExpense = Double.valueOf(avgMonthlyFamily)*1.25;
	        if(Double.valueOf(avgMonthlyFarmingExpense)>legitExpense){
	            System.out.println("Invalid Expense");
	            avgMonthlyFarmingExpense=1000000;
	        }
	    }while(avgMonthlyFarmingExpense>999999);
	    
	     boolean helpNeeded;
	    boolean notValid = true;
	    do{
	        System.out.println("You need help from the government : true/false");
            String help = s.next();
            if (!(help.equalsIgnoreCase("true") || help.equalsIgnoreCase("false"))) {
                 System.out.println("Please enter a valid input(true/false).");
             }
             else{
                 helpNeeded =Boolean.parseBoolean(help);
                 notValid=false;
             }
	    }
	    while(notValid==true);
	    
	    int stipend;
	    notValid=true;
	    do{
	        System.out.println("Amount of money You wish to have as stipend from the Govt : ");
            String stip = s.next();
            try{
	            stipend = Integer.parseInt(stip);  
	            Double legitStip = Double.valueOf(avgMonthlyFamily)*1.25;
	            if(Double.valueOf(stipend)>legitStip){
	                System.out.println("Invalid Stipend");
	             }
	        else {notValid=false;}
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	      
	    }while(notValid==true);
	    
	    notValid=false;
	    int fertilizerNeeded;
	    do{
	        System.out.println("Amount of Fertilizer(kg) You need  from the Govt :(should be below 100) ");
            String fert = s.next();
            try{
	            fertilizerNeeded = Integer.parseInt(fert);  
	            Double legitStip = Double.valueOf(avgMonthlyFamily)*1.25;
	            if(fertilizerNeeded>99){
	                System.out.println("Invalid Amount.");
	             }
	            else {notValid=false;}
	        } catch(Exception e){
	            System.out.println("Enter valid Number");
	        }
	    }while(notValid==true);
	   
	    
	}
}