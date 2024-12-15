public class ConfiguracaoSistemaSingleton {
    private static ConfiguracaoSistemaSingleton config = null;

    private ConfiguracaoSistemaSingleton() {

    }

    public static ConfiguracaoSistemaSingleton getInstancia() {
        if (config == null) {
            config = new ConfiguracaoSistemaSingleton();
        }
        return config;
    }
}