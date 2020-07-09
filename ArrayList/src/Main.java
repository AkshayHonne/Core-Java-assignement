import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(100, "Akshay", "Nashville", 24000);
		Employee e2 = new Employee(200, "Subbu", "MIlwaukee", 34000);
		Employee e3 = new Employee(300, "Ram", "Chicago", 10000);
		Employee e4 = new Employee(400, "Krishna", "Vegas", 50000);
		Employee e5 = new Employee(500, "Raj", "New york", 38000);
		Employee e6 = new Employee(600, "Ashok", "Miami", 1234234);
		
		ArrayList<Employee> user = new ArrayList<>();
		
		user.add(e1);
		user.add(e2);
		user.add(e3);
		user.add(e4);
		user.add(e5);
		user.add(e6);


		  Iterator<Employee> itr=user.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Employee st=(Employee)itr.next();  
		    System.out.println(st.getId()+"     "+st.getName()+"       "+st.getAddress() + "    " + st.getSal());  
		  }
		  
	
		    System.out.println("Enter the ID and Name");
		    @SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

		    System.out.println("ID:");
		    int id = sc1.nextInt();
		    
		    System.out.println("Name:");
		    @SuppressWarnings("unused")
			String F =sc2.nextLine();
		    
		  
		    int count =0;
		    for ( Employee currEmp : user)  
            {  
                
		    	
		    	if((currEmp.getId()==id) && (currEmp.getName().equals(F)))
                {
                    System.out.printf("Employee details are available in the Record.\nBelow the complete details\n");
                    System.out.println("ID: "+ currEmp.getId()+ "\nName: "+ currEmp.getName() +  "\nAddress: " + currEmp.getAddress()+ "\nSalary: " +currEmp.getSal());
                    count++;
                    
                }

			}
	
		    
		    if(count !=1)
		    {
                System.out.printf("Employee details NOT FOUND. Please eter the correct Information ");
		    	
		    }
		    

	}
}
