import java.util.*;

public class PatientInfo extends Info{
		
		private Date registrationDate;
		
		public Date getDate(){
			return this.registrationDate;
		}
		
		public void setDate(Date value){
			this.registrationDate = value;
		}
		
		PatientInfo(){
			System.out.println(this.getClass().getName());
		}
	}