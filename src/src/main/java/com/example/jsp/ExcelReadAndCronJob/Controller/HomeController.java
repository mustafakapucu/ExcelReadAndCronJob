package com.example.jsp.ExcelReadAndCronJob.Controller;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.jsp.ExcelReadAndCronJob.Utils.Test;

@Controller
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public String Index() {
		return "index";
	}

	@PostMapping("/index")
	public String Index(@RequestParam("excelFile") MultipartFile exceFile) throws IOException {

		java.util.List<Test> tempStudentList = new ArrayList<Test>();
		XSSFWorkbook workbook = new XSSFWorkbook(exceFile.getInputStream());
		XSSFSheet worksheet = workbook.getSheetAt(0);

		for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
			Test tempStudent = new Test();

			XSSFRow row = worksheet.getRow(i);

			tempStudent.setId(row.getCell(0).getStringCellValue());
			tempStudent.setContent(row.getCell(1).getStringCellValue());
			tempStudentList.add(tempStudent);
		}

		return "index";
	}
}
