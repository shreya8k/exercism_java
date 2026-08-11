public class LogLine {
    private String p;
    private String[] s=new String[2];
    public LogLine(String logLine) {
        p=logLine;
        s=p.split(": ");
    }
    public String first(String[] s){
        s[0]=s[0].replaceAll("[\\[\\]]","");
        return s[0];
    }
    public LogLevel getLogLevel() {
        for(LogLevel l:LogLevel.values()){
            if(first(s).equals(l.getMessage()))return l;
        }
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        return getLogLevel().getNo()+":"+s[1];
        
    }
}
