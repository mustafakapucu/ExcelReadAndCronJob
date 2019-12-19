package com.example.jsp.ExcelReadAndCronJob.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJob {

	/*
	 * Every 5 minutes
	 */
	@Scheduled(cron = "1 * * * * *")
	public void CronJobSchedule() {
		Date date = new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("d.M.y hh:mm:ss");
		String strDate = sdt.format(date);
		System.out.println("CronJobSchedule triggered on " + strDate);
	}
}
