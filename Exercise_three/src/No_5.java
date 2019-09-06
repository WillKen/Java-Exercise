import java.util.Date;

public class No_5 {
	public static void main(String args[]){
		Customer a = new Customer("张伟焜");
		Date date = new Date();
		Visit test = new Visit(a,date);
		test.setServiceExpense(300);
		test.setProductExpense(400);
		System.out.println(test);
		System.out.println();
		a.setMemberType("Premium");
		System.out.println(test);
		System.out.println();
		a.setMemberType("Gold");
		System.out.println(test);
		System.out.println();
		a.setMemberType("Silver");
		System.out.println(test);
	}
}

class Customer
{
	private String name;
	private boolean member = false;
	private String memberType;
	public Customer(String name){
		this.name = name;
		member = false;
		memberType = " null";
	}
	public String getName() {
		return name;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String type) {
		this.memberType = type;
		this.member = true;
	}
	public String toString() {
		if(isMember())
			return getMemberType() + " 客户 : " + getName();
		else
			return "客户: "+getName() + getMemberType();
	}	
}

class Visit 
{
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
		this.serviceExpense = 0.0;
		this.productExpense = 0.0;
	}
	public String getName() {
		return customer.getName();
	}
	public double getServiceExpense() {
		return this.serviceExpense;
	}
	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}
	public double getProductExpense() {
		return this.productExpense;
	}
	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	public double getTotalExpense() {
		double s = DiscountRate.getServiceDiscountRate(customer.getMemberType());
		double p = DiscountRate.getProductDiscountRate(customer.getMemberType());
		return this.serviceExpense*(1-s)+this.productExpense*(1-p);
	}
	public String toString() {
		return "消费时间: "+ date + "\n 客户: "+getName()+"\n会员类型: "+customer.getMemberType()+"\n消费总计: "+getTotalExpense();
		
	}	
}


class DiscountRate
{
	public static double serviceDiscountPremium = 0.2;
	public static double serviceDiscountGold = 0.15;
	public static double serviceDiscountSilver = 0.1;
	public static double productDiscountPremium = 0.1;
	public static double productDiscountGold = 0.1;
	public static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type) {
		switch (type)
		{
		case "Premium":return serviceDiscountPremium;
		case "Gold":return serviceDiscountGold;
		case "Silver":return serviceDiscountSilver;
		default: return 0.0;
		}
	}
	public static double getProductDiscountRate(String type) {
		switch (type)
		{
		case "Premium":return productDiscountPremium;
		case "Gold":return productDiscountGold;
		case "Silver":return productDiscountSilver;
		default: return 0.0;
		}
	}	
}