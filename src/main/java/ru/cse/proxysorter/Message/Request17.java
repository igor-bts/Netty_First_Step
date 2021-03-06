package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;

public class Request17 extends Request4All {

    //Метод использует ТСД для снятия мешка
    //Передаёт ШК пломбы и ШК выхода
    public static final byte MESSAGE_CODE=111;
    public static final int MESSAGE_LENGHT=133;

    private short smlSTX            = 0x02;
    private short Command           = 0x13;
    private byte ExitNumber         = 0x31;
    private  byte Reserv            = 0x1C;
    private short smlETX            = 0x03;
    private String BagBarCode       = "";

    public byte getExitNumber() {
        return ExitNumber;
    }

    public  short getCommand() {
        return Command;
    }

    public String getBagBarCode() {
        return BagBarCode;
    }

    @Override
    public ByteBuf ToByte() {
        return null;
    }

    @Override
    public void FromByte(ByteBuf msg) {

        byte[] Array    = new byte[128];

        smlSTX          = msg.readUnsignedByte();
        Command         = msg.readUnsignedByte();
        ExitNumber      = msg.readByte();
        msg.readBytes(Array);
        BagBarCode      = new String(Array);
        Reserv          = msg.readByte();
        smlETX          = msg.readUnsignedByte();
    }
}
