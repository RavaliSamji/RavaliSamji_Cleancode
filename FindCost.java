
public class FindCost {
	float res;
	public void selectChoice(String mat_sat,int area,boolean choice) {
		if (mat_sat=="standardmaterials") {
			res=1200*area;
			System.out.format("The total cost is %f ",res);
		}
		if (mat_sat=="abovestandardmaterials") {
			res=1500*area;
			System.out.format("The total cost is %f ",res);
		}
		if (mat_sat=="highstandardmaterials" && choice==false) {
			res=1800*area;
			System.out.format("The total cost is %f ",res);
		}
		if (mat_sat=="highstandardmaterials" && choice==true) {
			res=2500*area;
			System.out.format("The total cost is %f ",res);
		}
		
	}
	
}
