import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleSocketThread implements Runnable {

    @Override
    public void run() {

        while (true) {

            try {
                Socket s = new Socket("localhost", 6666);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF("Hello Preethi papa");
                dout.flush();
                dout.close();
                s.close();
                Thread.sleep(5000);
            } catch (UnknownHostException e) {

                // e.printStackTrace();
            } catch (IOException e) {

                // e.printStackTrace();
            } catch (InterruptedException e) {

                // e.printStackTrace();
            }

        }
    }

}
