
package mypeopleexample;

public class Main {
    
    public static void main(String[] args) {
        
        // Create object instances and invoke methods.
        // Note that you can use methods defined in a parent
        // class for object instances of the child class.
        
        Person person1 = new Person();
        person1.setName("Tom Jones");
        
        Student student1 = new Student();
        student1.setName("CCR");
        student1.setSchool("Lexington High");
        
        InternationalStudent internationalStudent1 =
                new InternationalStudent();
        internationalStudent1.setName("Bill Clinton");
        internationalStudent1.setSchool("Lexington High");
        internationalStudent1.setCountry("Korea");
        
        Teacher teacher1 = new Teacher();
        teacher1.setName("Beatles");
        teacher1.setSubject("History");
        
        // Display name of object instances using the getName() method
        // defined in the Person class.
        System.out.println("Displaying names of all object instances...");
        System.out.println("  person1.getName() = " + person1.getName());
        System.out.println("  student1.getName() = " + student1.getName());
        System.out.println("  internationalStudent1.getName() = " +
                internationalStudent1.getName());
        System.out.println("  teacher1.getName() = " + teacher1.getName());
        
        // Display the class hierarchy of the InternationalStudent
        // class.
        Class class1 = internationalStudent1.getClass();
        
        System.out.println("Displaying class hierarchy of InternationalStudent Class...");
        while (class1.getSuperclass() != null){ 
            String child = class1.getName();
            String parent = class1.getSuperclass().getName();
            System.out.println("  " + child + " class is a child class of " + parent);
            class1 = class1.getSuperclass();   
        }
    }
}
