package io.github.vozhak.cypressrwae2e;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeDeveloperToolsButton = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement findYourToolsButton = $x("//*[@data-test='main-menu']//*[@data-test='main-submenu-suggestions']//*[@data-test='suggestion-action']");
    public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
}
