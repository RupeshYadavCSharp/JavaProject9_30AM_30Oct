package pack_googlemaps;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.DrbgParameters;
import java.util.Scanner;

public class GoogleMapsQr {
    private static final String QR_CODE_IMAGE_PATH = "D:\\A\\./GoogleMapsQRCode.png";

    private static void generateGoogleMapsQRCode(double latitude, double longitude, int width, int height, String filePath)
            throws WriterException, IOException, UnsupportedEncodingException {
        String location = latitude + "," + longitude;
        String googleMapsUrl = "https://www.google.com/maps?q=" + URLEncoder.encode(location, "UTF-8");

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(googleMapsUrl, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }

    public static void main(String[] args) {
        float lat,lon;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter latitude co-ordinates");
            lat = scan.nextFloat();
            System.out.println("Enter longitude co-ordinates");
            lon = scan.nextFloat();
            double currentLatitude = lat;
            double currentLongitude = lon;

            generateGoogleMapsQRCode(currentLatitude, currentLongitude, 350, 350, QR_CODE_IMAGE_PATH);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
}
