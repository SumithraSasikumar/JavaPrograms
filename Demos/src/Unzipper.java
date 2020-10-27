
public class Unzipper {
	
	    public static void main(String[] args) {
	        String zipFilePath = "/home/nova/Videos/5.png.zip";
	        String destDirectory ="/home/nova/Videos";
	        Unzips unzipper = new Unzips();
	        try {
	            unzipper.unzip(zipFilePath, destDirectory);
	        } catch (Exception ex) {
	            // some errors occurred
	            ex.printStackTrace();
	        }
	    }
}
	    

