package org.jenkinsci.plugins;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;

public class NewBuilder extends Builder {
    private long time;

    @DataBoundConstructor
    public NewBuilder(long time) {

        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean perform(Build<?, ?> build, Launcher launcher, BuildListener listener)
            throws InterruptedException, IOException {
        Thread.sleep(time);
        listener.getLogger().println("Sleeping for: " + time + " ms ");
        return true;

    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return aClass == FreeStyleProject.class;
        }

        @Override
        public String getDisplayName() {
            return "Sleep builder";
        }

        public FormValidation doCheckTime(@QueryParameter String time) {
            try {
                if (Long.valueOf(time) < 0) {
                    return FormValidation.error("Please enter a positive number");
                } else {
                    return FormValidation.ok();
                }
            } catch (NumberFormatException e) {
                return FormValidation.error("Please enter a valid number.");

            }

        }

    }

}
