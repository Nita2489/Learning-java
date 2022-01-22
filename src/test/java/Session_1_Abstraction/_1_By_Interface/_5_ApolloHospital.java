package Session_1_Abstraction._1_By_Interface;

public class _5_ApolloHospital extends _4_GlobalPatientData implements _1_USMedical, _2_UKMedical, _3_IndiaMedical {
	@Override
	public void PhysioService(){
		System.out.println("Apollo - PhysioService");
	}
	@Override
	public void oncologyServices() {
		System.out.println("Apollo - oncologyServices");
	}
	@Override
	public void orthopedicServices() {
		System.out.println("Apollo - orthopedicServices");
	}
	@Override
	public void RadoiLogyServices() {
		System.out.println("Apollo - RadoiLogyServices");
	}
	@Override
	public void ENTServices() {
		System.out.println("Apollo -ENTServices");
	}
	@Override
	public void ambulanceServices() {
		System.out.println("Apollo -ambulanceServices");
	}
	@Override
	public void emergencyServices() {
		System.out.println("Apollo -emergencyServices");
	}
	@Override
	public void neuroServices() {
		System.out.println("Apollo -neuroServices");
	}
	@Override
	public void peditricServices() {
		System.out.println("Apollo -peditricServices");
	}
	
	
	
	
	
	
	
	
	
	
}
