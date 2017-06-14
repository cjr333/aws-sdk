import lab8.CacheManager;
import lab8.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017-06-14.
 */
@SpringBootApplication(scanBasePackageClasses = {SampleController.class})
public class AppStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args);
        CacheManager.init();
    }
}
