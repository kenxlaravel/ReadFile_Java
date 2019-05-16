import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ReadFileDefinition readFile = new ReadFileDefinition();
		//changeable path to read file from
		List<String> l = readFile.doesFileExist("C://eclipse//simpledictionary.txt");
		
		for(int i=0; i< l.size(); i++){
		    System.out.println(l.get(i).replaceAll("[-,]","\n"));
		} 

	}

}
