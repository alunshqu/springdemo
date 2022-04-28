package com.alun.mysql.slave;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.Event;
import com.github.shyiko.mysql.binlog.event.deserialization.EventDeserializer;

public class MysqlSlave {

    public static void main(String[] args) throws Exception{
        BinaryLogClient binaryLogClient = new BinaryLogClient("aaron.com", 3306, "root", "123456");
        EventDeserializer eventDeserializer = new EventDeserializer();
        eventDeserializer.setCompatibilityMode(
                EventDeserializer.CompatibilityMode.DATE_AND_TIME_AS_LONG,
                EventDeserializer.CompatibilityMode.CHAR_AND_BINARY_AS_BYTE_ARRAY);
        binaryLogClient.setEventDeserializer(eventDeserializer);
        binaryLogClient.registerEventListener(new BinaryLogClient.EventListener(){

            @Override
            public void onEvent(Event event) {
                System.out.println(event.toString());
            }
        });
        binaryLogClient.connect();
    }
}
