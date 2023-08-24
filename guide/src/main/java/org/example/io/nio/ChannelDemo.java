package org.example.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author admin
 * @version 1.0
 */
public class ChannelDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile reader = new RandomAccessFile("C:\\code\\demo\\guide\\src\\main\\resources\\channel.txt", "rw");
        FileChannel channel = reader.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);



        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }

    }
}
