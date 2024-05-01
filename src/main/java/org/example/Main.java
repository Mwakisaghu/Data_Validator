package org.example;

import excel.reader.ExcelReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "";

        ExcelReader excelReader = new ExcelReader();

        excelReader.readExcelFile(filePath);
    }
}