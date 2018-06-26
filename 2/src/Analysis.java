import java.util.*;

public class Analysis{
		
		private String type;
		private String additionalInfo;
		private Date date;
		private String result;
		
		public Date getDate(){
			return this.date;
		}
		
		public void setDate(Date value){
			this.date = value;
		}
		
		public String getType(){
			return this.type;
		}
		
		public void setType(String value){
			this.type = value;
		}
		
		public String getInfo(){
			return this.additionalInfo;
		}
		
		public void setInfo(String value){
			this.additionalInfo = value;
		}
		
		public String getResult(){
			return this.result;
		}
		
		public void setResult(String value){
			this.result = value;
		}
		
		Analysis(){
			System.out.println(this.getClass().getName());
		}
}