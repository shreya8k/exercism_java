import java.time.*;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser=DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime dateTime=LocalDateTime.parse(appointmentDateDescription,parser);
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime appointmentTime=appointmentDate.toLocalTime();
        LocalTime t1=LocalTime.of(12,0);
        LocalTime t2=LocalTime.of(18,0);
        return (appointmentTime.equals(t1)|| (appointmentTime.isAfter(t1)&& appointmentTime.isBefore(t2)));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String time=formatter.format(appointmentDate);
        return "You have an appointment on "+time+".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9,15);
    }
}
