package java100.app.src38_40.control;

public interface Controller {
    void execute(Request request, Response response);
    default void init() {}
    default void destroy() {}
}








