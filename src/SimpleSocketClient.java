import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleSocketClient {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(10);
		SimpleSocketThread sstc = new SimpleSocketThread();
		SimpleInetThread ssnc = new SimpleInetThread();
		es.submit(sstc);
		es.submit(ssnc);

	}

}
