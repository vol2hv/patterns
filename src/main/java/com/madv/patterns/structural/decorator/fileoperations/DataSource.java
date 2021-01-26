package com.madv.patterns.structural.decorator.fileoperations;

public interface DataSource {
    void writeData(String data);

    String readData();
}
