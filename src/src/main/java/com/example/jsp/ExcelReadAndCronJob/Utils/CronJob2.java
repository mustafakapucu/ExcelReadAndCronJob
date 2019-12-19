package com.example.jsp.ExcelReadAndCronJob.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJob2 {

	/*
	 * Every 5 minutes
	 */

	@Scheduled(cron = "0 */5 * * * *")
	public void CronJobSchedule2() {
		Date date = new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("d.M.y hh:mm:ss");
		String strDate = sdt.format(date);
		System.out.println("CronJobSchedule2 triggered on " + strDate);
	}
}
