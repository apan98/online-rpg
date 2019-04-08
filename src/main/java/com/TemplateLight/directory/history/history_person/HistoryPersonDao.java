package com.TemplateLight.directory.history.history_person;

import com.TemplateLight.general.directory.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryPersonDao extends Dao<HistoryPerson> {

    @Autowired
    public HistoryPersonDao(HistoryPersonRepository historyPersonRepository) {
        super(historyPersonRepository);
    }
}
