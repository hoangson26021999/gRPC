import impl.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.Arrays;

public class GrpcServer {
    public static void main(String[] args) {
        Server server = ServerBuilder
                .forPort(8090)
                .addService(new HelloServiceImpl()).build();
        try {
            server.start();
            server.awaitTermination();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}