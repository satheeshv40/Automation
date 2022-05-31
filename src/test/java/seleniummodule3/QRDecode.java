/*
 * package seleniummodule3;
 * 
 * import java.awt.image.BufferedImage; import java.io.File; import
 * java.io.IOException; import javax.imageio.ImageIO; import
 * org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * com.google.zxing.BinaryBitmap; import com.google.zxing.LuminanceSource;
 * import com.google.zxing.MultiFormatReader; import
 * com.google.zxing.NotFoundException; import com.google.zxing.Result; import
 * com.google.zxing.client.j2se.BufferedImageLuminanceSource; import
 * com.google.zxing.common.HybridBinarizer;
 * 
 * public class QRDecode {
 * 
 * public static void main(String[] args) throws IOException, NotFoundException
 * { // TODO Auto-generated method stub
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
 * driver.get("https://codewithsushil.in/3.11readQR.html"); File file = new
 * File("./qrcodeselenium.jpg"); String decodedText = null; BufferedImage
 * bufferedImage = ImageIO.read(file);
 * 
 * LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
 * BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source)); Result
 * result = new MultiFormatReader().decode(bitmap); decodedText =
 * result.getText(); System.out.println(decodedText);
 * driver.findElement(By.xpath("//*[@type='text']")).sendKeys(decodedText);
 * 
 * }
 * 
 * }
 */