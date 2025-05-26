package org.example;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;
import com.aspose.pdf.HtmlMediaType;

import java.nio.file.Paths;

public class HTMLAspose {
    public static void main(String[] args) {
        String DATA_DIR = "/home/rofael/IdeaProjects/PDFCreation/src/main/resources/";
        // Create a HTML LoadOptions
        HtmlLoadOptions options = new HtmlLoadOptions();

        // Set Print or Screen mode
        options.setHtmlMediaType(HtmlMediaType.Print);

        // Initialize document object
        String htmlFileName = Paths.get(DATA_DIR.toString(), "html.html").toString();
        Document document = new Document(htmlFileName, options);

        // Save output PDF document
        document.save(Paths.get(DATA_DIR.toString(), "html.pdf").toString());
        document.close();
    }
}
