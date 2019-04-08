package com.TemplateLight.directory.history.history_step;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryStepRepository extends JpaRepository<HistoryStep, Long> {
}
