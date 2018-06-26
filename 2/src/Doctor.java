public class Doctor extends Info{
		
		private String speciality;
		private int room;
		
		public String getSpeciality(){
			return this.speciality;
		}
		
		public void setSpeciality(String value){
			this.speciality = value;
		}
		
		public int getRoom(){
			return this.room;
		}
		
		public void setRoom(int value){
			this.room = value;
		}
		
		Doctor(){
			System.out.println(this.getClass().getName());
		}
	}