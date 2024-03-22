package com.larrykin343.webank.Models;

import com.larrykin343.webank.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    private Model(){
        this.viewFactory =new ViewFactory();
    }
    public static synchronized Model gerInstance(){
        if(model==null);{
            model =new Model();
        }
        return null;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
