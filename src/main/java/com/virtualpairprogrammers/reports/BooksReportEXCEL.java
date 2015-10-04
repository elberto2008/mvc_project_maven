package com.virtualpairprogrammers.reports;

import java.util.List;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;
import com.virtualpairprogrammers.domain.Book;




public class BooksReportEXCEL extends AbstractExcelView {

    protected void buildExcelDocument(	@SuppressWarnings("rawtypes") Map model,
    									HSSFWorkbook wb,
    									HttpServletRequest req,
    									HttpServletResponse resp)throws Exception 
        
    {   
    	
        
        HSSFSheet sheet = wb.createSheet("Book Report");
        @SuppressWarnings("unchecked")
		List<Book> books = (List<Book>)model.get("allBooks");
        

        
        for (int i=0; i < books.size(); i++) 
        {
            Book next = (Book)books.get(i);	   
        	
        	HSSFCell cell = getCell(sheet, 1+i, 0);
            setText(cell, next.getTitle());
            
        	cell = getCell(sheet, i+1, 1);
        	setText(cell, next.getAuthor());
        	
        	cell = getCell(sheet, i+1, 2);
        	setText(cell, ""+ next.getPrice());        	
        }
    }

}