package io.github.lordthum.webipmi.components

import com.github.mvysny.karibudsl.v10.VaadinDsl
import com.github.mvysny.karibudsl.v10.init
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon

class NavigationButton(
    vaadinIcon: VaadinIcon
) : Button() {

    init {
        val ic = Icon(vaadinIcon)
        ic.color = "white"
        ic.style.setPadding("0")
        icon = ic
    }
}

@VaadinDsl
fun (@VaadinDsl HasComponents).navigationButton(
    vaadinIcon: VaadinIcon
): NavigationButton = init(NavigationButton(vaadinIcon))