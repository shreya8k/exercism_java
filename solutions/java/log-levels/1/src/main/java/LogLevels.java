public class LogLevels {
    
    public static String message(String logLine) {
        String[] s=logLine.split(":");
        return s[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] s=logLine.split(":");
        s[0]=s[0].replaceAll("[\\[\\]]","").toLowerCase();
        return s[0];
    }

    public static String reformat(String logLine) {
        String[] s=logLine.split(":");
        s[0]=s[0].replaceAll("[\\[\\]]","").toLowerCase();
        return s[1].trim()+" ("+s[0]+")";
    }
}
