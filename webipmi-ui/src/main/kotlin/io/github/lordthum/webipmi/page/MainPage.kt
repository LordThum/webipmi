package io.github.lordthum.webipmi.page

import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.verticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias
import io.github.lordthum.webipmi.components.navBar
import io.github.lordthum.webipmi.components.sensorTextBox

@Route(value = "main")
@RouteAlias(value = "/")
@PageTitle("Home")
class MainPage(

) : KComposite() {

    private val root = ui {

        verticalLayout {
            setSizeFull()
            style
                .set("background-color", "rgb(60, 60, 60)")
                .set("padding", "0")
                .set("margin", "0")

            navBar("HomePage")

//            sensorTextBox("Power Consumption")
        }
    }
}