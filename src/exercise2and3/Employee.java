package exercise2and3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee implements Person{
    private LocalDateTime dateOfEmployement;
    private String position;

    public Employee(LocalDateTime dateOfEmployement, String position) {
        this.dateOfEmployement = dateOfEmployement;
        this.position = position;
    }

    public LocalDateTime getDateOfEmployement{
        return dateOfEmployement.format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
    }




}
