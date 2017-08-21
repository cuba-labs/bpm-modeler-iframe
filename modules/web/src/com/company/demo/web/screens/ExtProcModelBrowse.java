package com.company.demo.web.screens;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.bpm.entity.ProcModel;
import com.haulmont.bpm.gui.procmodel.ProcModelBrowse;
import com.haulmont.cuba.gui.WindowManager.OpenType;

public class ExtProcModelBrowse extends ProcModelBrowse {
    @Override
    protected void _openModeler(ProcModel procModel) {
        String modelerUrl = "dispatch" + bpmConfig.getModelerUrl() + "?modelId=" +
                procModel.getActModelId() + "&s=" + userSession.getId();

        openWindow("bpm-frame-editor", OpenType.NEW_TAB,
                ParamsMap.of("modelerUrl", modelerUrl));
    }
}