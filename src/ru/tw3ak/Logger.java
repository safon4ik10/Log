package src.ru.tw3ak;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    protected int num = 1;

    private Logger(){

    }

    public static Logger getInstance(){
        if (logger == null){
            return new Logger();
        }
        return logger;
    }

    public void log(String msg){
        System.out.println("[" + sdf.format(new Date().getTime()) + " " + num++ + "] " + msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
