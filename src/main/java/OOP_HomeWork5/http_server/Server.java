// Дописать простейший веб сервер, который начали писать на вебинаре, чтобы он отправлял в качестве ответа
// на запрос содержимое файла из HTTP-запроса.

package OOP_HomeWork5.http_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        try {
            String pathDirWww = new File(".").getCanonicalPath() + "/www";
            ServerSocket serverSocket = new ServerSocket(8080); // создание серверного сокета с портом 8080

            for (; ; ) {
                Socket socket = serverSocket.accept(); // метод accept возвращает сокет
                System.out.println("Client connected");

                // BufferedReader() - преобразование для чтения в виде строк
                // getInputStream() - чтение потока байтов
                // InputStreamReader - преобразование байтов в символы
                // StandardCharsets.UTF_8 - кодировка считывания
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

                // считывание информации из сети
                PrintWriter writer = new PrintWriter(
                        socket.getOutputStream());

                while (!reader.ready()) ;

                String name = null;
                while (reader.ready()) {
                    String string = reader.readLine(); // считывание запроса который пришел
                    if (string.startsWith("GET")){
                        String[] split = string.split(" ");
                        if (split[1].equals("/"))
                            name = pathDirWww + "/index.html";
                        else {
                            name = pathDirWww + split[1];
                        }
                    }
                    System.out.println(string);
                }

                List<String> data = new ArrayList<>();
                try (Scanner scn = new Scanner(new File(name))){
                    data.add("HTTP/1.1 200 OK");
                    data.add("Content-Type: text/html; charset=utf-8");
                    data.add("");
                    while (scn.hasNext())
                        data.add(scn.nextLine());
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                    data.add("HTTP/1.1 404 Page not found");
                }

                for (String s : data) {
                    writer.println(s);
                }
                writer.flush(); // принудительное отправление забуферизированной информации по сеть

                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
