package LogTreatmentLog4J;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("LogTreatmentLog4J.cemvc.Mapper")
public class applicationLog4J {
    public static void main(String[] args) {
        SpringApplication.run(applicationLog4J.class, args);
    }

}
