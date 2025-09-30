package atv_Singleton;

class TcpChannel implements Channel {
    public String getMensagem() {
        String str = "mensagem TCP";
        Logger log = Logger.getInstancia();
        log.writeLog(str);
        log.close();
        return str;
    }
}
