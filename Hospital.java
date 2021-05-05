
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Hospital {
	
	String hospital_Name;
	String hospital_Location;
	ArrayList<Patient> patient_list=new ArrayList<>();
	int countBanglore=0,registrationsTenure;
	
	public Hospital(String name,String location)
	{
		hospital_Name=name;
		hospital_Location=location;
	}
	
	//adds patient objects to the array list
	public void patientList(Patient...args)
	{
		System.out.println(args);
		for(Patient i:args)
		{
			patient_list.add(i);
		}
	}
	
	//prints the list of patients
	public void showPatientList()
	{
		for(int i=0;i< patient_list.size();i++)
		{	
			System.out.println(patient_list.get(i).patient_Name + " "+patient_list.get(i).patinet_Location
			+" "+ patient_list.get(i).dateOfRegestration);
		
		}
	}
	
	//Calculates the percentage of patients from and outside of banglore in the given tenure and return the value
	public String calculateBanglorePatientPercent(int tenure)
	{

		for(int i=0;i< patient_list.size();i++)
		{	
			
			if(calculateDateDifference(patient_list.get(i).dateOfRegestration,tenure))
			
			{
				if((patient_list.get(i).patinet_Location).equalsIgnoreCase("banglore"))
				{	
					countBanglore+=1;
				}
				registrationsTenure+=1;
			}
		   
		}
		double banglorePercent=(double)countBanglore/(double)registrationsTenure*100;
		double otherPercent=100-banglorePercent;
		banglorePercent =Double.parseDouble(new DecimalFormat("##.##").format(banglorePercent));
		otherPercent =Double.parseDouble(new DecimalFormat("##.##").format(otherPercent));
		String returnString= String.valueOf(registrationsTenure)+"&"+String.valueOf(banglorePercent)+"&"+String.valueOf(otherPercent);		
		return returnString;
		
	}
	
	
	//Check if the Patients registration date falls with the tenure
	public Boolean calculateDateDifference(String pDate,int tenure)
	{
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String todayDate= formatter.format(date);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(pDate, dtf);
		LocalDate date2 = LocalDate.parse(todayDate, dtf);
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		if(daysBetween<0)
		{
			daysBetween=-daysBetween;
		}
		if(daysBetween<=tenure)
		{
			return true;
		}
		
	    return false;
		
	}

}
