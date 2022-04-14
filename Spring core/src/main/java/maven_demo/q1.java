package maven_demo;

public class q1 {
		String street;
		String city;
		String state;
		long zip;
		String country;
			
		public void setStreet(String street) {
			this.street = street;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setZip(long zip) {
			this.zip = zip;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		 
		
		public void adr() {
			System.out.println("Address : ( Street : "+street+" City : "+city+" State : "+state+" zip : "+zip+" Counrty : "+country+")");
		}

	}
	
	


