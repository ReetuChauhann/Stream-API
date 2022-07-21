import java.util.*;

public class comparator1 {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(2, "Tanu", "50,000"));
        emp.add(new Employee(1, "Reetu", "70,000"));
        emp.add(new Employee(4, "Vishal", "40,000"));
        emp.add(new Employee(3, "Kush", "45,000"));
        emp.add(new Employee(5, "Gaurav", "55,000"));

        System.out.println("Unsorted");

        for(int i=0; i<emp.size(); i++){
           System.out.println(emp.get(i)+ " ");
        }

        System.out.println();
        System.out.println("Sorted by Eid");

        Collections.sort(emp, new Sortbyeid());

        for(int i=0; i<emp.size(); i++){
            System.out.println(emp.get(i));
         }

        System.out.println();
        System.out.println("Sorted by Name");

        Collections.sort(emp, new Sortbyname());

        for(int i=0; i<emp.size(); i++){
            System.out.println(emp.get(i));
         }


    }
    
   static class Employee {
        int eid;
        String name;
        String salary;

     public Employee(int eid, String name, String salary){
            this.eid=eid;
            this.name=name;
            this.salary=salary;

        }
           
        public String toString(){
               // Returning attributes of Employee
        return this.eid + " " + this.name + " "
        + this.salary; 
        }

        
    }
    
    //sort by eid
   static class Sortbyeid implements Comparator<Employee>{

        public int compare(Employee a, Employee b){
           return a.eid-b.eid;   
        }
    }

    //sort by name
   static  class Sortbyname implements Comparator<Employee>{
        public int compare(Employee a, Employee b){
            return a.name.compareTo(b.name);
        }
    }
    
}
