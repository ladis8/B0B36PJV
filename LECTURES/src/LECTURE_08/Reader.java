package LECTURE_08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by ladislav on 21.4.17.
 */
public class Reader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String rel = System.getProperty("user.dir");
        System.out.println(rel);
        //countlines();
        removewhitespaces();
        //countwords();
        //writeBinary();
        //task5(rel);

    }


    static void task5(String relativepath) throws IOException, ClassNotFoundException {


        //problem s diakritikou
        //InputStreamReader umoznuje lokalizovat znakovou sadu


        BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream(relativepath+"/LECTURES/src/LECTURE_08/tel_seznam_KUp_2.csv"),"ISO-8859-2"));
        String line;
        ArrayList list = new ArrayList<Contact>();

        rd.readLine();

        while ((line = rd.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line, ";");
            Contact contact = new Contact(st.nextToken(), st.nextToken(),st.nextToken(),st.nextToken());
            //System.out.println(contact);
            list.add(contact);
        }

        //read the binary file
        ObjectOutputStream ous =new ObjectOutputStream(new FileOutputStream("./LECTURES/src/LECTURE_08/serialisedoutput.bin"));
        ous.writeObject(list);
        ous.close();

        //translate the binary file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./LECTURES/src/LECTURE_08/serialisedoutput.bin"));
        List<Contact> contactstranslated = (List<Contact>) ois.readObject();
        ois.close();
        for (Contact c : contactstranslated){
            System.out.println(c);
        }




        //what does it do
        list.stream();



    }
    //write to binary file
    static void writeBinary() throws IOException {

        //write binary
        FileOutputStream os = new FileOutputStream("./LECTURES/src/LECTURE_08/output.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);


        DataOutputStream dos = new DataOutputStream(bos);

        Scanner sc = new Scanner(System.in);
        double d;

        while ((d=sc.nextDouble()) >0){
            dos.writeDouble(d);
        }

        bos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("./LECTURES/src/LECTURE_08/output.txt"));
        double o;
        while ((o = dis.readDouble()) !=-1){
            System.out.println(d);
        }




    }


    //only scanner is suitable for reading the tokens
    static void countwords() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("./LECTURES/src/LECTURE_08/newfile.txt"));
        //regular expressions
        sc.useDelimiter("\\s+");

        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();



    }
    static void countlines() throws IOException {

        BufferedReader Br;
        InputStreamReader isr;
        BufferedInputStream br;
        FileInputStream fis;



        FileReader fr = new FileReader("./LECTURES/src/LECTURE_08/newfile.txt");
        Br = new BufferedReader(fr);
        String line;
        int linecounter =0;

        while ((line = Br.readLine())!= null){

            linecounter++;
            System.out.println(linecounter+ " "+ line);
        }

        Br.close();




    }

    static void removewhitespaces() throws IOException {
        File f = new File("./LECTURES/src/LECTURE_08/newfile.txt");
        //FileWriter fw = new FileWriter(f);

        //hieararchy
        BufferedReader fr = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(f))));

       // FileReader fr = new FileReader(f);
        boolean firstwhitespace = true;
        int ch;

        ///fr.ready, who knew that
        while (fr.ready()){

            ch = fr.read();
            if (Character.isWhitespace((char) ch)) {
                if (firstwhitespace){
                    firstwhitespace = false;
                    System.out.println((char)ch);
                }

            }
            else {
                System.out.println((char)ch);
                firstwhitespace = true;
            }

        }
    }
}
