/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pg.chat.client.conn;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch.pg.chat.client.view.ClientControll;

/**
 *
 * @author IDEA Developers
 */
public class Client {
    private static Client instance;
    private Socket socketConn;
    private InputStreamReader isr;
    private OutputStreamWriter osw;
    
    private ClientControll mi;
    
    public static Client getInstance(){
        if(instance == null){
            instance = new Client();
        }
        return instance;
    }
    
    public void connectToServer(ClientControll clientControll) throws Exception{
        this.mi = clientControll;
        System.out.println("Connection to server...");
        socketConn = new Socket("localhost", 3535);
        isr = new InputStreamReader(socketConn.getInputStream());
        osw = new OutputStreamWriter(socketConn.getOutputStream());
        System.out.println("Conneted to server");
        listenForMessages();
    }
    
    public void listenForMessages(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        char[] charMessage = new char[1024];
                        if(isr.read(charMessage, 0, charMessage.length) != -1){
                            String message = new String(charMessage);
                            mi.onMessageReceived(message);
                            System.out.println(message);
                        }
                    }catch(Exception e){
                        System.err.println(e.getMessage());
                    }
                }
            }
        }).start();
    }
    
    public void sendMessage(String message)throws Exception{
        osw.write(message);
        osw.flush();
    }
}