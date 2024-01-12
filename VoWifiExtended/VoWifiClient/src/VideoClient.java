import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;

import java.io.*;
import java.net.*;

public class VideoClient {
    static Socket socket;

    public static void main(String[] args) {
    	 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        try {
            socket = new Socket("10.160.65.68", 2323);

            while (true) {
                InputStream inStream = socket.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inStream);
                int length = dataInputStream.readInt();
                byte[] buffer = new byte[length];
                dataInputStream.readFully(buffer, 0, buffer.length);

                Mat frame = Imgcodecs.imdecode(new MatOfByte(buffer), Imgcodecs.IMREAD_UNCHANGED);
                HighGui.imshow("Host's Video", frame);
                HighGui.waitKey(1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
