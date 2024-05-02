package Car;
import java.util.Scanner;  

public class Car {  
    private String brand;      // 成员变量品牌  
    private int overload;        // 成员变量载客量  
    private float displacement;   // 成员变量排量  
    private String licenseNumber; // 成员变量车牌号  
  
    public void setMessage(String brand, int overload, float displacement, String licenseNumber) {  
        this.brand = brand;  
        this.overload = overload;  
        this.displacement = displacement;  
        this.licenseNumber = licenseNumber;  
    }  
  
    public void getMessage() {  
        System.out.println("品牌: " + brand);  
        System.out.println("载客量: " + overload);  
        System.out.println("排量: " + displacement);  
        System.out.println("车牌号: " + licenseNumber);  
    }  
  
    public static void main(String[] args) {  
        Car myCar = new Car();  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.println("请输入品牌:");  
        myCar.setMessage(scanner.nextLine(), myCar.overload, myCar.displacement, myCar.licenseNumber);  
        System.out.println("请输入载客量:");  
        myCar.setMessage(myCar.brand, scanner.nextInt(), myCar.displacement, myCar.licenseNumber);  
        System.out.println("请输入排量:");  
        myCar.setMessage(myCar.brand, myCar.overload, scanner.nextFloat(), myCar.licenseNumber);  
        System.out.println("请输入车牌号:");  
        myCar.setMessage(myCar.brand, myCar.overload, myCar.displacement, scanner.nextLine());  
  
        
    }  
}