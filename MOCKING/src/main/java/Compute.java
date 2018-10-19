public class Compute implements ICompute {
   
	ICompute obj;
	public int SquareVar(int a)
	{
		return obj.SquareVar(a);
			
	}
    
	public int Multiply(int a, int b)
	{
		return obj.Multiply(a,b);
		
	}
	
	public void setobj(ICompute obj) 
	{
       this.obj = obj;
	}
}

