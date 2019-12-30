package programs.co.chandu;

import java.io.File;

public class IoStreamEx {
    public static void main(String[] args)
    {
        String path="C:\\";
        File file=new File(path);//not new file,just  object for file path
        System.out.println("isdir:"+file.isDirectory());
        System.out.println("is a file:"+file.isFile());

        System.out.println("is hidden:"+file.isHidden());
        if(file.isDirectory())
        {
            String[] files=file.list();
            for(String f:files)
            {
                System.out.println(f);
            }

        }
        File dirToBeCreated=new  File("C:\\");
        boolean created=dirToBeCreated.mkdir();
        System.out.println("Dir created"+created);


    }
}
