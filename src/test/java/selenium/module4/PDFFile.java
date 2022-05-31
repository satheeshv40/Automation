package selenium.module4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PDFFile {

	@Test
	public static void pdfile() throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./sample.pdf");
		PDDocument pdf = PDDocument.load(fis);
		PDFTextStripper obj = new PDFTextStripper();
		System.out.println(obj.getText(pdf));
	}

}
