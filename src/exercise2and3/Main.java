package exercise2and3;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Employee em = new Employee(LocalDateTime.now(),"Manager");

        System.out.println(em.getFirstName());
    }
}
