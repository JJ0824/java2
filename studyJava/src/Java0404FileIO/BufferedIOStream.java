package Java0404FileIO;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        File orgFile = new File(FileObject.CURRENT + "/mycay_origin.jpg");
        File copyFile = new File(FileObject.CURRENT + "/mycay_origin.jpg");

        InputStream is = new FileInputStream(orgFile);
        OutputStream os = new FileOutputStream(copyFile);
        // 기존의 방법은 1 바이트씩 쓰고 읽기 떄문에 속도가 느림
        // 1 바이트마다 read/write하지 않고 버퍼에 모았다가 한번에 하면 속도를 높일 수 있음
        // BffereaInutStream과 BuffereaOututStream 을 같이 사용함
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedIOStream bos = new BufferedIOStream();

        int data;
        // BufferedStream을 사용하려면 is,os 대신에 bis,bos를 사용한다
        while ((data=is.read()) != -1) {

        }
        is.close();
        os.flush();
        os.close();
    }
}