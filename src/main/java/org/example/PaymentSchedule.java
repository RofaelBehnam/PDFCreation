package org.example;

import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.BaseDirection;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import com.itextpdf.text.pdf.languages.LanguageProcessor;

import java.io.IOException;

public class PaymentSchedule {

    public static void main(String[] args) throws IOException {
        PdfWriter writer = new PdfWriter("src/main/resources/payment-schedule.pdf");
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        String text = "ملحق رقم (2) جدول االقساط";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);

        text = "يسدد الطرف الثاني للطرف األول ثمن الحصة وفقا للجدول االتي:";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        float [] pointColumnWidths = {250F, 250F, 250F};

        Table table = new Table(pointColumnWidths);

        Cell cell = new Cell();
        text = "حالة السداد";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "تاريخ السداد";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "المبلغ";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        document.add(table);

        pdfDocument.close();
    }

    private static void addArabicTextParagraph(String text, Document document, TextAlignment textAlignment) throws IOException {
        LanguageProcessor languageProcessor = new ArabicLigaturizer();
        Paragraph paragraph = new Paragraph (languageProcessor.process(text));
        paragraph.setFont(PdfFontFactory.createFont("src/main/resources/AeAlarabiya-WGzA.ttf"));
        paragraph.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        paragraph.setTextAlignment(textAlignment);
        document.add(paragraph);
    }

    private static void addArabicTextParagraphToCell(String text, Cell cell, TextAlignment textAlignment) throws IOException {
        LanguageProcessor languageProcessor = new ArabicLigaturizer();
        Paragraph paragraph = new Paragraph (languageProcessor.process(text));
        paragraph.setFont(PdfFontFactory.createFont("src/main/resources/AeAlarabiya-WGzA.ttf"));
        paragraph.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        paragraph.setTextAlignment(textAlignment);
        cell.add(paragraph);
    }
}
