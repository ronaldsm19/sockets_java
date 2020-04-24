/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;

/**
 *
 * @author ronal
 */
public class Server {

    public static void main(String[] args) throws IOException {
        GreetServer server = new GreetServer();
        System.out.println("estoy esperando");
        //server.start(6666);
        //server.startContinua(4444);
        EchoMultiServer em = new EchoMultiServer();
        em.start(5555);
    }

}
