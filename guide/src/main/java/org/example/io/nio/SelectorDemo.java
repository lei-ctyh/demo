package org.example.io.nio;

import sun.nio.ch.SelectorImpl;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2023/8/21 22:55
 */
public class SelectorDemo {
    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();
        Set<SelectionKey> selectedKeys = selector.selectedKeys();
        Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
        while (keyIterator.hasNext()) {
            SelectionKey key = keyIterator.next();
            if (key != null) {
                if (key.isAcceptable()) {
                    // ServerSocketChannel 接收了一个新连接
                } else if (key.isConnectable()) {
                    // 表示一个新连接建立
                } else if (key.isReadable()) {
                    // Channel 有准备好的数据，可以读取
                } else if (key.isWritable()) {
                    // Channel 有空闲的 Buffer，可以写入数据
                }
            }
            keyIterator.remove();
        }

    }
}
