package cohesion.temporal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InitializationProcess {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(LoggerInitializer::initializedLogger);
        executor.submit(ConfigLoader::loadConfigs);
        executor.submit(DatabaseInitializer::initializeDatabase);

        executor.shutdown();
    }
}
