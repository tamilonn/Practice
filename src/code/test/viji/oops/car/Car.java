package code.test.viji.oops.car;

public abstract class Car {
	
		private String carName = "";
		private int carNo = 0;
		
		public Car() {
			
		}
		public Car(String name,int no) {
			this.carName = name;
			this.carNo = no;
		}
		public String brake() {
			System.out.println(carName+"is braking");
			return carName+"is braking";
		}
		public String speed() {
			System.out.println(carName+"is speeding");
			return carName+"is braking";
		}
		
		
		@Override
		public String toString() {
			return "Car [carName=" + carName + ", carNo=" + carNo + "]";
		}
		public String getCarName() {
			return carName;
		}
		public void setCarName(String carName) {
			this.carName = carName;
		}
		public int getCarNo() {
			return carNo;
		}
		public void setCarNo(int carNo) {
			this.carNo = carNo;
		}
		public void testDrive() {
			StringBuffer sb = new StringBuffer().append("The Test Drive").append(carName).append("has are.....").append("1")
					.append(brake()).append("2").append(speed());
		}

}
