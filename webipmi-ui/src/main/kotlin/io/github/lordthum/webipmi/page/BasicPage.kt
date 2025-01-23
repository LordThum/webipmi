package io.github.lordthum.webipmi.page

import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.verticalLayout
import io.github.lordthum.webipmi.components.navBar

open class BasicPage(title: String) : KComposite() {

    var root = ui {

        verticalLayout {
            setSizeFull()
            style
                .set("background-color", "rgb(60, 60, 60)")
                .set("padding", "0")
                .set("margin", "0")

            navBar(title)
        }
    }
}