import java.util.Scanner;

public class employees {
    String name;
    String designation;
    int id;
    String department;
    int salary;
    int n;
    int sum = 0;
    int maxin;
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
        int max = 0;
        employees instance = new employees();
        System.out.print("\033[H\033[2J");
        System.out.print("Enter the number of employees: ");
        instance.n = instance.sc.nextInt();
        employees[] e = new employees[instance.n];
        for (int i = 0; i < instance.n; i++) {
            e[i] = new employees();
            e[i].read();
        }
        // calculate the sum of the salary of sales department
        for (int j = 0; j < instance.n; j++) {
            if (e[j].department.equals("sales")) {
                instance.sum = instance.sum + e[j].salary;
            }
        }
        System.out.println("The sum of salary of all the employees in the sales department is:" + instance.sum);

        // retrieve the details of highest paid manager in purchase department
        for (int k = 0; k < instance.n; k++) {
            if ((e[k].department.equals("purchase")) && (e[k].designation.equals("manager"))) {
                if (e[k].salary > max) {
                    max = e[k].salary;
                    instance.maxin = k;
                }
            }
        }
        System.out.println("\nDetails of highest paid manager in the purchase department:\n");
        System.out.println("Name : " + e[instance.maxin].name);
        System.out.println("Department : " + e[instance.maxin].department);
        System.out.println("Designation : " + e[instance.maxin].designation);
        System.out.println("Id : " + e[instance.maxin].id);
        System.out.println("Salary : " + e[instance.maxin].salary);
    }
}



