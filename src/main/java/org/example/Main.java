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

public class Main {
    public static void main(String[] args) throws IOException {
        PdfReader reader = new PdfReader("src/main/resources/contract.pdf");
        PdfWriter writer = new PdfWriter("src/main/resources/contract-modified.pdf");
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        addContentToDocument(pdfDocument);
        pdfDocument.close();
    }

    private static void addContentToDocument(PdfDocument pdfDocument) throws IOException {
        Document document = new Document(pdfDocument);
        document.add(new Paragraph("\n\n\n"));
        String paragraph = "أهلا و سهلا بالجميع";
        LanguageProcessor languageProcessor = new ArabicLigaturizer();

        Paragraph para_obj = new Paragraph (languageProcessor.process(paragraph));
        para_obj.setFont(PdfFontFactory.createFont("src/main/resources/AeAlarabiya-WGzA.ttf"));
        para_obj.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        para_obj.setTextAlignment(TextAlignment.RIGHT);
        document.add(para_obj);
    }
}