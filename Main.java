import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Hero hero1 = new Hero("ミナト", 75, 18);

        // FileOutputStream fos = new FileOutputStream("rpgsave.dat");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(hero1);
        // oos.flush();
        // oos.close();

        // FileInputStream fis = new FileInputStream("rpgsave.dat");
        // ObjectInputStream ois = new ObjectInputStream(fis);
        // Hero hero2 = (Hero) ois.readObject();
        // ois.close();

        // System.out.println(hero1);
        // System.out.println(hero2);

        // Reader fr = new FileReader("pref.properties");
        // Properties p = new Properties();
        // p.load(fr);
        // String tokyo_c = p.getProperty("tokyo.capital");
        // String tokyo_f = p.getProperty("tokyo.food");
        // System.out.println("「" + tokyo_c + "：" + tokyo_f + "」");
        // fr.close();

        Employee e = new Employee("田中太郎", 41);
        Department ga = new Department("GA", e);

        FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ga);
        oos.flush();
        oos.close();

    }
}