// Base class
class Employee {
    private String name;
    private int id;
      
    public Employee(String name, int id) {
        // this is a demonstration of why we should NOT use 
        // an overridable method in a constructos
        // Your task: 
        // x first, examine the problem
        // x then, correct the problem
        
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        // here, notice that the class returns direclty
        // the name instead of getName
        return name;
    }

}
