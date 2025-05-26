package org.example;

import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.BaseDirection;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import com.itextpdf.text.pdf.languages.LanguageProcessor;

import java.io.IOException;
import java.time.LocalDate;

public class ContractiTextPDF {
    public static void main(String[] args) throws IOException {
        PdfReader reader = new PdfReader("src/main/resources/contract.pdf");
        PdfWriter writer = new PdfWriter("src/main/resources/contract-modified.pdf");
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        Document document = new Document(pdfDocument);
        String text = "الخميس";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = LocalDate.now().toString() + "\n\n\n\n\n\n";
        addTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الطرف الأول  شركة صقر للاستثمار و الاستشارات اس دي سي سجل تجاري رقم 168454 و مقرها 72 شارع جمال الدين دويدار - مدينة نصر و يمثلها السيد الاستاذ احمد فكري حسن صقر بصفته رئيس مجلس الادارة";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        pdfDocument.close();
    }

    private static void addArabicTextParagraph(String text, Document document, TextAlignment textAlignment) throws IOException {
        LanguageProcessor languageProcessor = new ArabicLigaturizer();
        Paragraph paragraph = new Paragraph (languageProcessor.process(text));
        paragraph.setFont(PdfFontFactory.createFont("/home/rofael/Downloads/aealarabiya/AeAlarabiya-WGzA.ttf"));
        paragraph.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        paragraph.setTextAlignment(textAlignment);
        document.add(paragraph);
    }


    private static void addTextParagraph(String text, Document document, TextAlignment textAlignment) throws IOException {
        Paragraph paragraph = new Paragraph (text);
        paragraph.setTextAlignment(textAlignment);
        document.add(paragraph);
    }
}
