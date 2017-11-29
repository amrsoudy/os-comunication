import java.io.File;
import java.io.FilenameFilter;


public class classnew {

	public static void main(String[] args) {
		
		File my_file_dir = new File("C:/Users/1795162/Downloads/IMM5645E.PDF");
		
		if(my_file_dir.canWrite()){
			
			System.out.println(my_file_dir.getAbsolutePath() +"can't write \n");
			
			
		}else{
			
			System.out.println(my_file_dir.getAbsolutePath()+"cant'write");
			
			
		}if(my_file_dir.canRead()){
			
			
			System.out.println(my_file_dir.getAbsolutePath()+"tu puex read ");
			
		}else{
			
			System.out.println(my_file_dir.getAbsolutePath()+"can't  read");
			
			
		}
			
			
			
			
			
		
	}
			
			
		}
		

		
		
	


