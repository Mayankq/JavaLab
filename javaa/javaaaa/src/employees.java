import java.util.Scanner;

public class employees {
    String name;
    String designation;
    int id;
    String department;
    int salary;
    int n;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.println("Please enter the name of the employee: ");
        this.name = sc.nextLine();
        System.out.println("Please enter the department of the employee: ");
        this.department = sc.nextLine();
        System.out.println("Please enter the designation of the employee: ");
        this.designation = sc.nextLine();
        System.out.println("Please enter the id of the employee: ");
        this.id = sc.nextInt();
        System.out.println("Please enter the salary of the employee: ");
        this.salary = sc.nextInt();
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Department : " + this.department);
        System.out.println("Designation : " + this.designation);
        System.out.println("Id : " + this.id);
        System.out.println("Salary : " + this.salary);
    }

    public static void main(String[] args) {
        employees instance = new employees();
        System.out.print("\033[H\033[2J");
        System.out.print("Enter the number of employees: ");
        instance.n = instance.sc.nextInt();
        employees[] e = new employees[instance.n];
        for (int i = 0; i < 3; i++) {
            e[i] = new employees();
            e[i].read();
        }
        // calculate the sum of the salary of sales department
    }
}
