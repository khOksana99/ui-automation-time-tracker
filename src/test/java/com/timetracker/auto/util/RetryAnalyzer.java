package com.timetracker.auto.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private final int MAX_RETRY_COUNT = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            return true;
        }
        return false;
    }
}
