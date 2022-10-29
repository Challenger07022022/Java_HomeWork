package OOP_HomeWork6;


import OOP_HomeWork6.logger.Logger;
import OOP_HomeWork6.logger.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import static OOP_HomeWork6.IoProcessors.PROCESSORS;


public class Server {

    private static final String WWW = "\\Users\\Админ\\Desktop\\IT\\Java\\Java\\src\\main\\java\\OOP_HomeWork6\\www";

    private static final Logger logger = LoggerFactory.create();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            for (; ; ) {
                try (Socket socket = serverSocket.accept()) {
                    handleRequest(socket);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void handleRequest(Socket socket) throws IOException {
        logger.log("Client connected");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream(), StandardCharsets.UTF_8));

        PrintWriter writer = new PrintWriter(
                socket.getOutputStream());

        while (!reader.ready()) ;

        String[] items = {"", "", ""};
        if (reader.ready()) {
            String line = reader.readLine();
            System.out.println(line);
            items = line.split(" ");
        }

        while (reader.ready()) {
            logger.log(reader.readLine());
        }

        Path filePath = Path.of(WWW, items[1]);

        for (Map.Entry<Predicate<Path>, BiConsumer<Path, PrintWriter>> entry : PROCESSORS.entrySet()) {
            Predicate<Path> pred = entry.getKey();
            BiConsumer<Path, PrintWriter> processor = entry.getValue();
            if (pred.test(filePath)) {
                processor.accept(filePath, writer);
                break;
            }
        }

        writer.flush();
    }
}
