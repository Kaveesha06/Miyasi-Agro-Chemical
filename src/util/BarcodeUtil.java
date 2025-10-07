package util;

import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.java2d.Java2DCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;

public class BarcodeUtil {

    public static BufferedImage generateBarcode(String data, int width, int height) {
        Code128Bean bean = new Code128Bean();
        final int dpi = 150;

        // configure barcode
        bean.setModuleWidth(UnitConv.in2mm(4.5f / dpi));
        bean.setBarHeight(height - 20); // adjust height to fit label
        bean.doQuietZone(true);

        BufferedImage bitmap = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D g2d = bitmap.createGraphics();
        try {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, width, height);
            g2d.setColor(Color.BLACK);

            Java2DCanvasProvider provider = new Java2DCanvasProvider(g2d, 0);
            bean.generateBarcode(provider, data);

        } finally {
            g2d.dispose();
        }
        return bitmap;
    }



    public static void printBarcode(String id, String name, double price) throws PrinterException {
        // define label size ~2cm x 1cm at 150 DPI (120px x 60px)
        int labelWidth = 295;
        int labelHeight = 100;

        BufferedImage barcode = generateBarcode(id, labelWidth, labelHeight / 2);

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable((g, pf, pageIndex) -> {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());

            // Draw barcode (top part)
            g.drawImage(barcode, 0, 0, labelWidth, labelHeight / 2, null);

            // Set font
            g.setFont(new Font("Arial", Font.PLAIN, 7)); // small font

            int textY = (labelHeight / 2) + 10;

            // Draw ID (just below barcode)
            g.drawString(id, 2, textY);
            textY += 10;

            // Draw product name
            g.drawString(name, 2, textY);
            textY += 10;

            // Draw price
            g.drawString("Rs. " + price, 2, textY);

            return Printable.PAGE_EXISTS;
        });

        if (job.printDialog()) {
            job.print();
        }
    }
    
    
    
//    public static void printBarcode(String id, String name, double price) throws PrinterException {
//        // 🔹 Change label size to 50mm x 25mm @150DPI (≈295px x 148px)
//        int labelWidth = 295;   // was 120
//        int labelHeight = 100;  // was 60
//
//        BufferedImage barcode = generateBarcode(id, labelWidth, labelHeight / 2);
//
//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setPrintable((g, pf, pageIndex) -> {
//            if (pageIndex > 0) {
//                return Printable.NO_SUCH_PAGE;
//            }
//
//            Graphics2D g2d = (Graphics2D) g;
//            g2d.translate(pf.getImageableX(), pf.getImageableY());
//
//            // Draw barcode (top part)
//            g.drawImage(barcode, 0, 0, labelWidth, labelHeight / 2, null);
//
//            // Draw text (bottom part)
//            g.setFont(new Font("Arial", Font.PLAIN, 10)); // font size adjusted for larger label
//            g.drawString(name, 5, (labelHeight / 2) + 15);
//            g.drawString("Rs. " + price, 5, (labelHeight / 2) + 30);
//
//            return Printable.PAGE_EXISTS;
//        });
//
//        if (job.printDialog()) {
//            job.print();
//        }
//    }
}
