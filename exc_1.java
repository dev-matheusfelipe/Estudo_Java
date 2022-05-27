import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class grauInf07 {
    
    public static void main(String[] args) {
        System.out.print("Nome: Matheus Felipe\n");
        System.out.print("Turma: INF07\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Data/Hora:"+dtf.format(LocalDateTime.now()));
    }
    
}
