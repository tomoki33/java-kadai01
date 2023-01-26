import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class StreamTest{

    public static void main(String args[]){

        try{
            File f = new File("scores.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
        
            String line;

            while((line = br.readLine())!= null){
                String[]data = line.split(",",0);

                for(String elem:data){
                    System.out.print(elem);
                   

                }
            }
            br.close();
        }catch (IOException e){
            System.out.print(e);
            System.out.println();
        }      
    }
}