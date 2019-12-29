package application;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;

public class ControllerFood {

	@FXML
	private Button btExit;
	@FXML
	private Button btReset;
	@FXML
	private Button btTotal;
	@FXML
	private TextField tfFries;
	@FXML
	private TextField tfSalad;
	@FXML
	private TextField tfHamburger;
	@FXML
	private TextField tfOnionRing;
	@FXML
	private TextField tfChickenSalad;
	@FXML
	private TextField tfFishSandwich;
	@FXML
	private TextField tfCheeseSandwich;
	@FXML
	private TextField tfChickenSandwich;
	@FXML
	private TextField tfHarshBrown;
	@FXML
	private TextField tfToastedBagel;
	@FXML
	private TextField tfPineappleStick;
	@FXML
	private TextField tfChocolateMuffin;
	@FXML
	private TextField tfPancakes;
	@FXML
	private TextField tfTea;
	@FXML
	private TextField tfCola;
	@FXML
	private TextField tfCoffee;
	@FXML
	private TextField tfOrange;
	@FXML
	private TextField tfBottleWater;
	@FXML
	private TextField tfVanillaShake;
	@FXML
	private TextField tfVanillaCone;
	@FXML
	private TextField tfStrawberryShake;
	@FXML
	private TextField tfChocolateMilk;
	//======================================
	@FXML
	private CheckBox chkFries;
	@FXML
	private CheckBox chkSalad;
	@FXML
	private CheckBox chkHamburger;
	@FXML
	private CheckBox chkOnionRing;
	@FXML
	private CheckBox chkChickenSalad;
	@FXML
	private CheckBox chkFishSandwich;
	@FXML
	private CheckBox chkCheeseSandwich;
	@FXML
	private CheckBox chkChickenSandwich;
	@FXML
	private CheckBox chkHarshBrown;
	@FXML
	private CheckBox chkToastedBagel;
	@FXML
	private CheckBox chkPineappleStick;
	@FXML
	private CheckBox chkChocolateMuffin;
	@FXML
	private CheckBox chkPancakes;
	@FXML
	private CheckBox chkTea;
	@FXML
	private CheckBox chkCola;
	@FXML
	private CheckBox chkCoffee;
	@FXML
	private CheckBox chkOrange;
	@FXML
	private CheckBox chkBottleWater;
	@FXML
	private CheckBox chkVanillaShake;
	@FXML
	private CheckBox chkVanillaCone;
	@FXML
	private CheckBox chkStrawberryShake;
	@FXML
	private CheckBox chkChocolateMilk;
	//=================================
	@FXML
	private TextField tfCash;
	@FXML
	private TextField tfChange;
	@FXML
	private TextField tfTax;
	@FXML
	private TextField tfSubTotal;
	@FXML
	private TextField tfTotal;
	@FXML
	private ComboBox<String> cmbPaymentMethod;
	@FXML
	private String myCash;
	@FXML
	private String myDebitCard;
	@FXML
	private String myMasterCard;
	@FXML
	private String myVisaCard;
	
	
	private double Fries ;
	private double Salad ;
	private double Hamburger ;
	private double OnionRing ;
	private double ChickenSalad ;
	private double FishSandwich ;
	private double CheeseSandwich ;
	private double ChickenSandwich ;
	private double HarshBrown ;
	private double ToastedBagel ;
	private double PineappleStick ;
	private double ChocolateMuffin ;
	private double Pancakes ;
	private double Tea ;
	private double Cola ;
	private double Coffee ;
	private double Orange ;
	private double BottleWater ;
	private double VanillaShake ;
	private double VanillaCone ;
	private double StrawberryShake ;
	private double ChocolateMilk ;
	
	
	double iCost, iCash, iChange, iTax, iSubTotal, iTotal;
	
	
	private ModelFood model = new ModelFood();
	
	
    public void total() {
    	double value = 0;
    	Fries = Double.parseDouble(tfFries.getText() + value);
    	Salad = Double.parseDouble(tfSalad.getText() + value);
    	Hamburger = Double.parseDouble(tfHamburger.getText() + value);
    	OnionRing = Double.parseDouble(tfOnionRing.getText() + value);
    	ChickenSalad = Double.parseDouble(tfChickenSalad.getText() + value);
    	FishSandwich = Double.parseDouble(tfFishSandwich.getText() + value);
    	CheeseSandwich = Double.parseDouble(tfCheeseSandwich.getText() + value);
    	ChickenSandwich = Double.parseDouble(tfChickenSandwich.getText() + value);
    	HarshBrown = Double.parseDouble(tfHarshBrown.getText() + value);
    	ToastedBagel = Double.parseDouble(tfToastedBagel.getText() + value);
    	PineappleStick = Double.parseDouble(tfPineappleStick.getText() + value);
    	ChocolateMuffin = Double.parseDouble(tfChocolateMuffin.getText() + value);
    	Pancakes = Double.parseDouble(tfPancakes.getText() + value);
    	Tea = Double.parseDouble(tfTea.getText() + value);
    	Cola = Double.parseDouble(tfCola.getText() + value);
    	Coffee = Double.parseDouble(tfCoffee.getText() + value);
    	Orange = Double.parseDouble(tfOrange.getText() + value);
    	BottleWater = Double.parseDouble(tfBottleWater.getText() + value);
    	VanillaShake = Double.parseDouble(tfVanillaShake.getText() + value);
    	VanillaCone = Double.parseDouble(tfVanillaCone.getText() + value);
    	StrawberryShake = Double.parseDouble(tfStrawberryShake.getText() + value);
    	ChocolateMilk = Double.parseDouble(tfChocolateMilk.getText() + value);
    	
    	iCash = Double.parseDouble(tfCash.getText());
    	//iChange = Double.parseDouble(tfChange.getText() + value);
    	
    		
        String paymentMethod = (String)cmbPaymentMethod.getValue();
    
    if(paymentMethod != null && paymentMethod == myCash) {	
    	
    	       String subTotal;
    	
    	       iSubTotal = model.calculateSubTotal(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			         FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				         ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				         Orange, BottleWater, VanillaShake, VanillaCone, 
				         StrawberryShake, ChocolateMilk);
    	
    	if(iCash >= iSubTotal) {
    		
    	        subTotal = String.format("$%.2f" , iSubTotal);
    	               tfSubTotal.setText(subTotal);
    		
    	        String Tax;
    	        iTax = model.calculateTax(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			      FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				      ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				      Orange, BottleWater, VanillaShake, VanillaCone, 
				      StrawberryShake, ChocolateMilk);
    	        Tax = String.format("$%.2f" , iTax);
    	        tfTax.setText(Tax);
    	
    	        String Total;
    	        iTotal = model.calculateTotal(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			      FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				      ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				      Orange, BottleWater, VanillaShake, VanillaCone, 
				      StrawberryShake, ChocolateMilk);
    	       Total = String.format("$%.2f" , iTotal);
    	       tfTotal.setText(Total);
    	
               String Change;
    	       Change = String.format("$%.2f", iCash - (iSubTotal + iTax));
    	       tfChange.setText(Change); 
    	      
    	} else {
    		     Alert alert = new Alert(AlertType.ERROR);
    		     alert.setTitle("Error Dialog");
                 alert.setHeaderText("");
                 alert.setContentText("Enter enough cash!");
                 alert.showAndWait();
                 
    	}
    	
    } else if(paymentMethod == myDebitCard || paymentMethod == myMasterCard || paymentMethod == myVisaCard) {
          String subTotal;
    	
    	iSubTotal = model.calculateSubTotal(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				Orange, BottleWater, VanillaShake, VanillaCone, 
				StrawberryShake, ChocolateMilk);
    		
    	subTotal = String.format("$%.2f" , iSubTotal);
    	tfSubTotal.setText(subTotal);
    		
    	String Tax;
    	iTax = model.calculateTax(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				Orange, BottleWater, VanillaShake, VanillaCone, 
				StrawberryShake, ChocolateMilk);
    	Tax = String.format("$%.2f" , iTax);
    	tfTax.setText(Tax);
    	
    	String Total;
    	iTotal = model.calculateTotal(Fries, Salad, Hamburger, OnionRing, ChickenSalad, 
    			FishSandwich, CheeseSandwich, ChickenSandwich, HarshBrown, ToastedBagel, PineappleStick,
				ChocolateMuffin, Pancakes, Tea, Cola, Coffee,
				Orange, BottleWater, VanillaShake, VanillaCone, 
				StrawberryShake, ChocolateMilk);
    	Total = String.format("$%.2f" , iTotal);
    	tfTotal.setText(Total);
    	
    }
    	
	}
		
	
	
	public void exit() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		String s = "Are you sure you want to exit food ordering system?";
		alert.setContentText(s);
		Optional<ButtonType> result = alert.showAndWait();
		
		if((result.isPresent()) && (result.get() == ButtonType.OK)) {
			System.exit(0);
		}
	}
	
	public void reset() {
	    tfFries.clear();
        tfSalad.clear();
		tfHamburger.clear();
		tfOnionRing.clear();
		tfChickenSalad.clear();
		tfFishSandwich.clear();
		tfCheeseSandwich.clear();
		tfChickenSandwich.clear();
		tfHarshBrown.clear();
		tfToastedBagel.clear();
		tfPineappleStick.clear();
		tfChocolateMuffin.clear();
		tfPancakes.clear();
		tfTea.clear();
		tfCola.clear();
		tfCoffee.clear();
		tfOrange.clear();
		tfBottleWater.clear();
		tfVanillaShake.clear();
		tfVanillaCone.clear();
		tfStrawberryShake.clear();
		tfChocolateMilk.clear();
		//=============================
		tfFries.setDisable(true);
		tfSalad.setDisable(true);
		tfHamburger.setDisable(true);
		tfOnionRing.setDisable(true);
		tfChickenSalad.setDisable(true);
		tfFishSandwich.setDisable(true);
		tfCheeseSandwich.setDisable(true);
		tfChickenSandwich.setDisable(true);
		tfHarshBrown.setDisable(true);
		tfToastedBagel.setDisable(true);
		tfPineappleStick.setDisable(true);
		tfChocolateMuffin.setDisable(true);
		tfPancakes.setDisable(true);
		tfTea.setDisable(true);
		tfCola.setDisable(true);
		tfCoffee.setDisable(true);
		tfOrange.setDisable(true);
		tfBottleWater.setDisable(true);
		tfVanillaShake.setDisable(true);
		tfVanillaCone.setDisable(true);
		tfStrawberryShake.setDisable(true);
		tfChocolateMilk.setDisable(true);
		//=============================
		chkFries.setSelected(false);
		chkSalad.setSelected(false);
		chkHamburger.setSelected(false);
		chkOnionRing.setSelected(false);
		chkChickenSalad.setSelected(false);
		chkFishSandwich.setSelected(false);
		chkCheeseSandwich.setSelected(false);
		chkChickenSandwich.setSelected(false);
		chkHarshBrown.setSelected(false);
		chkToastedBagel.setSelected(false);
		chkPineappleStick.setSelected(false);
		chkChocolateMuffin.setSelected(false);
		chkPancakes.setSelected(false);
		chkTea.setSelected(false);
		chkCola.setSelected(false);
		chkCoffee.setSelected(false);
		chkOrange.setSelected(false);
		chkBottleWater.setSelected(false);
		chkVanillaShake.setSelected(false);
		chkVanillaCone.setSelected(false);
		chkStrawberryShake.setSelected(false);
		chkChocolateMilk.setSelected(false);
		//=============================
		tfCash.setText("0");
		tfChange.clear();
		tfTax.clear();
		tfSubTotal.clear();
		tfTotal.clear();
		
		}
	
	//Key event======================
	
	public void tfKeyFries(KeyEvent e) {
		String str = e.getCharacter();
		int len = str.length();
		for(int i = 0; i < len; i++) {
				Character c = str.charAt(i);
				if(Character.isLetter(c)) {
					e.consume();
				}
		}
	}
	//Disable Textfield===================
	  public void fries() {
		if (chkFries.isSelected()) {
			tfFries.setDisable(false);
			tfFries.requestFocus();
		} else {
			tfFries.setDisable(true);
		}
	}
	  
	  public void salad() {
			if (chkSalad.isSelected()) {
				tfSalad.setDisable(false);
				tfSalad.requestFocus();
			} else {
				tfSalad.setDisable(true);
			}
		}
	  public void hamburger() {
			if (chkHamburger.isSelected()) {
				tfHamburger.setDisable(false);
				tfHamburger.requestFocus();
			} else {
				tfHamburger.setDisable(true);
			}
		}
	  public void onionRing() {
			if (chkOnionRing.isSelected()) {
				tfOnionRing.setDisable(false);
				tfOnionRing.requestFocus();
			} else {
				tfOnionRing.setDisable(true);
			}
		}
	  public void chickenSalad() {
			if (chkChickenSalad.isSelected()) {
				tfChickenSalad.setDisable(false);
				tfChickenSalad.requestFocus();
			} else {
				tfChickenSalad.setDisable(true);
			}
		}
	  public void fishSandwich() {
			if (chkFishSandwich.isSelected()) {
				tfFishSandwich.setDisable(false);
				tfFishSandwich.requestFocus();
			} else {
				tfFishSandwich.setDisable(true);
			}
		}
	  public void cheeseSandwich() {
			if (chkCheeseSandwich.isSelected()) {
				tfCheeseSandwich.setDisable(false);
				tfCheeseSandwich.requestFocus();
			} else {
				tfCheeseSandwich.setDisable(true);
			}
		}
	  public void chickenSandwich() {
			if (chkChickenSandwich.isSelected()) {
				tfChickenSandwich.setDisable(false);
				tfChickenSandwich.requestFocus();
			} else {
				tfChickenSandwich.setDisable(true);
			}
		}
	  public void harshBrown() {
			if (chkHarshBrown.isSelected()) {
				tfHarshBrown.setDisable(false);
				tfHarshBrown.requestFocus();
			} else {
				tfHarshBrown.setDisable(true);
			}
		}
	  public void toastedBagel() {
			if (chkToastedBagel.isSelected()) {
				tfToastedBagel.setDisable(false);
				tfToastedBagel.requestFocus();
			} else {
				tfToastedBagel.setDisable(true);
			}
		}
	  public void pineappleStick() {
			if (chkPineappleStick.isSelected()) {
				tfPineappleStick.setDisable(false);
				tfPineappleStick.requestFocus();
			} else {
				tfPineappleStick.setDisable(true);
			}
		}
	  public void chocolateMuffin() {
			if (chkChocolateMuffin.isSelected()) {
				tfChocolateMuffin.setDisable(false);
				tfChocolateMuffin.requestFocus();
			} else {
				tfChocolateMuffin.setDisable(true);
			}
		}
	  public void pancakes() {
			if (chkPancakes.isSelected()) {
				tfPancakes.setDisable(false);
				tfPancakes.requestFocus();
			} else {
				tfPancakes.setDisable(true);
			}
		}
	  public void tea() {
			if (chkTea.isSelected()) {
				tfTea.setDisable(false);
				tfTea.requestFocus();
			} else {
				tfTea.setDisable(true);
			}
		}
	  public void cola() {
			if (chkCola.isSelected()) {
				tfCola.setDisable(false);
				tfCola.requestFocus();
			} else {
				tfCola.setDisable(true);
			}
		}
	  public void coffee() {
			if (chkCoffee.isSelected()) {
				tfCoffee.setDisable(false);
				tfCoffee.requestFocus();
			} else {
				tfCoffee.setDisable(true);
			}
		}
	  public void orange() {
			if (chkOrange.isSelected()) {
				tfOrange.setDisable(false);
				tfOrange.requestFocus();
			} else {
				tfOrange.setDisable(true);
			}
		}
	  public void bottleWater() {
			if (chkBottleWater.isSelected()) {
				tfBottleWater.setDisable(false);
				tfBottleWater.requestFocus();
			} else {
				tfBottleWater.setDisable(true);
			}
		}
	  public void vanillaShake() {
			if (chkVanillaShake.isSelected()) {
				tfVanillaShake.setDisable(false);
				tfVanillaShake.requestFocus();
			} else {
				tfVanillaShake.setDisable(true);
			}
		}
	  public void vanillaCone() {
			if (chkVanillaCone.isSelected()) {
				tfVanillaCone.setDisable(false);
				tfVanillaCone.requestFocus();
			} else {
				tfVanillaCone.setDisable(true);
			}
		}
	  public void strawberryShake() {
			if (chkStrawberryShake.isSelected()) {
				tfStrawberryShake.setDisable(false);
				tfStrawberryShake.requestFocus();
			} else {
				tfStrawberryShake.setDisable(true);
			}
		}
	  public void chocolateMilk() {
			if (chkChocolateMilk.isSelected()) {
				tfChocolateMilk.setDisable(false);
				tfChocolateMilk.requestFocus();
			} else {
				tfChocolateMilk.setDisable(true);
			}
		}



	
}












