package com.example.viewexample3333;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;

@Route("/new")
public class NewView extends RequestView{

    public NewView() {
        Grid<String> grid = new Grid<>();
        grid.addColumn(String::toString).setHeader("State");
        grid.setItems(String.valueOf(RequestView.isRemoteStateFlag()));

        grid.getDataProvider().refreshAll();
        add(grid);
    }
}
