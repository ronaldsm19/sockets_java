/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;

/**
 *
 * @author ronal
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        test t = new test();
        GreetCliente client = new GreetCliente();
//        client.startConnection("127.0.0.1", 6666);
//        String response = client.sendMessage("hello server");
//        if (response == "hello client") {
//            System.out.println("HOLAAAA");
//        }

        ////////CONTINUO//////
//        client.startConnection("127.0.0.1", 4444);
//        String resp1 = client.sendMessage("hello");
//        if (resp1.equals("hello")) {
//            System.out.println("hello");
//        }
//
//        String resp2 = client.sendMessage("world");
//        System.out.println("world");
//        String resp3 = client.sendMessage("!");
//        System.out.println("!");
//        String resp4 = client.sendMessage(".");
//        System.out.println("good bye");
//        client.stopConnection();
        //t.givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect();

        ////////////////////MULTI SERVER
        GreetCliente client1 = new GreetCliente();
        client1.startConnection("127.0.0.1", 5555);
        String msg1 = client1.sendMessage("hello");
        String msg2 = client1.sendMessage("world");
        String terminate = client1.sendMessage(".");
        System.out.println("hello");
        System.out.println("world");
        System.out.println("bye");

        GreetCliente client2 = new GreetCliente();
        client2.startConnection("127.0.0.1", 5555);
        String msg11 = client2.sendMessage("hello");
        String msg22 = client2.sendMessage("world");
        String terminate2 = client2.sendMessage(".");
        System.out.println("hello 2");
        System.out.println("world 2");
        System.out.println("bye 2");
    }

}
