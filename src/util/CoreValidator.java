package util;

import java.time.LocalDateTime;

public class CoreValidator {

    // Product name: not null, letters/numbers/spaces only, max 40 chars
    public static boolean productName(String name) {
        return name != null && name.trim().matches("[A-Za-z0-9 ]+");
    }

    // Product id: not null,
    public static boolean id(int id) {
        return id != 0;
    }

    /*
     * 2025-06-30 |
     * check all id are int |
     * parameters id |
     * return boolean |
     * is id int match length return true |
     */
    public static boolean ids(String id) {
        return id.matches("\\d{8}");
    }

    // Price: must be greater than 0
    public static boolean price(double price) {
        return price > 0;
    }

    public static boolean price(String input) {
        return input.matches("^[+]?(\\d*\\.?\\d+)$") && Double.parseDouble(input) > 0;
    }

    // Discount: 0 to 100 inclusive
    public static boolean discount(double discount) {
        return discount >= 0 && discount <= 100;
    }

    // Quantity: integer ≥ 0
    public static boolean quantity(int quantity) {
        return quantity >= 0;
    }

    // Barcode: alphanumeric, max 30 chars
    public static boolean barcode(String barcode) {
        return barcode != null && barcode.matches("[A-Za-z0-9]+") && barcode.length() <= 30;
    }

    // Phone number (Sri Lanka): 07Xxxxxxxx where X is 0,1,2,4,5,6,7,8
    public static boolean phoneNumber(String phone) {
        return phone != null && phone.matches("^07[01245678][0-9]{7}$");
    }

    // Customer name: letters and spaces only, max 50 chars
    public static boolean customerName(String name) {
        return name != null && name.trim().matches("[A-Za-z ]+") && name.length() <= 50;
    }

    // Payment method: must be one of these
    public static boolean paymentMethod(String method) {
        return method != null && (method.equalsIgnoreCase("cash")
                || method.equalsIgnoreCase("card")
                || method.equalsIgnoreCase("online")
                || method.equalsIgnoreCase("credit"));
    }

    // Unit: must be one of these
    public static boolean unit(String unit) {
        return unit != null && (unit.equalsIgnoreCase("pcs")
                || unit.equalsIgnoreCase("kg")
                || unit.equalsIgnoreCase("l"));
    }

    // Username: 3-20 chars, alphanumeric and underscore only
    public static boolean username(String username) {
        return username != null && username.matches("^[a-zA-Z0-9_]{3,20}$");
    }

    // Password: at least 6 characters
    public static boolean password(String password) {
        return password != null && password.length() >= 6;
    }

    //2025.06.26
    // Sale ID: must be positive integer
    public static boolean saleId(int id) {
        return id > 0;
    }

    // Sale Date: not null and not in the future
    public static boolean saleDate(LocalDateTime date) {
        return date != null && !date.isAfter(LocalDateTime.now());
    }

    // Customer NIC: allows null (anonymous sales), otherwise valid format
    public static boolean customerNic(String nic) {
        if (nic == null) {
            return true; // Anonymous sale allowed
        }
        String trimmed = nic.trim();
        // Validates both old (10 digits) and new (12 digits) NIC formats
        return !trimmed.isEmpty()
                && (trimmed.matches("\\d{9}[VXvx]")
                || // Old format
                trimmed.matches("\\d{12}"));       // New format
    }

    public static boolean looseQty(String kg, String g) {

        if (kg.isEmpty() && g.isEmpty()) {
            Message.warning("Please enter at least one quantity (kg or g).", "Missing Quantity");
            return false;
        }

        if (!kg.isEmpty() && !kg.matches("\\d+")) {
            Message.warning("Kilograms must be a valid whole number.", "Invalid Kilogram Input");
            return false;
        }

        if (!g.isEmpty()) {
            if (!g.matches("\\d{3}")) {
                Message.warning("Grams must be a 3-digit number (e.g., 050, 250).", "Invalid Gram Input");
                return false;
            }
        }

        int kgVal = kg.isEmpty() ? 0 : Integer.parseInt(kg);
        int gVal = g.isEmpty() ? 0 : Integer.parseInt(g);

        // Total must not be zero
        if (kgVal == 0 && gVal == 0) {
            Message.warning("Total quantity cannot be zero.", "Invalid Quantity");
            return false;
        }

        return true;
    }

    public static boolean packQty(String qty) {
        if (qty == null || qty.trim().isEmpty()) {
            Message.warning("Quantity is required.", "Missing Quantity");
            return false;
        }

        if (!qty.matches("\\d+")) {
            Message.warning("Quantity must be a valid whole number.", "Invalid Quantity");
            return false;
        }

        if (Integer.parseInt(qty) == 0) {
            Message.warning("Quantity cannot be zero.", "Invalid Quantity");
            return false;
        }

        return true;
    }

}
