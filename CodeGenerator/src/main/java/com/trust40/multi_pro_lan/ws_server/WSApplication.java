package com.trust40.multi_pro_lan.ws_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WSApplication {
    public static void main(String[] args) throws InterruptedException, IOException {
        int port = 8887; // 843 flash policy port

        MPLWServer s = new MPLWServer(port);
        s.start();
        System.out.println("MPL Server started on port: " + s.getPort());

        BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String in = sysin.readLine();
            s.broadcast(in);
            if (in.equals("exit")) {
                s.stop(1000);
                break;
            }
        }
    }

}
