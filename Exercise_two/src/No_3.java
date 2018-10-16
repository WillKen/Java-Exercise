
public class No_3 {

	public static class vehicle{
		int modelNumber,seatingCapacity,tireSize,length,width,height,dischargeCapacity, power, torque, cylinders;
		public vehicle() {
			modelNumber=2018;
			seatingCapacity=4;
			tireSize=1;
			length=4;
			height=2;
			dischargeCapacity=25;
			power=5000;
			torque=123;
			cylinders=555;
		}
		public void show() {
			System.out.println("This is a vehicle:");
			System.out.println("modelNumber: "+modelNumber);
			System.out.println("seatingCapacity: "+seatingCapacity);
			System.out.println("tireSize: "+tireSize);
			System.out.println("length: "+length);
			System.out.println("height: "+height);
			System.out.println("dischargeCapacity: "+dischargeCapacity);
			System.out.println("power: "+power);
			System.out.println("torque: "+torque);
			System.out.println("cylindersr: "+cylinders);
			System.out.println();
		}
	}
	public static class NewEnergyVehicle extends vehicle{
		int batteryCapacity;
		public NewEnergyVehicle() {
			batteryCapacity=100;
		}
		public void show() {
			System.out.println("This is a vehicle:");
			System.out.println("modelNumber: "+modelNumber);
			System.out.println("seatingCapacity: "+seatingCapacity);
			System.out.println("tireSize: "+tireSize);
			System.out.println("length: "+length);
			System.out.println("height: "+height);
			System.out.println("dischargeCapacity: "+dischargeCapacity);
			System.out.println("power: "+power);
			System.out.println("torque: "+torque);
			System.out.println("cylindersr: "+cylinders);
			System.out.println("batteryCapacity: "+batteryCapacity);
			System.out.println();
		}
	}
	public static class PureElectricVehicle extends vehicle{
		int MaximumRange;
		public PureElectricVehicle() {
			MaximumRange=200;
		}
		public void show() {
			System.out.println("This is a vehicle:");
			System.out.println("modelNumber: "+modelNumber);
			System.out.println("seatingCapacity: "+seatingCapacity);
			System.out.println("tireSize: "+tireSize);
			System.out.println("length: "+length);
			System.out.println("height: "+height);
			System.out.println("dischargeCapacity: "+dischargeCapacity);
			System.out.println("power: "+power);
			System.out.println("torque: "+torque);
			System.out.println("cylindersr: "+cylinders);
			System.out.println("MaximumRange: "+MaximumRange);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		vehicle v1=new vehicle();
		NewEnergyVehicle v2=new NewEnergyVehicle();
		PureElectricVehicle v3=new PureElectricVehicle();
		v1.show();
		v2.show();
		v3.show();
	}

}
