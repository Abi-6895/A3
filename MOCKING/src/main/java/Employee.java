
public class Employee implements IEmployee {

	IEmployee obj;
	public int salary;
	
	public Employee(int salary)
	{
		this.salary = salary;
	}
	public void setsalary(int salary)
	{
		this.salary = salary;
	}
	
	public int getsalary() {
		return salary;
	}
	public void setObj(IEmployee obj)
	 {
		 this.obj = obj;
		 
		
	}
	
 public double computeTax(int amount)	
{
	return obj.computeTax(amount);
	
	}

public double weeklySalary(Employee emp1) 
{
	return obj.weeklySalary(emp1);
	
			
}
public double fortnightSalary(Employee emp2)
{
	return obj.fortnightSalary(emp2);
			
}
public double computeKiwiSaver(Employee kiwioption) 
{
	return obj.computeKiwiSaver(kiwioption);
}
 
}
