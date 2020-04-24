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

public class test {
    
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetCliente client = new GreetCliente();
        
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        //assertEquals("hello client", response);
    }

}
