package baseEntitites;

import core.BrowserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

public abstract class BaseStep<T extends BasePage> {

    protected BrowserService browserService;
    protected T page;
    private final Class<T> pageClass;

    @SuppressWarnings("unchecked")
    public BaseStep(BrowserService browserService) {
        this.browserService = browserService;
        this.pageClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.page = getPageInstance();
    }

    public T getPageInstance() {
        if (this.page != null) return this.page;

        if (this.pageClass == null) throw new NoClassDefFoundError("Page class was not defined.");
        T page = null;
        try {
            page = this.pageClass.getConstructor(BrowserService.class).newInstance(this.browserService);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return page;
    }

    public abstract BaseStep<T> openPage();
}
