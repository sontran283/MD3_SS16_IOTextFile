import java.io.File;
import java.io.IOException;

public class Main {
    // mkdir tao thu muc
    // createNewFile tao file

    // Tạo 1 thư mục đặt tên là data nằm ngoài cùng project
    // Trong thư mục này chứa các tệp và thư mục sau
    // tệp input.txt
    // tệp Demo.java
    // thư mục sub1. chứa các tệp con là output.txt, student.dat
    // thư mục sub2
    // Sau khi tạo xong thì hiển thị hết cả cây thư mục vừa tạo theo dạng sau:
    // data
    //-input.txt
    //-Demo.java
    //-sub1
    //--output.txt
    //--student.dat
    //-sub2

    public static void main(String[] args) throws IOException {
        // Tạo 1 thư mục đặt tên là data nằm ngoài cùng project
        File dataFolder = new File("data");
        dataFolder.mkdir();

        // tao file input.txt
        File dataFile = new File("data/input.txt");
        dataFile.createNewFile();

        // tao file Demo.java
        File DemoFile = new File("data/Demo.java");
        DemoFile.createNewFile();

        // tao thu muc sub1 ,  sub1
        File sub1 = new File("data/sub1");
        sub1.mkdir();

        File sub2 = new File("data/sub2");
        sub2.mkdir();

        // tao file output.txt   va    student.dat
        File outputFile = new File("data/sub1/output.txt");
        outputFile.createNewFile();

        File studentFile = new File("data/sub1/student.dat");
        studentFile.createNewFile();

        // hien thi
        File[] subArray = dataFolder.listFiles();
        System.out.println("folder " + dataFolder.getName() + " co cac tep va thu muc con sau: ");
        System.out.println(dataFolder);
        for (File sub : subArray) {
            System.out.println("-" + sub.getName());
            if (sub.isDirectory()) {
                File[] sub2Array = sub.listFiles();
                for (File abc : sub2Array) {
                    System.out.println("--" + abc.getName());
                }
            }
        }
    }
}
