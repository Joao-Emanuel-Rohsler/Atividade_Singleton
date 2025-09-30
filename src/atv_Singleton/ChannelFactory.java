package atv_Singleton;

class ChannelFactory {
    public static Channel create(int tipo) {
        if (tipo == 1) {
            System.out.println("Criando objeto TcpChannel");
            return new TcpChannel();
        }
        
        System.out.println("Criando objeto UdpChannel");
        return new UdpChannel();

    }
}