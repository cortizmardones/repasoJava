package artifactExample.com.integral;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class CodeQR extends JFrame {

	private int ancho = 350;
	private int alto = 350;
	private String data = "CodeQR desde java";
	
	public static void main(String args[]) {

		try {
			CodeQR codeQR = new CodeQR();
			codeQR.setVisible(true);
		} catch (WriterException e) {
			e.printStackTrace();
		}
	}

	// CONSTRUCTOR
	public CodeQR() throws WriterException {
		BufferedImage bufferedImage = crearQR(data, ancho, alto);
		ImageIcon imageIcon = new ImageIcon(bufferedImage);
		JLabel etiqueta = new JLabel("");
		etiqueta.setIcon(imageIcon);
		this.setIconImage(bufferedImage);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(etiqueta);
		this.pack();
	}

	public static BufferedImage crearQR(String texto, int ancho, int alto) throws WriterException {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(texto, BarcodeFormat.QR_CODE, ancho, alto);
		BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        for(int y = 0; y < alto; y++) {
            for(int x = 0; x < ancho; x++) {
                int grayValue = (bitMatrix.get(x, y) ? 0 : 1) & 0xff;
                imagen.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));
            }
        }
		return imagen;
	}

}
