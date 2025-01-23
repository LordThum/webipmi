package io.github.lordthum.webipmi.components.base

import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout

open class BasicTab : VerticalLayout() {

    init {
        width = "75%"
        justifyContentMode = FlexComponent.JustifyContentMode.CENTER
        style.set("justify-self", "center")
    }
}