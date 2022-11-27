package kata4mvc.main;

import java.io.IOException;
import java.util.List;
import kata4mvc.model.*;
import kata4mvc.view.*;

public class Kata4MVC {
    public static void main(String[] args) throws IOException {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}