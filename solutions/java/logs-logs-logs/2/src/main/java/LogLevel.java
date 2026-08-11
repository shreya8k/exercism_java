public enum LogLevel {
    TRACE("TRC",1),
    DEBUG("DBG",2),
    INFO("INF",4),
    WARNING("WRN",5),
    ERROR("ERR",6),
    FATAL("FTL",42),
    UNKNOWN("XYZ",0);
    private String msg;
    private int no;
    LogLevel(String message,int no){
        this.msg=message;
        this.no=no;
    }
    public String getMessage(){
        return this.msg;
    }
    public int getNo(){
        return this.no;
    }
}
