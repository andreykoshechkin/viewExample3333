package com.example.viewexample3333;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.router.Route;

@Route("/child")
public class ChildView extends RequestView {

    public ChildView() {
        Checkbox checkbox = new Checkbox("Чек-бокс");
        Button button = new Button("Сохранить и продолжить");

        checkbox.setValue(RequestView.isRemoteStateFlag());

        checkbox.addValueChangeListener(event -> {
            RequestView.setRemoteStateFlag(event.getValue());
        });

        button.addClickListener(event -> {
            UI.getCurrent().getPage().open("/new");
        });

        add(checkbox, button);
    }
}
