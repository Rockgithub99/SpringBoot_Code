package com.example.clientService.entity;


public class SmartPhone {
	

	
		private int phoneid;
		private String phonename;
		private String phonemodel;
		
		
		


		public SmartPhone() {
			super();
			// TODO Auto-generated constructor stub
		}


		public SmartPhone(int phoneid, String phonename, String phonemodel) {
			super();
			this.phoneid = phoneid;
			this.phonename = phonename;
			this.phonemodel = phonemodel;
		}


		public int getPhoneid() {
			return phoneid;
		}


		public void setPhoneid(int phoneid) {
			this.phoneid = phoneid;
		}


		public String getPhonename() {
			return phonename;
		}


		public void setPhonename(String phonename) {
			this.phonename = phonename;
		}


		public String getPhonemodel() {
			return phonemodel;
		}


		public void setPhonemodel(String phonemodel) {
			this.phonemodel = phonemodel;
		}


		@Override
		public String toString() {
			return "SmartPhone [phoneid=" + phoneid + ", phonename=" + phonename + ", phonemodel=" + phonemodel + "]";
		}

		
}
