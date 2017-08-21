package com.company.demo.web.screens;

import com.haulmont.cuba.gui.WindowParam;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Embedded;
import com.haulmont.cuba.gui.components.Embedded.Type;

import javax.inject.Inject;
import java.util.Map;

public class BpmFrameEditor extends AbstractWindow {
    @Inject
    private Embedded bpmModelerEmbedded;

    @WindowParam
    private String modelerUrl;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        bpmModelerEmbedded.setType(Type.BROWSER);
        bpmModelerEmbedded.setRelativeSource(modelerUrl);
    }
}