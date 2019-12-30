package io;

import java.io.*;

public class IoEx3 {

    public static void main(String[] args) throws Exception
    {
        IoEx3 fs=new IoEx3();//object
        fs.execute();
    }
    public void execute()  {   //throws Exception ,HERE if you dont want to handle exceptions during connection closing
       InputStream is=System.in;
        OutputStream os=System.out;
        try{

           int read;
           System.out.println("ENTERED DATA IS:");
           while((read=is.read())>=0)
           {
              os.write(read);//INTERNALLYS expecting  byte oonly ,so itprints directly
             // System.out.println((char)read);//BUT in println(),we need to convert the each byte  from file to char() and give it ti println() to print()

           }
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

