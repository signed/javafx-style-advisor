package com.github.signed.fxstyleadvisor;

import javafx.collections.ObservableList;
import javafx.scene.Node;

public interface HasChildren {
    ObservableList<Node> getChildren();
}
