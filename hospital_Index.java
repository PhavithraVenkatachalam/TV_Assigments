
public class hospital_Index {

	public static void main(String args[])
	{
		int tenure=10;
		Hospital hospital=new Hospital("chinniya missions one","banglore");
		Patient patient1=new Patient("P1","banglore","08/09/2020");
		Patient patient2=new Patient("P2","banglore","20/04/2021");
		Patient patient3=new Patient("P3","TN","01/05/2021");
		Patient patient4=new Patient("P4","banglore","05/05/2021");
		Patient patient5=new Patient("P5","TN","05/05/2021");
		Patient patient6=new Patient("P6","banglore","05/05/2021");
		hospital.patientList(patient1,patient2,patient3,patient4,patient5,patient6);
		String result=hospital.calculateBanglorePatientPercent(tenure);
		printResult(result,tenure);
		
		
	}

	private static void printResult(String result,int tenure) {
		String[] percent=result.split("&");
		System.out.println("Welcome to Chinmaya Mission Hospitals");
		System.out.println("From last "+tenure+" days "+percent[0]+" OP registrations took place of which "
		+percent[1]+"% are from bangalore and "+percent[2]+"%  are outstation.");
		
	}
}
