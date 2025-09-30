package atv_Singleton;

class UdpChannel implements Channel {
    public String getMensagem() {
        String str = "mensagem UDP";
        Logger log = Logger.getInstancia();
        log.writeLog(str);
        log.close();
        return str;
    }
}
