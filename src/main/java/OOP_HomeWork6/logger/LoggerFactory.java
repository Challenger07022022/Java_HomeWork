package OOP_HomeWork6.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
