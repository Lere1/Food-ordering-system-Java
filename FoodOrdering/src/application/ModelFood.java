package application;

public class ModelFood {

	public double calculateSubTotal(double Fries, double Salad, double Hamburger,
			double OnionRing, double ChickenSalad, double FishSandwich, double CheeseSandwich,
			double ChickenSandwich, double HarshBrown, double ToastedBagel, double PineappleStick,
			double ChocolateMuffin, double Pancakes, double Tea, double Cola, double Coffee,
			double Orange, double BottleWater, double VanillaShake, double VanillaCone, 
			double StrawberryShake, double ChocolateMilk) {
		double subTotal = ((2.3*Fries) + (1.9*Salad) + (1.0*Hamburger) + (1.2*OnionRing) + (2.5*ChickenSalad)
				+ (3.0*FishSandwich) + (2.4*CheeseSandwich) + (1.8*ChickenSandwich) + (3.3*HarshBrown) + (2.5*ToastedBagel) 
				+ (1.8*PineappleStick) + (2.4*ChocolateMuffin) + (3.4*Pancakes) + (1.9*Tea) + (1.9*Cola) + (2.1*Coffee)
				+ (2.2*Orange) + (1.0*BottleWater) + (2.5*VanillaShake) + (2.5*VanillaCone) 
				+ (2.0*StrawberryShake) + (2.5*ChocolateMilk))/10;
				
		return subTotal;
		
         }
	
	public double calculateTax(double Fries, double Salad, double Hamburger,
			double OnionRing, double ChickenSalad, double FishSandwich, double CheeseSandwich,
			double ChickenSandwich, double HarshBrown, double ToastedBagel, double PineappleStick,
			double ChocolateMuffin, double Pancakes, double Tea, double Cola, double Coffee,
			double Orange, double BottleWater, double VanillaShake, double VanillaCone, 
			double StrawberryShake, double ChocolateMilk) {
		double subTotal = ((2.3*Fries) + (1.9*Salad) + (1.0*Hamburger) + (1.2*OnionRing) + (2.5*ChickenSalad)
				+ (3.0*FishSandwich) + (2.4*CheeseSandwich) + (1.8*ChickenSandwich) + (3.3*HarshBrown) + (2.5*ToastedBagel) 
				+ (1.8*PineappleStick) + (2.4*ChocolateMuffin) + (3.4*Pancakes) + (1.9*Tea) + (1.9*Cola) + (2.1*Coffee)
				+ (2.2*Orange) + (1.0*BottleWater) + (2.5*VanillaShake) + (2.5*VanillaCone) 
				+ (2.0*StrawberryShake) + (2.5*ChocolateMilk))/10;
				
		double Tax_Rate = 2.7;
	    double tax = (subTotal * Tax_Rate)/100;
	
	    return tax;
	
	}
	
	public double calculateTotal(double Fries, double Salad, double Hamburger,
			double OnionRing, double ChickenSalad, double FishSandwich, double CheeseSandwich,
			double ChickenSandwich, double HarshBrown, double ToastedBagel, double PineappleStick,
			double ChocolateMuffin, double Pancakes, double Tea, double Cola, double Coffee,
			double Orange, double BottleWater, double VanillaShake, double VanillaCone, 
			double StrawberryShake, double ChocolateMilk) {
		double subTotal = ((2.3*Fries) + (1.9*Salad) + (1.0*Hamburger) + (1.2*OnionRing) + (2.5*ChickenSalad)
				+ (3.0*FishSandwich) + (2.4*CheeseSandwich) + (1.8*ChickenSandwich) + (3.3*HarshBrown) + (2.5*ToastedBagel) 
				+ (1.8*PineappleStick) + (2.4*ChocolateMuffin) + (3.4*Pancakes) + (1.9*Tea) + (1.9*Cola) + (2.1*Coffee)
				+ (2.2*Orange) + (1.0*BottleWater) + (2.5*VanillaShake) + (2.5*VanillaCone) 
				+ (2.0*StrawberryShake) + (2.5*ChocolateMilk))/10;
				
		double Tax_Rate = 2.7;
	    double tax = (subTotal * Tax_Rate)/100;
	
	    double total = subTotal + tax;
	
	    return total;
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
