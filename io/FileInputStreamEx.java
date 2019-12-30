package io;

import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) throws Exception
    {
        FileInputStreamEx fs=new FileInputStreamEx();//object
        fs.execute();
    }
    public void execute() throws Exception {
        InputStream is=null;
        OutputStream os=null;
        try{

        File inputfile=new File("D:\\input.txt");//not a new file,just object to that path
        is=new FileInputStream(inputfile);
        File outfile=new File("D:\\newfile");
        os=new FileOutputStream(outfile);
        int read;
        while((read = is.read())>=0)//read() function retun=rns no of characters in that file
        {
            os.write(read); //writing to the outputstream which is "handed" a file,so indirectly writing to output file.
        }
      }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
         if(is!=null)
             is.close();    //close() also produces one xception ,so need to extend exception or handle it
         if(os!=null)
             os.close();  //closing both io and os connections
        }

    }
}
