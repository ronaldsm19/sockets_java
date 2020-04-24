/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.net.*;
import java.io.*;

public class GreetCliente {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    GreetCliente client;
    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    //@Before
    public void setup() throws IOException {
        
        client.startConnection("127.0.0.1", 4444);
    }

    public void tearDown() throws IOException {
        client.stopConnection();
    }
}
