package io.github.lordthum.webipmi.components

import com.github.mvysny.karibudsl.v10.VaadinDsl
import com.github.mvysny.karibudsl.v10.grid
import com.github.mvysny.karibudsl.v10.init
import com.github.mvysny.kaributools.navigateTo
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import io.github.lordthum.webipmi.entity.Server
import io.github.lordthum.webipmi.page.ServerDetails
import io.github.lordthum.webipmi.server.ServerService

class ServerGrid(serverService: ServerService) : VerticalLayout() {

    init {
        width = "85%"
        alignItems = FlexComponent.Alignment.CENTER
        style
            .set("background-color", "rgb(60, 60, 60)")
            .set("color", "white")

        grid<Server> {
            addColumn(Server::id).setHeader("ID")
            addColumn(Server::name).setHeader("Name")
            addColumn(Server::ip).setHeader("IP Adresse")
            setItems(serverService.getAllServers())

            addItemDoubleClickListener {
//                navigateTo(ServerDetails::class, it.item)
//                ui.get().navigate(ServerDetails::class.java, it.item)
            }
        }
    }
}

@VaadinDsl
fun (@VaadinDsl HasComponents).serverGrid(
    serverService: ServerService
): ServerGrid = init(ServerGrid(serverService))