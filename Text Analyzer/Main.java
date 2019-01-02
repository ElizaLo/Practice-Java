package Programme;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("Input.txt");
            ArrayList<String> arrL = new ArrayList<String>();
            while(fr.ready()){
                String word = nextWord(fr);
                if(noRepeats(word)){
                    if (arrL.contains(word)){continue;}
                    arrL.add(word);
                    System.out.println(word);
                } else { continue;}
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static String nextWord(FileReader fr) throws IOException {
        StringBuilder sb = new StringBuilder();
        while(fr.ready()){
            int c=fr.read(); //считали букву
            boolean isLetter = Character.isLetter(c); // есть ли это буквка
            if(isLetter){
                sb.append((char)c);
            } else {
                if(sb.toString().isEmpty()){
                    continue;
                }
                break;
            }
        }
        return sb.toString();
    }

    private static boolean noRepeats(String word){
        word = word.toLowerCase();
        for (int i=0; i<word.length();i++){
            if (word.substring(i+1).contains(String.valueOf(word.charAt(i)))) return false;
            /*for (int j=i+1;j<word.length();j++){
                if(word.charAt(i) == word.charAt(j)){
                    return false;
                }
            } */
        }
        return true;
    }
}
