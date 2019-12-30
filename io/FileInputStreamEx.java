package io;

import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) throws Exception
    {
        long startTime=System.currentTimeMillis();

        FileInputStreamEx fs=new FileInputStreamEx();//object
        fs.execute();
        long endTime=System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.println("pgm executed in millis:"+executionTime);
    }
    public void execute()  {   //throws Exception ,HERE if you dont want to handle exceptions during connection closing
        InputStream is=null;
        OutputStream os=null;
        try{

        File inputfile=new File("D:\\input.txt");//not a new file,just object to that path
        is=new FileInputStream(inputfile);
        File outfile=new File("D:\\newfile");
        os=new FileOutputStream(outfile);
        int readBytesCount;
        byte[] buffer=new byte[1000];
        BufferedInputStream bis=new BufferedInputStream(is);//for high performance -->bufferedInputStream
        while((readBytesCount = bis.read(buffer))>=0)//read() function retun=rns no of characters in that file
        {
            os.write(buffer,0,readBytesCount); //writing to the outputstream which is "handed" a file,so indirectly writing to output file.
        }
        System.out.println("FILE COPIED TO A SPECIFIED NEW FILE");
      }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {

                if(is != null)
                    is.close();    //close() also produces one xception ,so need to extend exception or handle it
                if(os != null)
                    os.close();  //closing both io and os connections
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("CANT CLOSE THE CONNECTIONS PROPERLY");
            }
        }

    }
}
