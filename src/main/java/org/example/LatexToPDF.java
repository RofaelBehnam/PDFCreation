package org.example;

import com.aspose.tex.*;
import com.aspose.tex.rendering.PdfDevice;
import com.aspose.tex.rendering.PdfSaveOptions;

public class LatexToPDF {
    public static void main(String[] args) {
        // This code example demonstrates how to create a PDF from TeX source file.
// Working directory
        String dataDir = "/home/rofael/IdeaProjects/PDFEditor/src/main/resources/";

// Create typesetting options.
        TeXOptions options = TeXOptions.consoleAppOptions(TeXConfig.objectLaTeX());

// Specify a file system working directory for input.
        options.setInputWorkingDirectory(new InputFileSystemDirectory(dataDir));

// Specify a file system working directory for output.
        options.setOutputWorkingDirectory(new OutputFileSystemDirectory(dataDir));
// Specify memory stream as output terminal.
        options.setTerminalOut(new OutputMemoryTerminal());

// Set options for rendering into PDF format.
        options.setSaveOptions(new PdfSaveOptions());

// Run typesetting.
        TeXJob job = new TeXJob(dataDir + "sample.tex", new PdfDevice(), options);
        job.run();
    }
}
