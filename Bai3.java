import java.util.Scanner;
 
public class Bai3{
    public static void main(String[] args){
        int age, year;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        year = sc.nextInt();
        age = 2023 - year;
        if (age < 16){
            System.out.println("Bạn " + name + "ở độ tuổi vị thành niên");
        }
        else if (age >= 16 && age < 18){
            System.out.println("Bạn " + name + "ở độ tuổi trưởng thành");
        } 
        else{
            System.out.println("Bạn " + name +  "đã già");
        }
    }
}