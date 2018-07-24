package com.anji.designpatterndemo.observer;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/3 9:00
 */
public class UniversityStudent implements Observer {
    Subject subject;
    File myFile;

    UniversityStudent(Subject subject,String fileName){
        this.subject=subject;
        subject.addObserver(this);
        myFile=new File(fileName);
    }

    @Override
    public void hearTelephone(String heardMess) {
        try{
            RandomAccessFile out1=new RandomAccessFile(myFile,"rw");
            out1.seek(out1.length());
            byte[] b=heardMess.getBytes();
            out1.write(b);
            System.out.println("我是一个大学生");
            System.out.println("我向文件"+myFile.getName()+"写入如下内容：");
            System.out.println(heardMess);
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
