// CHECKSTYLE:OFF
import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code NewBuilder.DisplayName}: {@code Sleep Builder}.
     * 
     * @return
     *     {@code Sleep Builder}
     */
    public static String NewBuilder_DisplayName() {
        return holder.format("NewBuilder.DisplayName");
    }

    /**
     * Key {@code NewBuilder.DisplayName}: {@code Sleep Builder}.
     * 
     * @return
     *     {@code Sleep Builder}
     */
    public static Localizable _NewBuilder_DisplayName() {
        return new Localizable(holder, "NewBuilder.DisplayName");
    }

}
