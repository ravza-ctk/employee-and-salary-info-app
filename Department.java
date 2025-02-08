// Department class
class Department {
    private String departmentName;
    private double budget;

    public Department(String departmentName, double budget) {
        this.departmentName = departmentName;
        this.budget = budget;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getBudget() {
        return budget;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString(){
        return this.getDepartmentName();
    }
}
