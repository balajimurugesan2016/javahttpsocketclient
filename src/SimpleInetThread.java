import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.omg.CORBA.DataOutputStream;

public class SimpleInetThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            Socket s;
            try {
                s = new Socket("localhost", 6666);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF("");
                dout.flush();
                dout.close();
                s.close();
                Thread.sleep(5000);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

}
