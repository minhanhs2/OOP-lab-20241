<<<<<<< Updated upstream
package hust.soict.garbage;
=======
package hust.soict.garbage

>>>>>>> Stashed changes

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = "C:\\Users\\AnhToMinh\\OneDrive - vnh3\\Documents\\GitHub\\OOP-lab-20241\\OtherProjects\\hust\\soict\\garbage\\test.exe";
			byte[] inputBytes = { 0 };
			long startTime, endTime;
			
			inputBytes = Files.readAllBytes(Paths.get(filename));
			startTime = System.currentTimeMillis();
			StringBuilder outputStringBuilder = new StringBuilder();
			for(byte b : inputBytes) {
				outputStringBuilder.append((char)b);
				}
			endTime = System.currentTimeMillis();
			System.out.println((endTime - startTime));
		} catch(IOException e){
				System.out.println(e); 
			}
	}

<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
