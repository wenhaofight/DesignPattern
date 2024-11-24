import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Test.class);
        log.error("中文");
    }
}