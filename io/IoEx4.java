package io;
//pgm by character stream by reader and writer

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoEx4 {
    public static void main(String[] args)
    {
        IoEx4 ex=new IoEx4();
        ex.execute();
    }

    private void execute() {
        InputStreamReader reader=null;
        OutputStreamWriter writer=null;
        try{
            reader=new InputStreamReader(System.in);
            writer=new OutputStreamWriter(System.out);
            int read;//count of chars in file
            while((read =reader.read())>=0)
            {
                writer.write(read);
                writer.flush();
                char ch=(char)read;
                if(ch=='z')
                    break;

            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try {

                if(reader != null)
                    reader.close();    //close() also produces one xception ,so need to extend exception or handle it
                if(writer != null)
                    writer.close();  //closing both io and os connections
            }catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("CANT CLOSE THE CONNECTIONS PROPERLY");
            }
        }
        }

    }

