package Session_1_Abstraction._1_By_Interface;

public class TestHospital {
	public static void main(String[] args) {
		
		_5_ApolloHospital ap = new _5_ApolloHospital();
		 ap.ambulanceServices();
		 ap.emergencyServices();
		 ap.ENTServices();
		 ap.neuroServices();
		 ap.orthopedicServices();
		 ap.RadioLogyServices();
		 ap.getPatientHistory();
	}

}
