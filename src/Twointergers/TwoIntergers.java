package Twointergers;

public class TwoIntergers {

	private int num1;
	private int num2;
	
	public TwoIntergers()
	{
		num1 = 0;
		num2 = 0;
	}
	
	public TwoIntergers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	// RETURN METHOD
	
	public String compare()
	{
		
		if(num1 > num2)
		{
			return  num1 + " is larger, if you didn't already know.";
		}

		else if(num2>num1)
		{
			return num2 + " is larger, but I bet you knew that.";
		}
		
		else
		{
			return "These numbers are equal, fyi.";
		}
}
	// ARITHMETIC METHOD
	
	public String arithmetic()
	{
		String math = "";
		math = "\n added  " + (num1 + num2);
	    math = math + "\n subtracted " + (num1 - num2);
	    math = math +  "\n multiplied " + (num1 * num2);
	    math = math + "\n divided " + (num1 / num2);
	    math = math +  "\n remainder" + (num1 % num2);
		return math;
	}
	
	// GET METHODS
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	
	// SET METHOD
	
	public void setNum1(int num1, int num2)
	{
		this.num1 = num1;
	}
	public void setNum2()
	{
		this.num2 = num2;
	}
	
	// EVEN OR ODD METHOD
	
	//NUM1
	public boolean even()
	{
	
		if (num1 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//NUM2
	public boolean evenTwo()
	{
		
		if (num2 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean multiple()
	{

		if (num1 % num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
}
