class TemperatureChecking
{
float celsius;
float fahrenheit;
    
void setTemp(float c)

{ 
celsius = c;
fahrenheit = c*(9/5) + 32;
}

void display()

{
 System.out.println("Celsius : " + celsius);
 System.out.println("Fahrenheit : " + fahrenheit);
}

public static void main(String args[])
{
TemperatureChecking temp = new TemperatureChecking();

temp.setTemp(35);
temp.display();
}
}