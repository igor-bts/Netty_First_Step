/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 *
 * @author Oleynik
 */
public class Responce12 extends Request4All {

    
    private byte Command    = 0x12;
    public byte msgSTX      = 0x02;
    public byte msgETX      = 0x03;
    private short codeProduct =1000;
    private byte ExitNumber   = 0x00;


    public byte getCommand() {
        return Command;
    }

    /**
     * @param Command the Command to set
     */
    public void setCommand(byte Command) {
        this.Command = Command;
    }

    /**
     * @return the codeProduct
     */
    public short getCodeProduct() {
        return codeProduct;
    }

    /**
     * @param codeProduct the codeProduct to set
     */
    public void setCodeProduct(short codeProduct) {
        this.codeProduct = codeProduct;
    }

    /**
     * @return the ExitNumber
     */
    public byte getExitNumber() {
        return ExitNumber;
    }

    /**
     * @param ExitNumber the ExitNumber to set
     */
    public void setExitNumber(byte ExitNumber) {
        this.ExitNumber = ExitNumber;
    }
      
    @Override
    public ByteBuf ToByte() {

        byte[] answer = new byte[]{0x02,0x12,0x43,0x66,0x28,0x03};
        msgSTX  = 0x02;
        setCommand((byte) 0x12);
        setCodeProduct((short) 9999);
        setExitNumber((byte) 40);
        msgETX      = 0x03;

        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(answer);

        return  buf;
    }

    @Override
    public void FromByte(ByteBuf msg) {

    }
}
