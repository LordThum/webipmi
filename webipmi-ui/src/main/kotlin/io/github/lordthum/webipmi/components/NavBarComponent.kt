package io.github.lordthum.webipmi.components

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout

class NavBarComponent(header: String) : VerticalLayout() {

    init {
        setWidthFull()
        alignItems = FlexComponent.Alignment.CENTER
        style
            .set("background-color", "rgb(15, 66, 106)")
            .set("flex-direction", "row")
//                .set("padding", "0")
//                .set("margin", "0")

        navigationButton(VaadinIcon.HOME)
        navigationButton(VaadinIcon.WRENCH)

        h1(header) {
            style.set("color", "white")
        }
    }
}

@VaadinDsl
fun (@VaadinDsl HasComponents).navBar(
    header: String
): NavBarComponent = init(NavBarComponent(header))