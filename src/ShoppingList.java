import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String itemIn;
		String answer;

		System.out.println("Welcome to Cheo's Market!!!");

		HashMap<String, Double> itemMenu = new HashMap<String, Double>();
		itemMenu.put("milk", 2.99);
		itemMenu.put("eggs", 1.99);
		itemMenu.put("butter", 4.79);
		itemMenu.put("chips", 1.69);
		itemMenu.put("juice", 2.79);
		itemMenu.put("pop", 0.99);
		itemMenu.put("water", 4.99);
		itemMenu.put("cheese", 3.99);

		ArrayList<String> order = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();

		for (String variableName : itemMenu.keySet()) {
			String variableKey = variableName;
			Double variableValue = itemMenu.get(variableName);

			System.out.print("Item: " + variableKey + "	");
			System.out.println(" Price: " + variableValue);
		}
		do {
			System.out.println("What item would you like to order?  ");
			itemIn = input.nextLine().toLowerCase();

			if (itemMenu.containsKey(itemIn)) {
				order.add(itemIn);
				price.add(itemMenu.get(itemIn));
				System.out.println("Adding " + order + " cart at " + price);

			} else {
				System.out.println("Item not available");
			}

			System.out.println("Would you like to order another item?  Yes or no");
			answer = input.nextLine();

		} while (answer.equalsIgnoreCase("yes"));
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got: ");

		for (int i = 0; i < order.size(); i++) {			
			System.out.println(order.get(i) + "		" + price.get(i));
					}
		System.out.print("The average price for your order is: ");
		System.out.println(averagePrice(price));
		System.out.println();
		
		System.out.print("The max price for your order is: ");
		System.out.println(max(price));
		
		System.out.print("The minimum price for your order is: ");
		System.out.println(min(price));
				

		System.out.println("Have a nice day!");

		input.close();
	}

	public static Double averagePrice(ArrayList<Double> ordered) {
		Double averagePrice = 0.0;
		for (int i = 0; i < ordered.size(); i++) {
			Double item = ordered.get(i);
			averagePrice += item;
		}
		return averagePrice / ordered.size();
	}

	public static int max(ArrayList<Double> maxPrice) {
		int index = 0;
		double price = 0;

		for (int i = 0; i < maxPrice.size(); i++) {
			if (maxPrice.get(i) > price ) {
				price = maxPrice.get(i);
				index = i;
			}
		}
		return index;
	}
	public static int min(ArrayList<Double> minPrice)   {
		int index = 0;
		double price = 0;
		
		for (int i = 0; i < minPrice.size(); i++) {
			if(price > minPrice.get(i)) {
				price = minPrice.get(i);
				index = i;
			}
		}
			return index;
		
		}
	}

