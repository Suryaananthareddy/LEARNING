package TemperatureConverter;

import java.util.Scanner;

public class TheTemperatureConverterApp {
	public static void main(Strings []args);
	Scanner scan=new Scanner(System.in);
	System.out.println("convert temperature as celsius to fahrenheit");
	double celsius=scan.nextDouble();
	double fahrenheit=scan.nextDouble();
	TheTemperatureConverter theTemperatureConverter=new TheTemperatureConverter( celsius, fahrenheit);
	TheTemperatureConverter.convertFahrenheitToCelsius(double fahrenheit);

}
