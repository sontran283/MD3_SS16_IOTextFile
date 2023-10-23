import java.io.File;
import java.io.IOException;

public class DemoFile {
    // mkdir tao thu muc
    // createNewFile tao file

    public static void main(String[] args) throws IOException {
        // tao file data.txt
        File dataFile = new File("src/data.txt");
        if (dataFile.createNewFile()) {
            System.out.println("tao file thanh cong");
            return;
        }
        System.out.println("tao file khong thanh cong");


        // tao thu muc input
        File inputDir = new File("input");
        if (inputDir.mkdir()) {
            System.out.println("tao folder input thanh cong");
            return;
        }
        System.out.println("tao folder that bat");


        // tao folder sub
        File subFolder = new File("src/sub");
        if (subFolder.mkdir()) {
            File inputFile = new File("src/sub/input.txt");
            inputFile.createNewFile();
        }


        File srcDir = new File("src");
        File[] subArray = srcDir.listFiles();
        System.out.println("folder " + srcDir.getName() + " co cac tep va thu muc con sau: ");
        for (File sub : subArray) {
            System.out.println(sub.getName());
        }
    }
}