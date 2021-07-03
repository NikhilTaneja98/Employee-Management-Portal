package com.nagarro.sheet;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nagarro.model.Employee;

public class SheetDownloader extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "attachment: filename=\"user_list.xls\"");
		List<Employee> list = (List<Employee>) model.get("userList");
		Sheet sheet = workbook.createSheet("User list");
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Employee Code");
		header.createCell(1).setCellValue("Employee Name");
		header.createCell(2).setCellValue("Location");
		header.createCell(3).setCellValue("Email");
		header.createCell(4).setCellValue("Date Of Birth");
		int num = 1;
		for (Employee e : list) {
			Row row = sheet.createRow(num++);
			row.createCell(0).setCellValue(e.getEmployeeCode());
			row.createCell(1).setCellValue(e.getEmployeeName());
			row.createCell(2).setCellValue(e.getLocation());
			row.createCell(3).setCellValue(e.getEmail());
			row.createCell(4).setCellValue(e.getDateofbirth());

		}
	}

}