import java.io.*;
import java.util.Scanner;

public class Subtitles {

    public static void main(String[] args) {
     //   customPath();
        genericPath();
    }

    public static void customPath(){
        String path, source, dest;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert source:");
        source = in.nextLine();
        System.out.println("Insert dest:");
        dest = in.nextLine();
        changeSubtitles("F:\\",source, dest);
    }

    public static void changeSubtitles(String path, String source, String dest){
        File sourceFile = new File(path + source);
        File destFile = new File(path + dest);
        try {
            Scanner reader = new Scanner(sourceFile);
            FileWriter writer = new FileWriter(destFile);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                data = data.replace("¹","ą");
                data = data.replace("ê","ę");
                data = data.replace("³","ł");
                data = data.replace("æ","ć");
                data = data.replace("œ","ś");
                data = data.replace("ñ","ń");
                data = data.replace("Ÿ","ź");
                data = data.replace("¿","ż");
                data = data.replace("¥","Ą");
                data = data.replace("Ê","Ę");
                data = data.replace("£","Ł");
                data = data.replace("Æ","Ć");
                data = data.replace("Œ","Ś");
//                data = data.replace("","Ń");
                data = data.replace("","Ź");
                data = data.replace("¯","Ż");
                writer.write(data);
                writer.write("\n");

            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error writting");
            e.printStackTrace();
        }
    }

    public static void genericPath(){
        String path, sourceBegin, sourceEnd, dest;
        int first, last;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number of first episode");
        first = Integer.parseInt(in.nextLine());
        System.out.println("Insert number of last episode");
        last = Integer.parseInt(in.nextLine());
        System.out.println("Insert first part");
        sourceBegin = in.nextLine();
        System.out.println("Insert second part:");
        sourceEnd = in.nextLine();
        for (int i = first; i <= last; i++){
            if (i < 10){
                path = sourceBegin + "0" + i + sourceEnd;
                System.out.println(path);
                dest = sourceBegin + "0" + i + ".txt";
            }
            else {
                path = sourceBegin + i + sourceEnd;
                dest = sourceBegin + i + ".txt";
            }
            changeSubtitlesFull(path, dest);
        }

    }

    public static void changeSubtitlesFull(String source, String dest){
        File sourceFile = new File(source);
        File destFile = new File(dest);
        try {
            Scanner reader = new Scanner(sourceFile);
            FileWriter writer = new FileWriter(destFile);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                data = data.replace("¹","ą");
                data = data.replace("ê","ę");
                data = data.replace("³","ł");
                data = data.replace("æ","ć");
                data = data.replace("œ","ś");
                data = data.replace("ñ","ń");
                data = data.replace("Ÿ","ź");
                data = data.replace("¿","ż");
                data = data.replace("¥","Ą");
                data = data.replace("Ê","Ę");
                data = data.replace("£","Ł");
                data = data.replace("Æ","Ć");
                data = data.replace("Œ","Ś");
//                data = data.replace("","Ń");
                data = data.replace("","Ź");
                data = data.replace("¯","Ż");
                writer.write(data);
                writer.write("\n");

            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error writting");
            e.printStackTrace();
        }
    }
}
