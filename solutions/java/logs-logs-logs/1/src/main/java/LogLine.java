public class LogLine {
private String p;
    
    public LogLine(String logLine) {
        p=logLine;
        first();second();
    }
    private String f;
    private String s;
    public void first(){
    String[] arr=p.split(":");
    f=arr[0].replaceAll("\\[|\\]","").trim();
    }
    public void second(){
    String[] arr=p.split(":");
    s= arr[1].trim();
    }
    public LogLevel getLogLevel() {
            for(LogLevel l: LogLevel.values()){
                if(l.getMessage().equals(f))return l;
            }
            return LogLevel.UNKNOWN;
        
    }

    public String getOutputForShortLog() {
        return getLogLevel().getNumber()+":"+s;
    }
}
