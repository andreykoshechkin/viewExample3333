package com.example.viewexample3333;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Component;


@Component
public class RequestView extends VerticalLayout {

    private static boolean remoteStateFlag = false;

    public static boolean isRemoteStateFlag() {
        return remoteStateFlag;
    }

    public static void setRemoteStateFlag(boolean remoteStateFlag) {
        RequestView.remoteStateFlag = remoteStateFlag;
    }
}
