
// Main class to test the hierarchy
public class App {
    public static void main(String[] args) {
        Department dept = new Department("IT", 50000);
        // Your task is to understand why the set method in the Employee class
        // cause a NullPointerException here.
        // Go to Employee class constructor and correct it.
        Manager manager = new Manager("Alice", 101, dept);

        // Accessing manager details
        System.out.println(manager.toString());
        // Trying to modify the department through the manager's getter
        Department retrievedDept = manager.getDepartment();
        retrievedDept.setBudget(100000); 
        retrievedDept.setDepartmentName("HR");
        // see how department info of the manager has been changed through retrievedDept
        // although department is final in the Manager class 
        System.out.println(manager.toString());
    }
}
