package net.pushq.soccero.framework;

import net.pushq.soccero.framework.AbstractPage;
import net.pushq.soccero.pages.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Michal on 2014-10-10.
 */
public class Pages {
    List<AbstractPage> pages = new ArrayList<>();

    public void register() {
        pages.add(new LoginPage());
        pages.add(new HomePage());
        pages.add(new RegisterPage());
        pages.add(new GamesPage());
        pages.add(new WinStatPage());
        pages.add(new LemStatPage());

        pages.forEach(p -> p.register());
    }

    public List<String> locators() {
        return pages.
                stream().
                map(page -> page.getLocator()).
                collect(Collectors.toList());
    }

}