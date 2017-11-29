import java.io.File;


public class classnew {

	public static void main(String[] args) {
		
		
		File file = new File("C:/Users/1795162/Downloads");
		String [] filelist = file.list();
		for (String name :filelist){
			
			System.out.println(name);
			
			
		}
		

		
		
	}

}
