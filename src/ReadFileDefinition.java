import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileDefinition {
	
	public List<String> doesFileExist(String filePath) { 
		
		List<String> lines = new ArrayList<String>();
	
		try
        {
			Scanner aScanner = new Scanner(new FileReader(
					filePath));
		
			while (aScanner.hasNextLine()) {
				lines.add(aScanner.nextLine());
			}
		
			aScanner.close();
		
		
        } catch(FileNotFoundException exception) {
            System.out.println("The file  was not found. " + exception);
        }
		return lines;
	}
			

}




