package lecture1.ionio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BasicChannelExample {
    public static void main(String[] args) throws IOException {
        readFromFile();
        writeToFile();
    }

    private static void readFromFile() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        //создаем буфер объемом 48 байт
        ByteBuffer buf = ByteBuffer.allocate(48);
        //запись в буфер из канала
        int bytesRead = inChannel.read(buf);

        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            //делаем буфер готовым для чтения
            buf.flip();

            while (buf.hasRemaining()) {
                //приводим байты в символы и выводим в косоль
                System.out.print((char) buf.get());
            }
            buf.clear(); //делаем буфер готовым для записи
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    private static void writeToFile() throws IOException {
        RandomAccessFile toFile = new RandomAccessFile("data/nio-data-to.txt", "rw");
        FileChannel toChannel = toFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        //записываем в канал из буфера
        buf.put("String".getBytes());
        //переключаем в режим чтения
        buf.flip();
        //читаем из буфера в поток
        toChannel.write(buf);
        toFile.close();
    }

    private static void scatteringExample() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
        FileChannel channel = aFile.getChannel();
        ByteBuffer header = ByteBuffer.allocate(128);
        ByteBuffer body = ByteBuffer.allocate(1024);

        ByteBuffer[] bufferArray = {header, body};

        channel.read(bufferArray);
    }

    private static void gatheringExample() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
        FileChannel channel = aFile.getChannel();
        ByteBuffer header = ByteBuffer.allocate(128);
        ByteBuffer body = ByteBuffer.allocate(1024);

        ByteBuffer[] bufferArray = {header, body};

        channel.write(bufferArray);
    }
}
