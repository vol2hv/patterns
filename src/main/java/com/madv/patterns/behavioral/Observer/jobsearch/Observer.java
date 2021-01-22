package com.madv.patterns.behavioral.Observer.jobsearch;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);
}
