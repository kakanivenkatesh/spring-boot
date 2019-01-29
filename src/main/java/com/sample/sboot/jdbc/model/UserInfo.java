package com.sample.sboot.jdbc.model;

public class UserInfo {
	
		private String empName;
		private String empEmail;


		public String getEmpName() {
			return empName;
		}


		public void setEmpName(String empName) {
			this.empName = empName;
		}


		public String getEmpEmail() {
			return empEmail;
		}


		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}


		@Override
		public String toString() {
			return "UserInfo ployee [empName=" + empName + ", empEmail=" + empEmail + "]";
		}

}

