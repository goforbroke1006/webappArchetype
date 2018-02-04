package ${groupId}.web.page;

import ${groupId}.domain.User;
import ${groupId}.web.panel.AnonActionsPanel;
import ${groupId}.web.panel.UserActionsPanel;
import ${groupId}.web.security.SimpleAuthenticationSession;
import org.apache.wicket.markup.html.WebPage;

public abstract class BasePage extends WebPage {

    public BasePage() {
        if (getUser() != null)
            add(new UserActionsPanel("userPanel"));
        else
            add(new AnonActionsPanel("userPanel"));
    }

    static User getUser() {
        return ((SimpleAuthenticationSession) SimpleAuthenticationSession.get()).getUser();
    }

}
