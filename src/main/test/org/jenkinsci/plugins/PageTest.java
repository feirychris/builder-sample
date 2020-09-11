package org.jenkinsci.plugins;

import static org.junit.Assert.assertTrue;

import org.jenkinsci.plugins.Page;
import org.junit.Test;

import hudson.model.RootAction;

public class PageTest {

    @Test
    public void testGetDisplayName() {
        RootAction test = new Page();

        assertTrue("C'est le bon display name", test.getDisplayName() == "New Page");

    }

    @Test
    public void testGetIconFileName() {
        RootAction test = new Page();
        assertTrue("C'est la bonne icône", test.getIconFileName() == "Clipboard.png");

    }

    @Test
    public void testGetUrlName() {
        RootAction test = new Page();

        assertTrue("C'est la bonne URL", test.getUrlName() == "http://google.com");

    }

}
