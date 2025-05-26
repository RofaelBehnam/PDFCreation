package org.example;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.BaseDirection;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import com.itextpdf.text.pdf.languages.LanguageProcessor;

import java.io.IOException;
import java.time.LocalDate;

public class TryDocToPdfMain {
    public static void main(String[] args) throws IOException {
        PdfReader reader = new PdfReader("src/main/resources/contract.pdf");
        PdfWriter writer = new PdfWriter("src/main/resources/contract-modified-row.pdf");
        PdfDocument pdfDocument = new PdfDocument(reader, writer);
        Document document = new Document(pdfDocument);

        // Load Arabic-supporting font
        String fontPath = "src/main/resources/NotoNaskhArabic.ttf"; // Update path as needed
        PdfFont arabicFont = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);

        // Write Arabic text
        String arabicText1 = "الخميس";
        addArabicTextParagraph(arabicText1, document, arabicFont);

        String dateText = LocalDate.now().toString() + "\n\n\n\n\n\n";
        document.add(new Paragraph(dateText).setFont(arabicFont).setTextAlignment(TextAlignment.RIGHT));

        String arabicText2 = "الطرف الأول  شركة صقر للاستثمار و الاستشارات اس دي سي سجل تجاري رقم 168454 و مقرها 72 شارع جمال الدين دويدار - مدينة نصر و يمثلها السيد الاستاذ احمد فكري حسن صقر بصفته رئيس مجلس الادارة";
        addArabicTextParagraph(arabicText2, document, arabicFont);

        pdfDocument.close();
    }

    private static void addArabicTextParagraph(String text, Document document, PdfFont font) {
        Text arabic = new Text(text).setFont(font).setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        Paragraph paragraph = new Paragraph(arabic)
                .setTextAlignment(TextAlignment.RIGHT);
        document.add(paragraph);
    }
}
