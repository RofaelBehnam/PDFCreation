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
import java.time.LocalDate;

public class Contract {
    public static void main(String[] args) throws IOException {
        PdfWriter writer = new PdfWriter("src/main/resources/contract-modified.pdf");
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        String text = "عقد بيع ابتدائي";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "انه في يوم " + LocalDate.now();
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "قد تحرر هذا العقد فيما بين كل من :-";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الطرف الاول :- شركة صقر للاستثمار والاستشارات اس دي سي سجل تجاري رقم 168454";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ومقرها 72 شارع جمال الدين دويدار – مدينة نصر ويمثلها السيد الاستاذ / احمد فكري حسن صقر بصفته رئيس مجلس الادارة";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "(طرف أول بائع)";
        addArabicTextParagraph(text, document, TextAlignment.LEFT);
        text = "تعريفات :-";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        float [] pointColumnWidths = {500F, 100F};

        Table table = new Table(pointColumnWidths);

        Cell cell = new Cell();
        text = "هذا التعاقد ومرفقاته المشار إليها بمتنه، وملاحقه التي تلحق به باتفاق الطرفين وتوقيعهما.";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "العقد:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "شركة صقر للاستثمار والاستشارات اس دي سي - البائع.";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "الطرف الأول:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "الطرف الثاني:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "الشركة المالكة للمشروع:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "المشروع:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "تفاصيل الوحدة:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "هو العقد المحرر بتاريخ ${original_contract_date} فيما بين الشركة المالكة للمشروع والطرف الأول والمرفق بهذا العقد بالملحق رقم .(1)";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "العقد الأصلي:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "    1) ملخص العقد الاصلي و 2) جدول سداد الاقساط و (3 التفويض لشركة السمسرة و (4 تفاصيل الحساب البنكي للطرف الثاني";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "المرفقات:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "نسبة ملكية الطرف الثاني في الوحدة محل العقد وقدرها ";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "النسبة:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "عدد الحصص التي قام الطرف الثاني بشرائها في الوحدة محل العقد والتي تمثل نسبة ملكيته في نفس الوحدة ";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "حصة:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "ما تم سداده فعليا من قبل الطرف الثاني بالإضافة إلى حافز الفسخ";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        cell = new Cell();
        text = "مقابل الفسخ:";
        addArabicTextParagraphToCell(text, cell, TextAlignment.RIGHT);
        table.addCell(cell);

        document.add(table);

        text = "تمهيد";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);

        text = "فيمتلك الطرف الأول بموجب العقد المؤرخ في ${original_contract_date}";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وملحقه المؤرخ في  ${date} وحدة رقم ${unit_number} على قطعة رقم ${plot_number}";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وقد تقدم (الطرف الثاني) المشتري برغبته في شراء جزء من الوحدة محل التعاقد على أقساط بالألية التي سترد تباعاً بعد أن عاين";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "المشروع المعاينة التامة النافية للجهالة وقد اتفقا الطرفين على ان يتم هذا البيع وفقا لشروط هذا العقد";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الأول";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "يعتبر التمهيد جزء لا يتجزأ من هذا العقد وشرطا من شروطه ومتمما له كما تعتبر كافة الملاحق المرفقة بهذا العقد جزء لا يتجزأ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "من العقد ومتممة له ومكمله له";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثاني";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "باع الطرف الاول الي الطرف الثاني القابل لذلك بيعا موقوفاً على سداد كامل الثمن ما هو نسبة ${seconed_part_ownershippercentage} علي";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "علي الشيوع من الوحدة محل العقد المتمثلة ف  ${number_of_shares} بمشروع ${project_name} بالقطعة رقم ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "و البالغ مساحتها ${area}م متر تقريبا بذات المواصفات والاشتراطات المبنية علي وجه التفصيل بعقد البيع الأصلي" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " وملاحقه بالمحلق رقم";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثالث";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "كما اتفق الطرفان على ان يتم هذا البيع نظير ثمنا اجمالي ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "قدره ${tafket_total_shares_price} جنية مصري فقط لا غير ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "غير شاملة رسوم إعادة البيع يتم سدادها على النحو التالي:";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "دفع منها الطرف الثاني الي الطرف الاول عند التوقيع على هذا العقد مبلغا";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " وقدرة ${tafket_paid_amount} جنيها فقط جنية مصري لا غير والباقي " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text ="قدرة   ${tafket_remaining_amount} جنيها فقط  جنيه مصري لا غير " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ويسدد الباقي على اقساط على النحو المبين في الجدول بالملحق " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "رقم من ملاحق هذا العقد ولا تبرأ ذمة الطرف الثاني(المشتري) وتكون يد الطرف الثاني ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "على الحصة محل العقد موضوع العقد يد عارضة - لا يحق له التصرف فيها بأي نوع من أنواع التصرفات";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "سواء البيع أو التنازل أو ترتيب أي حق عيني أصلي أو تبعي عليها الا وفقا لأحكام هذا العقد ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وبعد سداد كامل الثمن. والوفاء الكامل لتلك الأقساط الموضحة في" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text =" الملحق رقم (2) في مواعيدها المتفق عليها بما فيها دفعه وديعة الصيانة ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ولا يحق للطرف الثاني بيع الحصة قبل سداد كامل الثمن الا بعد" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " الحصول على موافقة الطرف الأول الكتابية وسداد الرسوم المرتبطة ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "بها لصالح الطرف الاول واذا قام الطرف الثاني بأحضار مشتري جديد للحصة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " يقوم بدفع رسوم ادارية 5000 (فقط خمسة الاف جنية مصري فقط لاغير ) " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "اويقوم بدفع رسوم إدارية تمثل 5% من اجمالي قيمة المبالغ المدفوعة حتي تاريخ بيع الحصة ايهما اقل";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وفي حال توفير منصة فريدة للمشتري تتم العملية داخل المنصه ويتحصل رسوم ادارية 4% علي جميع عمليات الدفع ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "التي تتم داخل المنصه بالإضافة الي التزام المشتري الجديد بكافة بنود هذا العقد ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وملحقاته وسداد باقي الأقساط المستحقة";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الرابع";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "في حالة تأخر الطرف الثاني (المشتري) عن التزامه بسداد اي قسط من الاقساط المستحقة عليه " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "والمبينة بالملحق رقم (2) في المواعيد المحددة لها لاي سبب كان " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "بما في ذلك دفعة الصيانة اكثر من 15 يوما يلتزم الطرف الثاني بسداد القسط المتأخر " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "مع القسط المستحق في الشهر التالي بالإضافة الي القسط الذي يليه دفعة واحدة في تاريخ استحقاق القسط القادم";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ويصبح الامتناع عن القسط مستقبلا او تخلف الطرف الثاني عن سداد قسطين متتالين وفقا للمحلق رقم (2) يعتبر هذا العقد مفسوخا " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "من تلقاء نفسه دون الحاجة الي تنبيه او انذار او استصدار حكم قضائي او اتخاذ اي اجراء قضائي " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وبالتالي يعتبر البيع موضوع هذا العقد كأن لم يكن . وفي هذه الحالة يحق للطرف الاول خصم مبلغ يعادل نسبة " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "قدرها (10%) من اجمالي قيمة الحصة وفي هذه الحالة " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "يحق للطرف الأول بالتصرف في الحصة محل العقد بكافة انواع التصرف المقررة قانونا للمالك في ملكه مع " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "التزام الطرف الاول بعد تصرفه بالبيع في الحصة  المذكورة " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "بأن يرد للطرف الثاني المبالغ التي سبق وان سددها الاخير له وبنفس الكيفية التي قام " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الطرف الثاني بسدادها  علي ان يبدأ هذا الاسترداد بعد مضي ثلاثة اشهر" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " من تاريخ فسخ العقد ودون اي اعتراض من الطرف الثاني مستقطعا منها" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " مبلغ يعادل نسبة قدرها (10%) من القيمة الإجمالية للحصة " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وهي تمثل كافة المصاريف التي تكبدها الطرف الاول تعويضا عن التسبب" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " في فسخ العقد ودون اي اعتراض من الطرف الثاني ويعتبر هذا تعويض اتفاقي ارتضاه الطرفين " ;
        text = "وليست لاي جهة قضائية رقابه عليه";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الخامس";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "في حالة وفاة الطرف الثاني قبل سداد كامل ثمن الحصة يحق لورثة الطرف الثاني (المشتري) ان " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " يتقدموا بطلب استرداد ما تم دفعة ويلتزم ورثة الطرف الثاني (المشتري) بأخطار الطرف الأول كتابيا " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "بقرارهم ويتم البت في الطلب خلال 7 أيام ويتم رد المبالغ التي تم دفعها بنفس الكيفية علي ان يبدا الاسترداد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " بعد مضي ثلاثة أشهر اما اذ قرروا ورثة الطرف الثاني (المشتري) استكمال دفع المبلغ المتبقي بما في ذلك  " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " وديعة الصيانة يتم منح ورثة الطرف الثاني فترة سماح مدتها شهر قبل استكمال سداد باقي الأقساط " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "فيتحمل ورثة الطرف الثاني كافة الالتزامات المالية المترتبة على (المشتري) وفقا لشروط هذا العقد وملحقاته " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " فيتحمل ورثة الطرف الثاني جميع الأقساط المتبقية والموضحة بالملحق رقم (2) وكافة الالتزامات المالية " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الأخرى المترتبة على الوحدة بما في ذلك الغرامات التي قد تترتب على التأخير في سداد أي قسط من الأقساط المستحقة";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند السادس";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "مع عدم الاخلال بما ورد بالبند الثالث بالعقد تحتفظ الشركة الطرف الاول بحق امتياز البائع علي الوحدة المبيعة وما يخصها" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " وما يتبعها من ملحقات وذلك لضمان سداد باقي الاقساط وفوائدها وملحقاتها القانونية والمصاريف واي مبالغ اخري" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " تكون مستحقه على المشتري الطرف الثاني ويحظر علي الطرف الثاني أن يتصرف أو يتنازل للغير عن الحصه بموجب هذا" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " العقد بأي صورة من صور التصرف أو التنازل أو تقديمه كحصة عينية في شركة أو اي صورة من صور الاستغلال أو غير " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ذلك من التصرفات، أو تقرير حق ارتفاق عليها أو رهنها رسميا الا وفقا لأحكام هذا العقد ولا يحق للطرف الثاني" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " ان يبيع النسبة قبل مرور عام من تاريخ الشراء (الا في حالة الحصول علي موافقة كتابية من الطرف الأول)";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند السابع";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "لا يحق للطرف الثاني المطالبة بقسمة الوحدة محل العقد وذلك لمدة خمسة سنوات من تاريخ سداد كامل الثمن ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وفقا للبند الثالث هذا العقد";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثامن";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "يقر الطرف الثاني بأنه يفوض شركة (صقر للاستثمار والاستشارات اس دي سي)(ش.ذ.م.م)" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " بالتوقيع بالنيابة عن الطرف الثاني فيما يخص الحصة/الحصص محل هذا العقد سواء، على سبيل المثال لا الحصر، " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "فسخ هذا العقد واستلام اي مقابل مرتبط بفسخ هذا العقد وذلك بموجب التفويض المرفق بالملحق رقم (3) من هذا العقد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ويحق للطرف الأول فسخ العقد قبل استلام الوحدة محل العقد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وبشرط تحقيق 80% ربح ويلتزم الطرف الاول باخطار شركة (صقر للاستثمار والاستشارات اس دي سي) والطرف الثاني " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "بسعر الوحدة محل العقد وفقا لتقيم مقيم عقاري معتمد وتلتزم شركة (صقر للاستثمار والاستشارات اس دي سي) في خلال 7 أيام" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " بحد أقصى بالتوقيع على عقد الفسخ المزعم ابرامه مع الطرف الأول ويلتزم الطرف الأول برد ما تم سداده فعليا " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "من قبل الطرف الثاني بالإضافة إلى حافز الفسخ يسدد الى الطرف الثاني من هذا العقد خلال 30 يوما من تاريخ الفسخ " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "في حال التزام الطرف الثاني أو من يفوضه بالتوقيع على عقد الفسخ المدة المذكورة، يستحق الطرف الثاني حافز الفسخ نظير " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "مجهوداته من تاريخ التوقيع على هذا العقد وحتى تاريخ الفسخ والمقدر بفارق ما تم سداده من سعر النسبة من تاريخ " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "شراء الحصة حتى تاريخ فسخ العقد في خلال 30 يوما من تاريخ الفسخ مخصوما منه اية ضريبة مستحقة او رسوم الفسخ " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "(وتلتزم شركة (صقر للاستثمار والاستشارات اس دي سي) او الطرف الثاني بالتوقيع على عقد الفسخ واية عقود او مستندات" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " مرتبطة بالاستلام ويحق لشركة صقر للاستثمار والاستشارات اس دي سي استلام حافز الفسخ نيابة عن الطرف الثاني " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "علي ان تقوم بإيداع حافز الفسخ لحساب الطرف الثاني بموجب التفويض المرفق بالملحق رقم (3) من هذا العقد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "في حالة فسخ الطرف الثاني عقد التفويض لشركة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " (صقر للاستثمار والاستشارات اس دي سي) المرفق بالملحق رقم (3) ولم يلتزم الطرف الثاني بالتوقيع على عقد الفسخ " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "خلال سبعة ايام من تاريخ الاخطار، يحق للطرف الاول فسخ هذا العقد دون الحاجة الي انذار او اعذار او حكم قضائي مع " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "التزام الطرف الاول برد ما تم سداده فعليا من قبل الطرف الثاني ولا يستحق الطرف الثاني في هذه الحالة حافز الفسخ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند التاسع";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "يحق للطرف الأول فسخ هذا العقد في حالة الغاء الطرف الثاني تفويض شركة (صقر للاستثمار والاستشارات اس دي سي)" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " مع التزام الطرف الاول بسداد القيمة المدفوعة من قبل الطرف الثاني للطرف الثاني بنفس طريقة السداد" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " وخلال نفس المدة. بحق للطرف الأول خصم مبلغ يعادل نسبة قدرها (10%) من إجمالي قيمة الحصة  كتعويض اتفاقي بين " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الاطراف غير خاضع لرقابة القضاء ودون الحاجة لإنذار او تنبيه او حكم قضائي، خلافا للتعويض المنصوص عليه بالبند";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند العاشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "حيث لا يحق الطرف الثاني او خلفه العام او خلفه " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الخاص ان يلوح بالحق في الشفعة في اي بيع يصدر من الطرف الاول للغير لاي وحده من وحدات المملوكة له بالمشروع " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الكائن به الوحدة المبيعة مقرا بأن توقيعه على العقد بمثابة موافقة صريحه واقرار منه بتنازله عن هذا الامر";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الحادي عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "لا يتم تسجيل الوحدة محل العقد الا بعد سداد كامل ثمن الوحدة والمستحقات المالية والفوائد والاقساط";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثاني عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "إذا أصبح أي نص من نصوص العقد أو أي من ملحقاته باطلا أو مخالفا لأحكام القانون" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " أو غير قابل للتنفيذ بموجب أحكام القانون فلا يؤثر ذلك على قانونية وصلاحية وسريان باقي نصوص العقد وملحقات";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثالث عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "يتحمل كل طرف بنسبة حصته في الوحدة أي ضرائب أو رسوم أيا كانت نوعها أو الدمغات المتعلقة بممارسة نشاطه، " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "أو أرباحه أو إي ايراداته أو تنفيذه لالتزاماته الواردة بهذا العقد ويلتزم الطرف الاول باستقطاع نسبة من اجمالي قيمة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " (حافز الفسخ) لسداد الضريبة المرتبطة بحافز الفسخ وتوريدها الي مصلحة الضرائب نيابة عن الطرف الثاني ولمصلحته.";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الرابع عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "يضمن ويتعهد ويلتزم ويقر كل طرف للآخر بالمحافظة على سرية " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "المعلومات المتعلقة بهذا العقد ووجوده والوحدة وكافة المعلومات والبيانات التي تحصّل عليها وتم الإفصاح عنها" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " من أي طرف أو أي من ممثليهما قبل و/أو أثناء و/أو بعد إبرام هذا العقد، كما يلتزم الاطراف بعدم الإفصاح عن " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "المعلومات التي تتعلق بالعقد والمفاوضة والسعر والأحكام الخاصة الواردة بهذا العقد والإجراءات التابعة له والمعلومات " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "المتعلقة بنشاط الأطراف وعملياتهما وأصولهما وتعاملاتهما التجارية بالإضافة إلى أي معلومات أخرى يتم الإفصاح عنها " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "والإبلاغ بها من خلال الأطراف سواء تم هذا الإفصاح كتابة أو إلكترونيا إلا ما قد يستلزمه القانون من إفصاح من قِبل " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "أي من الأطراف أو حكم قضائي ولا يسرى هذا الالتزام على المعلومات المتاحة للعامة أو ما تطلبه البورصة المصرية " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "طبقا لقواعد الإفصاح المنصوص عليها بالقانون وبقواعد قيد واستمرار وشطب الأوراق المالية بالبورصة المصرية";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الخامس عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "في حالة عدول الطرف الثاني عن اتمام عملية البيع بعد توقيع هذا العقد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "ولاي سبب كان يلتزم الطرف الثاني بأخطار الطرف الأول كتابيا بقراره خلال مدة لا تتجاوز 7 أيام من تاريخ العدول " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "وفي هذه الحالة يحق للطرف الأول بخصم نسبة (10%) من اجمالي قيمة الحصة المباعة وان يرد للطرف الثاني المبالغ " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "التي سبق وان سددها بنفس الكيفية التي قام الطرف الثاني بسدادها على ان يبدأ هذا الاسترداد بعد مضي ثلاثة أشهر" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " من تاريخ العدول عن إتمام البيع ويعتبر هذا تعويض اتفاقي ارتضاه الطرفين وليست لاي جهة قضائية رقابة عليه";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند السادس عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "في حالة اخلال الشركة المالكة للمشروع بأي من التزاماتها المنصوص عليها في العقد الأصلي" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " أو بموجب القوانين واجبة التطبيق يفسخ هذا العقد من تلقاء نفسه من تاريخ ابلاغ الطرف الأول للطرف " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الثاني بذلك الاخلال. يقوم الطرف الاول بسداد القيمة المستردة من قبل الشركة المالكة للمشروع والتي تعادل القيمة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " المدفوعة من قبل الطرف الثاني للطرف الثاني بنفس طريقة الاسترداد من الشركة المالكة للمشروع وخلال نفس المدة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " المستردة خلالها وفقا لأحكام العقد الأصلي. يقر الطرف الثاني بانه لا يحق له الرجوع على الطرف الأول بالتعويض";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند السابع عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "من المتفق عليه ان العنوان الموضح لكل طرف بصدر " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "هذا العقد هو الموطن القانوني الصحيح له وان أي مكاتبات، مراسلات، او اعلانات او خلافه عليه صحيحة" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " ونافذة قانونا ما لم يخطر اي من الطرفين الاخر بتغير العنوان بخطاب موصي عليه اقصاه اسبوع من هذا التاريخ";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند الثامن عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "في حالة مخالفة الطرف الثاني اي بند من بنود العقد يفسخ هذا العقد دون الحاجة الي تنبيه او انذار او اللجوء الي القضاء" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " مع حق الطرف الاول في الرجوع على الطرف الثاني بكافة التعويضات اللازمة والتي يراها الطرف الاول في هذا الشأن";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند التاسع عشر";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "تختص محاكم القاهرة بكافة درجاتها في الفصل في اي نزاع قد ينشأ" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = " عن هذا العقد بسبب الإخلال أو الامتناع عن تنفيذ أي شرط من شروط هذا العقد أو الخلاف حول تفسيره أو تطبيقه";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        text = "البند العشرون";
        addArabicTextParagraph(text, document, TextAlignment.CENTER);
        text = "حرر هذا العقد من نسختين تحتوي كل نسخة على عدد (6 صفحات) بيد " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "كل طرف نسخه للعمل بها عند اللزوم وكذلك عدد 4 ملاحق وهي مبينة عل النحو التالي: -" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الملحق الاول :-ملخص العقد الاصلي" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الملحق الثاني :-جدول سداد الاقساط " ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "المحلق الثالث :-التفويض" ;
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);
        text = "الملحق الرابع :-تفاصيل الحساب البنكي للطرف الثاني";
        addArabicTextParagraph(text, document, TextAlignment.RIGHT);

        pdfDocument.close();
    }

    private static void addArabicTextParagraph(String text, Document document, TextAlignment textAlignment) throws IOException {
        LanguageProcessor languageProcessor = new ArabicLigaturizer();
        Paragraph paragraph = new Paragraph (languageProcessor.process(text));
        paragraph.setFont(PdfFontFactory.createFont("/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf"));
        paragraph.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        paragraph.setTextAlignment(textAlignment);
        document.add(paragraph);
    }

    private static void addArabicTextParagraphToCell(String text, Cell cell, TextAlignment textAlignment) throws IOException {
        LanguageProcessor languageProcessor = new ArabicLigaturizer();
        Paragraph paragraph = new Paragraph (languageProcessor.process(text));
        paragraph.setFont(PdfFontFactory.createFont("/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf"));
        paragraph.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
        paragraph.setTextAlignment(textAlignment);
        cell.add(paragraph);
    }
}
