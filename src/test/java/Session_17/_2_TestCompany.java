package Session_17;


public class _2_TestCompany {
	public static void main(String args[]) {
		_1_Company_Encapsulation comp = new _1_Company_Encapsulation();
		
		comp.setName("Alphabet corporation");
		System.out.println("Company Name is -> ");
		System.out.println(comp.getName());
		System.out.println("-----------------------");
		
		comp.setLogo("https://www.youtube.com/watch?v=9m78hov10Tc&list=PLYPnRG6KpcaU6WarygpObJtKlI1QUWL3w&index=17&t=1351s");
		System.out.println("Company logo URL -> ");
		System.out.println(comp.getLogo());
		System.out.println("------------------------");
		
		comp.setEmpCount();
		System.out.println("Company employee capacity is -> ");
		System.out.println(comp.getEmpCount() + "for all of them we are providing 10% hike this year");
		System.out.println("--------------------------");
		
		comp.setEngine("google");
		System.out.println("Company is using search Engineering asEngineering -> ");
		System.out.println(comp.getEngine());
		System.out.println("---------------------------");
		
		comp.setRevenue(1_00_00_000);
		System.out.println("Company yearly revenue is -> ");
		System.out.println(comp.getRevenue());
		System.out.println("---------------------------");
		
		
		
	}

}
