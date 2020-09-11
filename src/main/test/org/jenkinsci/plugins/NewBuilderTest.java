package org.jenkinsci.plugins;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import hudson.model.FreeStyleBuild;
import hudson.model.FreeStyleProject;

public class NewBuilderTest {

    @Rule
    public JenkinsRule r = new JenkinsRule();

    @Test
    public void checkSleepOutput() throws Exception {
        long time = 12;
        NewBuilder builder = new NewBuilder(time);
        FreeStyleProject p = r.createFreeStyleProject();
        p.getBuildersList().add(builder);

        FreeStyleBuild freeStyleBuild = p.scheduleBuild2(0).get();

        assertTrue(freeStyleBuild.getLog().contains("Sleeping for: " + time + " ms "));

    }

}
