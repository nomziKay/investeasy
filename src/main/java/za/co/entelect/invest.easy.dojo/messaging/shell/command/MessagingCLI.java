package za.co.entelect.invest.easy.dojo.messaging.shell.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import za.co.entelect.invest.easy.dojo.messaging.service.PublishingService;


@ShellComponent
public class MessagingCLI {

    private PublishingService publishingService;

    public MessagingCLI(PublishingService publishingService) {
        this.publishingService = publishingService;
    }

    @ShellMethod("Sends a text message to the destination queue")
    public void send(
            @ShellOption String textMessage
    ){
        publishingService.publishChanges(textMessage);
    }
}
