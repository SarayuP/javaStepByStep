
public class CostcoAndCalvinKleinCTshirtCounter{
	private int numberOfCostcoTShirts;
	private int numberOfCalvinKleinTshirts;
	
	public int getNumberOfCostcoTShirts() {
		return numberOfCostcoTShirts;
	}
	public void setNumberOfCostcoTShirts(int numberOfCostcoTShirts) {
		this.numberOfCostcoTShirts = numberOfCostcoTShirts;
	}
	public int getNumberOfCalvinKleinTshirts() {
		return numberOfCalvinKleinTshirts;
	}
	public void setNumberOfCalvinKleinTshirts(int numberOfCalvinKleinTshirts) {
		this.numberOfCalvinKleinTshirts = numberOfCalvinKleinTshirts;
	}
	
	@Override
	public String toString() {
		return "TShirt [numberOfCostcoTShirts=" 
	+ numberOfCostcoTShirts + ", numberOfCalvinKleinTshirts="
				+ numberOfCalvinKleinTshirts + "]";
	}
	
	public static void main(String[] args) {
		CostcoAndCalvinKleinCTshirtCounter ts = new CostcoAndCalvinKleinCTshirtCounter();
		ts.setNumberOfCalvinKleinTshirts(100);
		ts.setNumberOfCostcoTShirts(50);
		System.out.println(ts);
		ts.setNumberOfCalvinKleinTshirts(5);
		System.out.println(ts);


	}
	

}
