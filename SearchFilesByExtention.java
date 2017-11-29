import java.io.File;
import java.io.FilenameFilter;


public class classnew {

	public static void main(String[] args) {
		
		
	 File file = new File("C:/Users/1795162/Downloads");
		String[] list = file.list(new FilenameFilter(){
			
		@Override
		public boolean accept(File dir ,String name){
			
			if (name.toLowerCase().endsWith(".pdf")){
				
				return true ;
					
			}else {
				
				return false ;
				
			}
			
		}
			
			
		});
			
		for (String f :list){
			
			System.out.println(f);
			
		}	
			
		}
			
			
		}
		

		
		
	


