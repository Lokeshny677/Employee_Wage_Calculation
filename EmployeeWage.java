public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculation");
        int FULL_TIME = 0;
        int empType = (int) (Math.random() * 100) % 2;
            if (empType == FULL_TIME) {
                System.out.println("Employee is Present");
            }
            else
            {
                System.out.println("Employee is Absent");
            }
    }
}
