import java.util.*;

public abstract class Info{
		
		private String name;
		private String id;
		private Date dateOfBirth;
		private String address;
		
		public String getName(){
			return this.name;
		}
		
		public void setName(String value){
			this.name = value;
		}
		
		public String getId(){
			return this.id;
		}
		
		public void setId(String value){
			this.id = value;
		}
		
		public Date getDateOfBirth(){
			return this.dateOfBirth;
		}
		
		public void setDateOfBirth(Date value){
			this.dateOfBirth = value;
		}
		
		public String getAddress(){
			return this.address;
		}
		
		public void setAddress(String value){
			this.address = value;
		}
	}