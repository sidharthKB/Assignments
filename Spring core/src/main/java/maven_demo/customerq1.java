package maven_demo;

public class customerq1 {

		private String customerName;
		private String customerAddress;
		private int customerId;
		private int customerContact;
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerAddress() {
			return customerAddress;
		}
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public int getCustomerContact() {
			return customerContact;
		}
		public void setCustomerContact(int customerContact) {
			this.customerContact = customerContact;
		}
		public void details() {
			System.out.println("customerName="+customerName+",customerAddress="+customerAddress+",customerId="+customerId+",customerContact="+customerContact);
		}
		

	}


