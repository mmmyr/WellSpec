package com.bab.backend.service;

import java.sql.Date;

public interface SleepService {

    Date getCreateDate(int uid);

    void createTable(String tableName);

    void insertSleepData(int score, Date date);
}
