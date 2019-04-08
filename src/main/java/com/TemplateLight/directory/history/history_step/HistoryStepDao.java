package com.TemplateLight.directory.history.history_step;

import com.TemplateLight.general.directory.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryStepDao extends Dao<HistoryStep> {
    public HistoryStepDao(HistoryStepRepository jpaRepository) {
        super(jpaRepository);
    }
}
