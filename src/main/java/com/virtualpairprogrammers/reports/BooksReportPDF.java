package com.virtualpairprogrammers.reports;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.virtualpairprogrammers.domain.Book;

public class BooksReportPDF extends AbstractPdfView
{
	protected void buildPdfDocument (	@SuppressWarnings("rawtypes") Map model,
										Document doc,
										PdfWriter writer, 
										HttpServletRequest req,
										HttpServletResponse resp)throws Exception 
	{
		@SuppressWarnings("unchecked")
		List<Book> books = (List<Book>)model.get("allBooks");
		PdfPTable table = new PdfPTable(4);
		
		for (Book next : books)
		{
			table.addCell(next.getIsbn());
			table.addCell(next.getTitle());
			table.addCell(next.getAuthor());
			table.addCell(""+next.getPrice());

			doc.addTitle("Listing of all the books in the system.");
			doc.addCreationDate();
			doc.add(table);
		}
		
	}

}
