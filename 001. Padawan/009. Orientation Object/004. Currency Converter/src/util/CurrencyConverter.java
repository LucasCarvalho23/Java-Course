package util;

public class CurrencyConverter {
	
	public static double reais(double dollarPrice, double dollarValue) {
		double percentage = ((dollarPrice * dollarValue) * 6) / 100;
		return (dollarPrice * dollarValue) + percentage;
	}

}
