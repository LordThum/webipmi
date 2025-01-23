package io.github.lordthum.webipmi.page

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias
import io.github.lordthum.webipmi.components.navBar
import io.github.lordthum.webipmi.components.serverGrid
import io.github.lordthum.webipmi.server.ServerService

@Route(value = "servers")
@RouteAlias(value = "/servers")
@PageTitle("Servers")
class ServerList(
    serverService: ServerService
) : KComposite() {

    private val root = ui {

        verticalLayout {
            setSizeFull()
            alignItems = FlexComponent.Alignment.CENTER
            style
                .set("background-color", "rgb(60, 60, 60)")
                .set("padding", "0")
                .set("margin", "0")

            navBar("Servers")

            serverGrid(serverService)

            val text = textField("Drehzahl in %") {
            }

            button("Send") {
                addClickListener {
                    sendCommand(text.value.toInt())
                }
            }
        }
    }

    fun sendCommand(value: Int) {
        val hex = "0x" + "%x".format(value)
        val cmd = "ipmitool -I lanplus -H 192.168.1.54 -U root -P 'Kennwort48' raw 0x30 0x30 0x02 0xff $hex"

        println(cmd)
    }
}