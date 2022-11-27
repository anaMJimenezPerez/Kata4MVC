package kata4mvc.view;

import java.util.List;
import kata4mvc.model.Mail;
import kata4mvc.model.Histogram;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> lista){
        Histogram<String> histogram = new Histogram<>();
        for (Mail mail : lista) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
}
