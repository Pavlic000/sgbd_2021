import java.net.URL;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TelechargementPDF {

	 public static void main(String[] args) {
	        //get the url page from the arguments array
		 BufferedInputStream bis;
		 FileOutputStream fos;
		 try {
			 
			 bis = new BufferedInputStream(new URL("http://www.sante.gouv.sn/sites/default/files/Communiqu%C3%A9%20377.pdf").openStream());  
			  fos = new FileOutputStream("D:\\ESP\\MSRT1\\SGBD Avance\\Partie Projet\\bens.pdf");
				    byte data[] = new byte[1024];
				    int byteContent;
				    while ((byteContent = bis.read(data, 0, 1024)) != -1) {
				        fos.write(data, 0, byteContent);
				    }
				    System.out.println("ok");
				} catch (IOException e) {
				   e.printStackTrace(System.out);
				}
	    }

}