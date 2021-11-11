package week1.day1;
public class ClassObjectProgram {
	String ObjectCategory = "Laptop";
	float size;
	String color;
	String brandName;
	long CostOfLaptop;
	char grade;

	public void size() {
		System.out.println("The size of the laptop : " + size);
	}

	public void color() {
		System.out.printf("The color of the laptop : %S \n", color);
	}

	public void brandName() {
		System.out.printf("The Brand Name of the laptop : %S \n", brandName);
	}

	public void CostOfLaptop() {
		System.out.println("The Cost of the laptop : " + CostOfLaptop);
	}

	public void grade() {
		System.out.println("The Grade of the laptop : " + grade);
	}

	public static void main(String[] args) {
		// Create a class, object and call methods
		System.out.println("Class and Object Assignment");
		ClassObjectProgram hp = new ClassObjectProgram();
		System.out.println("Displaying my methods");
		hp.size = 14;
		hp.color = "Silver";
		hp.brandName = "HP";
		hp.CostOfLaptop = 93000;
		hp.grade = 'A';
		hp.size();
		hp.CostOfLaptop();
		hp.color();
		hp.brandName();
		hp.grade();

	}}
