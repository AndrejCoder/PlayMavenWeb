package ru.lanit.pages;

import org.apache.wicket.markup.html.WebPage;
import ru.lanit.models.Group;

/**
 * Класс отрисовывает базовую страницу.
 */

/** Wicket class, доступ к странице только под ролью VIEVER. */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    /**
     * Конструктор.
     */
    public HomePage() {
        super();
        GroupPanel groupPanel = new GroupPanel( "groupPanel" );
        add( groupPanel );
    }
}
