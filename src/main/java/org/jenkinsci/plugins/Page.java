package org.jenkinsci.plugins;

import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class Page implements RootAction {

	public String getDisplayName() {

		return "New Page";
	}

	public String getIconFileName() {

		return "Clipboard.png";
	}

	public String getUrlName() {

		return "http://google.com";
	}

}
