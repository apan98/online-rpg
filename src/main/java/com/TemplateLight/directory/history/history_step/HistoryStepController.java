package com.TemplateLight.directory.history.history_step;

import com.TemplateLight.general.directory.Crud;
import com.TemplateLight.general.directory.CrudApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history/step")
public class HistoryStepController extends CrudApi<HistoryStep> {
    public HistoryStepController(Crud<HistoryStep> crud) {
        super(crud);
    }
}
