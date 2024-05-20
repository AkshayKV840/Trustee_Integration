package com.trustee.common.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateUtil {

    private DateUtil() {
    }

    public static String convertOffsetToString(OffsetDateTime date) {
        OffsetDateTime dateTime = date.atZoneSameInstant(ZoneId.systemDefault()).toOffsetDateTime();
        return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public static String convertLocalToString(LocalDateTime date) {
        LocalDateTime dateTime = date.atZone(ZoneId.systemDefault()).toLocalDateTime();
        return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public static String convertLocalDateTimeForReportGeneration(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // For validation api
    public static String getReversedDate() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyMMdd"));

    }

    // Current Date Format for Report Generation
    public static String currentDateForReportGeneration() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Current Month Format for Report Generation
    public static String currentMonthForReportGeneration() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH));
    }

    // Month Format for Report Generation
    public static String monthForReportGeneration(OffsetDateTime dateTime) {
        return dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    // For EmiReferenceDate Conversion
    public static String emiDateMonthAndYearForReportGeneration(Integer day) {
        LocalDate currentDate = LocalDate.now();

        // If the emi day is greater than the last day of the current month
        if (day > currentDate.lengthOfMonth() || day == currentDate.lengthOfMonth()) {
            return currentDate.lengthOfMonth() + "/" + currentDate.getMonthValue() + "/" + currentDate.getYear();
        } else {
            return day + "/" + currentDate.getMonthValue() + "/" + currentDate.getYear();
        }
    }

    // For Download Center add Report Dto
    public static OffsetDateTime localDateTimeToOffsetDateTime(LocalDateTime localDateTime) {
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(5, 30);
        return localDateTime.atOffset(offset);
    }

    public static OffsetDateTime convertStringToOffsetDateTime(String date) {
        return OffsetDateTime.parse(date);

    }

    public static LocalDateTime convertOffsetToLocalDateTime(OffsetDateTime date) {
        return date.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
    }

}
