package test;


import java.io.*;

//将E:\myfile\idea\javatest\src\java下的.java文件复制到E:\myfile\idea\javatest\src\text，并将其改成.txt的文件
public class FileCopy {
    public static void main(String[] args) throws Exception {
        File myfile=new File("E:\\myfile\\idea\\javatest\\src\\java");
        if (!myfile.exists()){
            System.out.println("文件夹不存在");
        }
        File[] files=myfile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        File newfile=new File("E:\\myfile\\idea\\javatest\\src\\text");
        if(!newfile.exists()){
            newfile.mkdir();
        }
        for(File file:files){
            FileInputStream fileInputStream=new FileInputStream(file);
            String newfilename=file.getName().replaceAll(".java",".txt");
            FileOutputStream fileOutputStream=new FileOutputStream(new File(newfile,newfilename));
            int l=0;
            byte[] b=new byte[1024];
            while ((l=fileInputStream.read(b))!=-1){
                fileOutputStream.write(b,0,l);
            }
        }
    }
}
