import java.io.File;
import java.io.FilenameFilter;


public class classnew {

	public static void main(String[] args) {
		
		
		int [] array ={
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
		
		
		System.out.println(contains(array,2013));
	}
	
	
	public static boolean contains(int [] arr ,int item ){
		
		for(int n :arr ){
			
			if (item== n){
				System.out.println(n);
				
				return true ;
				
			}
			
		}
		return false;
		
		
		
		
		
		
	}

			
			
		}
		
		
		
	


