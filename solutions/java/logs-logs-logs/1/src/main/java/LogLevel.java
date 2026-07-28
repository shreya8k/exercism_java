public enum LogLevel {
    INFO("INF",4),
    TRACE("TRC",1),
    DEBUG("DBG",2),
    WARNING("WRN",5),
    ERROR("ERR",6),
    FATAL("FTL",42),
    UNKNOWN("unk",0);
    private final String msg;
    private final int no;
    LogLevel(String msg, int no){
        this.msg=msg;
        this.no=no;
    }
    public String getMessage(){
        return this.msg;
    }
    public int getNumber(){
        return this.no;
    }
}
