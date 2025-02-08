// Derived class
public class Manager extends Employee {
    private final Department department;

    public Manager(String name, int id, Department department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void setName(String name) {
        // here, notice that Manager class makes a modification
        // in setName method by appending a "Manager" tag ana deparment info.
        // this could be a bad practice but keep in mind that
        // our purpose is to demonstrate why we should avoid
        // overridable methods in constructors.
        super.setName(name + ", the Manager of the " + department.toString());
    }

    public Department getDepartment() {
        // The department should be read only.
        // We did not provide a set method and marked 
        // the department as final.
        // However, notice how returning the reference type
        // could lead to a change in the department field.
        // Your task is to correct this problem.
        return department;
    }

    @Override
    public String toString() {
        // Here, notice that we have a call to super.toString() method,
        // which accesses the name directly. However, we have overriden
        // that getName method and the way Manager handles the name 
        // is different. So, the "Manager" tag and department info do NOT apper.
        // Correct this in the toString() method of the Employee class
        return  super.toString() +
                " Manager ID: " + this.getId() +
                " Department Budget: " + this.getDepartment().getBudget();

    }
}

