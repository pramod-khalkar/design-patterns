package org.patterns.behavioral.command.ex1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 18/11/21
 * Time: 3:21 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class MenuOption {

    private final Map<String, Action> actionsMap = new HashMap<>();

    public MenuOption(Action... actions) {
        Arrays.stream(actions).forEach(this::addToMap);
    }

    private void addToMap(Action action) {
        if (action instanceof OpenAction) {
            actionsMap.put("open", action);
        } else if (action instanceof CloseAction) {
            actionsMap.put("close", action);
        } else if (action instanceof SaveAction) {
            actionsMap.put("save", action);
        }
    }

    public void open() {
        execute(this.actionsMap.get("open"));
    }

    public void save() {
        execute(this.actionsMap.get("save"));
    }

    public void close() {
        execute(this.actionsMap.get("close"));
    }

    private void execute(Action action) {
        if (action != null) {
            action.execute();
        }
    }
}
