package io.github.lordthum.webipmi.page

import com.github.mvysny.karibudsl.v10.*
import com.github.mvysny.karibudsl.v23.tabSheet
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.data.binder.Binder
import com.vaadin.flow.router.*
import io.github.lordthum.webipmi.components.navBar
import io.github.lordthum.webipmi.components.tabs.*
import io.github.lordthum.webipmi.entity.Server
import io.github.lordthum.webipmi.server.ServerService

@Route(value = "server")
@RouteAlias(value = "/server")
@PageTitle("Server")
class ServerDetails(
    serverService: ServerService
) : KComposite() {

    private val root = ui {

        val serverBinder = Binder(Server::class.java)

        verticalLayout {
            setSizeFull()
            alignItems = FlexComponent.Alignment.CENTER
            defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
            style
//                .set("background-color", "rgb(60, 60, 60)")
                .set("padding", "0")
                .set("margin", "0")

            navBar("Server")

            val tabSheet = tabSheet()
            tabSheet.setSizeFull()
            tabSheet.add("Info",ServerInfoTab(serverBinder, serverService.getById(1).get()))
            tabSheet.add("Performance", ServerPerformanceTab())
            tabSheet.add("Power", ServerPowerTab())
            tabSheet.add("Lüfter", ServerFanTab(serverService))
        }
    }

//    override fun setParameter(p0: BeforeEvent?, p1: Server?) {
////        TODO("Not yet implemented")
//
//        if (p1 != null) {
//            println(p1.name)
//        }
//    }
}