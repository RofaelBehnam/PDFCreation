package org.example;
import com.itextpdf.html2pdf.HtmlConverter;
import com.lowagie.text.Document;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.pdf.PdfWriter;

import java.io.*;

public class HTMLToPDF {
    public static final String HTML = "<html>\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\">" +
            "</head><body><h1>Hello</h1>"
            + "<p>This was created using iText</p>"
            + "<a href='hmkcode.com'>hmkcode.com</a></body></html>";
    public static void main(String[] args) throws IOException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("HtmlToPdf.pdf"));

        document.open();
        String htmlString = "<html><body> This is my Project </body></html>";
        HTMLWorker htmlWorker = new HTMLWorker(document);
        htmlWorker.parse(new FileReader("src/main/resources/html.html"));
        document.close();
//        HtmlConverter.convertToPdf(new FileReader("src/main/resources/html.html"), new FileOutputStream("src/main/resources/html.pdf"));
    }
}
