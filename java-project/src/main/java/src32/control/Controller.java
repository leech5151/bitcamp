
package src32.control;

public interface Controller {
	void execute();
	default void destroy() {}
	default void init() {}
}
