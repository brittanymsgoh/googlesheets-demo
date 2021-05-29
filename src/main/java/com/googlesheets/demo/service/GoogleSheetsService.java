package com.googlesheets.demo.service;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface GoogleSheetsService {
    void getSpreadsheetValues() throws IOException, GeneralSecurityException;
}
