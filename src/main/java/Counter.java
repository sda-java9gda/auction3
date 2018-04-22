import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements SSLSessionBindingListener {
    private static AtomicInteger licznik = new AtomicInteger(0);

    @Override
    public void valueBound(SSLSessionBindingEvent sslSessionBindingEvent) {
        licznik.getAndIncrement();

    }

    @Override
    public void valueUnbound(SSLSessionBindingEvent sslSessionBindingEvent) {
        licznik.getAndDecrement();

    }
    public static int getLicznik() {
        return licznik.get();

    }
}

