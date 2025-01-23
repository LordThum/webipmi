package io.github.lordthum.webipmi.components

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.TextField

class SensorTextBox(label: String) : VerticalLayout() {

    var textField : TextField

    init {
        setWidthFull()
        alignItems = FlexComponent.Alignment.CENTER
//        justifyContentMode = FlexComponent.JustifyContentMode.CENTER
        style
            .set("flex-direction", "row")

        nativeLabel("$label:")
        textField = textField{
            isReadOnly = true
            style.set("color", "white")
        }
    }
}

@VaadinDsl
fun (@VaadinDsl HasComponents).sensorTextBox(
    label: String
): SensorTextBox = init(SensorTextBox(label))